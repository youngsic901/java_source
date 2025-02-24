package pack3lambda;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.function.Consumer;

public class MyLambda5db {
	private Properties properties = new Properties();
	
	public MyLambda5db() {
		try{
			properties.load(new FileInputStream("c:/work/git연습/java_source/java_normal/src/pack1/DBinfo.properties"));
			Class.forName(properties.getProperty("driver"));
		} catch (Exception e) {
			System.out.println("로딩 실패 : " + e);
		}
		
		System.out.println("처리1");
		String sql = "select * from sangdata";
		queryDb(sql, rs -> {
			try {
				System.out.println("처리3");
				while(rs.next()) {
					System.out.println(
							rs.getString("code") + " " +
							rs.getString("sang") + " " +
							rs.getString("su") + " " + 
							rs.getString("dan")
					);
				}
			} catch (Exception e) {
				System.out.println("err : " + e);
			}
		});
	}
	
	private void queryDb(String sql, Consumer<ResultSet> consumer) {
		// try - with - resources 문법 사용
		try(
				Connection conn = DriverManager.getConnection(
						properties.getProperty("url"),
						properties.getProperty("user"),
						properties.getProperty("passwd")
				);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			System.out.println("처리2");
			consumer.accept(rs);
			System.out.println("처리4");
		} catch (Exception e) {
			System.out.println("queryDb err : " + e);
		}
	}
	
	public static void main(String[] args) {
		new MyLambda5db();
	}
}
