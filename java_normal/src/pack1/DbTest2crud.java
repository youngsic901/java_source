package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbTest2crud {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private Properties properties = new Properties(); // ***.properties 읽기용
	
	public DbTest2crud() {
		try {
			// 보안을 목적으로 연결정보를 별도의 파일로 저장 후 읽기 - secure coding 가이드 라인을 따름
			properties.load(new FileInputStream("c:/work/git연습/java_source/java_normal/src/pack1/DBinfo.properties"));
			
			Class.forName(properties.getProperty("driver"));
			
			conn = DriverManager.getConnection(
					properties.getProperty("url"),
					properties.getProperty("user"),
					properties.getProperty("passwd")
			);
			
			dbProcess();
			
			System.out.println("프로그램 종료");
		} catch(Exception e) {
			System.out.println("처리 오류 : " + e);
			e.printStackTrace(); // 에러메세지는 이렇게 작성할 수도 있다.
		} finally {
			try {
//				if(rs != null) rs.close();
//				if(stmt != null) stmt.close();
//				if(conn != null) conn.close();
			} catch(Exception e2) {}
		}
	}
	
	private void dbProcess() {
		try {
			stmt = conn.createStatement();
			
			/* conn.setAutoCommit(false); // Transaction 수동
			// insert, update, delete 등의 작업을 한다.  Transaction 시작
			// commit or rollback으로 Transaction 종료
			conn.setAutoCommit(true);
			*/
			
			// 참고 : insert, update, delete는 성공하면 성공한 레코드 수, 실패하면 0을 반환
			// 자료 추가 -- Auto commit (Transaction)
//			 String sqlinsert = "insert into sangdata values(5, '새우깡', 2, 1000)";
//			 stmt.executeUpdate(sqlinsert) // select 의외의 SQL은 executeUpdate 사용
			
			// 자료 수정
//			String sqlupdate = "update sangdata set sang='허니칩', su=17 where code=5";
//			System.out.println("업데이트 결과 : " + stmt.executeUpdate(sqlupdate));
//			if(stmt.executeUpdate(sqlupdate) > 0) {
//				System.out.println("수정 성공");
//			}else {
//				System.out.println("수정 실패");
//			}
			
			// 자료 삭제
			String sqlDelete = "delete from sangdata where code=5";
			if(stmt.executeUpdate(sqlDelete) > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			
			// 자료 읽기
			String sqlselect = "select * from sangdata";
			rs = stmt.executeQuery(sqlselect);
			int cou = 0;
			while(rs.next()) {
				System.out.println(rs.getString("code") + " " + rs.getString("sang") + " " + rs.getString("su") + " " + rs.getString("dan"));
				cou++;
			}
			System.out.println("건수 : " + cou);
		} catch(Exception e) {
			System.out.println("dbProcess err : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		new DbTest2crud();
	}
}
