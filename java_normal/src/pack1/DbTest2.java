package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest2 {
	private Connection conn= null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public DbTest2() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(Exception e) {
			System.out.println("로딩 실패 : " + e);
			return;
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
		} catch(Exception e) {
			System.out.println("연결 실패 : " + e);
			return;
		}

		try {
			stmt = conn.createStatement();
			String sql = "select jikwonno as 직원번호, jikwonname as 직원명, jikwonjik as 직급, busername as 부서명 from jikwon";
			sql += " left join buser on busernum = buserno";
			sql += " where jikwonjik in('사원','대리');";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			sql = "select count(jikwonno) from jikwon";
			sql += " left join buser on busernum = buserno";
			sql += " where jikwonjik in('사원','대리');";
			rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println("인원수 : " + rs.getInt(1));
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
		new DbTest2();
	}
}
