package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

// PrepareStatement : 선 처리 방식
// 동일한 sql문을 여러 클라이언트가 빈번하게 사용할 경우 효과적 (웹 프로그래밍)
// ?연산자를 사용함으로 해서 보안을 강화하고 가독성을 향상시킬 수 있다.
public class DbTest4Prepare {
	private Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	private Properties properties = new Properties();
	
	DbTest4Prepare(){
		returnConnection();
	}
	
	private void returnConnection() {
		try {
			if(conn == null || conn.isClosed()) {
				properties.load(new FileInputStream("c:/work/git연습/java_source/java_normal/src/pack1/DBinfo.properties"));
				Class.forName(properties.getProperty("driver"));
				conn = DriverManager.getConnection(
						properties.getProperty("url"),
						properties.getProperty("user"),
						properties.getProperty("passwd")
				);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void closeConnection() {
		try {
			if(rs != null) conn.close();
			if(pstmt != null) conn.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
//			System.exit(0); // 프로그램 강제 종료
		}
	}
	
	private void dbRead() {
		// 전체 자료 읽기
		String sql = "select * from sangdata";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
			String co = "2";
//			sql = "select * from sangdata where code=" + co; // secure coding 가이드에 위배
			sql = "select * from sangdata where code=?"; // ? 연산자를 사용
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, co); // 첫 번째 ?연산자에 co 변수 값을 연결(매핑)
			
			rs = pstmt.executeQuery();
			if(rs.next()) { // 출력할 값이 하나면 if문 사용
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		} catch(Exception e) {
			System.out.println("dbProcess err : " + e);
			e.printStackTrace();
		}
	}
	
	private void dbInsert() {
		// 자료 추가
		try {
			String isql = "insert into sangdata values(?,?,?,?)";
			pstmt = conn.prepareStatement(isql);
			pstmt.setString(1, "5");
			pstmt.setString(2, "카페라떼");
			pstmt.setString(3, "6");
			pstmt.setString(4, "6000");
			
			int re = pstmt.executeUpdate();
			if(re == 1) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
		} catch(Exception e) {
			System.out.println("dbInsert err : " + e);
			e.printStackTrace();
		}
	}
	
	private void dbUpdate() {
		// 자료 수정
		try {
			String usql = "update sangdata set sang=?, su=?, dan=? where code=?";
			pstmt = conn.prepareStatement(usql);
			pstmt.setString(1, "초코모카");
			pstmt.setInt(2, 11);
			pstmt.setInt(3, 5500);
			pstmt.setInt(4, 5);
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch(Exception e) {
			System.out.println("dbInsert err : " + e);
			e.printStackTrace();
		}
	}
	
	private void dbDelete() {
		// 자료 수정
		try {
			String dsql = "delete from sangdata where code=?";
			pstmt = conn.prepareStatement(dsql);
			pstmt.setString(1, "5");
			
			if(pstmt.executeUpdate() > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch(Exception e) {
			System.out.println("dbInsert err : " + e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DbTest4Prepare testInstance = new DbTest4Prepare();
		testInstance.dbDelete();
		testInstance.dbRead();
		testInstance.closeConnection();
	}
}
