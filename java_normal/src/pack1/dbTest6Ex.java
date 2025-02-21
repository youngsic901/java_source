package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class dbTest6Ex {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties properties = new Properties();
	
	public dbTest6Ex() {
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
			
			String sql = "select jikwonno, jikwonname, busername, jikwonjik, jikwongen from jikwon left join buser on buserno = busernum where jikwonjik=?";
			System.out.print("직급 입력 : ");
			
			pstmt = conn.prepareStatement(sql);
			String jikwonjik = scanner.next();
			if(!jikwonjik.equals("사원") && !jikwonjik.equals("이사") && !jikwonjik.equals("부장") && !jikwonjik.equals("과장") && !jikwonjik.equals("대리")) {
				System.out.println("입력자료가 틀렸어요");
				System.exit(0);
			} else {
				pstmt.setString(1, jikwonjik);
			}
			
			rs = pstmt.executeQuery();
			
			System.out.println("직원번호\t직원명\t부서명\t직급\t성별");
			
			int count = 0;
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5));
				count++;
			}
			System.out.println("인원 수 : " + count);
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
		new dbTest6Ex();
	}
}
