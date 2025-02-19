package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest1 {
	private Connection conn = null; // DBMS와 연결
	private Statement stmt = null; // SQL문 실행 지원
	private ResultSet rs = null; // select의 결과에 접근 가능
	
	public DbTest1() {
		// java 는 외부장치와 연결할때 예외처리를 반드시 해야함
		try {
			// 1) JDBC 업체가 제공하는 Driver 파일 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (Exception e) {
			System.out.println("로딩 실패 : " + e.getMessage());
			return;
		}
		
		try {
			// 2) DB 서버와 연결
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123"); // DriverManager로 Connection 객체를 얻는다.
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
			return;
		}
		
		try {
			// 3) SQL문 실행 : select로 자료 읽기
			stmt = conn.createStatement(); // Connection 객체 기반으로 Statement 객체 생성
//			String sql = "select * from sangdata;";
			String sql = "select code, sang, su, dan as 단가 from sangdata;";
			rs = stmt.executeQuery(sql); // Statement 객체가 DB에 요청해 결과를 ResultSet에 저장
//			rs.next(); // record pointer 이동 명령 - pointer가 가리키고 있는 레코드만 참조가능
			while(rs.next()) { // 자료가 있는 동안 반복
				String code = rs.getString("code");
				String sangpum = rs.getString("sang");
				int su = rs.getInt(3); // 칼럼의 순서(index)로도 접근 가능하다.
				int dan = rs.getInt("단가"); // 칼럼의 별명으로 조회해야 한다.
				System.out.println(code + "\t" + sangpum + "\t" + su + "\t" + dan);
			}
			
			sql = "select count(*) as cou from sangdata;";
			rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println("건수 : " + rs.getInt(1));
			System.out.println("건수 : " + rs.getInt("cou"));
		} catch(Exception e) {
			System.out.println("처리 실패 : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		new DbTest1();
	}
}
