package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class dbTest7Ex {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties properties = new Properties();
	
	public dbTest7Ex() {
		dbLoad();
		showJikwon();
	}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("c:/work/git연습/java_source/java_normal/src/pack1/DBinfo.properties"));
			Class.forName(properties.getProperty("driver"));
		} catch (Exception e) {
			System.out.println("loading fail : " + e);
			System.exit(0);
		}
	}
	
	private void showJikwon() {
		try {
			conn = DriverManager.getConnection(
					properties.getProperty("url"),
					properties.getProperty("user"),
					properties.getProperty("passwd")
			);
			
			Scanner scanner = new Scanner(System.in);
			
			String sql = "select jikwonname as 직원명, busername as 부서명, buserloc as 근무지역, jikwonjik as 직급, gogekname as 고객명, gogektel as 고객전화,";
			sql = sql.concat(" timestampdiff(year, str_to_date(substr(gogekjumin, 1, 6), '%y%m%d'), now()) as 나이 from jikwon");
			sql = sql.concat(" left join buser on buserno = busernum");
			sql = sql.concat(" left join gogek on jikwonno = gogekdamsano");
			sql = sql.concat(" where busername = (select busername from jikwon left join buser on buserno = busernum where jikwonno = ? and jikwonname = ?)");
			
			pstmt = conn.prepareStatement(sql);
			
			System.out.print("직원 번호 : ");
			String jikwonno = scanner.next();
			pstmt.setString(1, jikwonno);
			
			System.out.print("직원명 : ");
			String jikwonname = scanner.next();
			pstmt.setString(2, jikwonname);
			
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				System.out.println("작업 종료");
				System.exit(0);
			}
			
			System.out.println("직원명\t부서명\t근무지역\t직급\t고객명\t고객전화\t고객나이");
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" + rs.getString(7));
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" + rs.getString(7));
			}
			
			sql = "select round(avg(nvl(jikwonpay, 0)), 1) from jikwon";
			sql = sql.concat(" left join buser on buserno = busernum");
			sql = sql.concat(" where busername = (select busername from jikwon left join buser on buserno = busernum where jikwonno = ? and jikwonname = ?)");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, jikwonno);
			pstmt.setString(2, jikwonname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			scanner.close();
		} catch (Exception e) {
			System.out.println("showJikwon err : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e2) {}
			
		}
	}
	
	public static void main(String[] args) {
		new dbTest7Ex();
	}
}
