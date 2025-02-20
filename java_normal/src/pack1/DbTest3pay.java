package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbTest3pay {
	private Connection conn = null;
	private Properties properties = new Properties();
	
	DbTest3pay() {
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
	
	private void printPay() {
		String sqlSelect = "select jikwonjik, sum(jikwonpay), avg(jikwonpay) from jikwon";
		sqlSelect += " where jikwonpay is not null";
		sqlSelect += " group by jikwonjik";
		sqlSelect += " having jikwonjik <> '이사' and jikwonjik <> '부장'";

		try( 
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlSelect);
		) {

			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void closeConnection() {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DbTest3pay testInstance = new DbTest3pay();
		testInstance.printPay();
		testInstance.closeConnection();
	}
}
