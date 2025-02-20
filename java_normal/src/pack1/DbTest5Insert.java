package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

// 키보드로 반복해서 sangdata 테이블에 자료 입력
// 입력이 끝나면 자료 전체 출력
public class DbTest5Insert {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties properties = new Properties();
	
	public DbTest5Insert() {
		
		dbLoad();
		insertData();
		showData();
	}
	
	private void dbLoad() {
		try {
			properties.load(new FileInputStream("c:/work/git연습/java_source/java_normal/src/pack1/DBinfo.properties"));
			Class.forName(properties.getProperty("driver"));
		} catch(Exception e) {
			System.out.println("loading fail : " + e);
			System.exit(0);
		}
	}
	
	// insert, update, delete, select를 각각의 메소드에서 별도로 진행할 때는 각 메소드 별로 db를 연결한 후 처리가 끝나면 닫아준다.
	private void insertData() {
		try {
			conn = DriverManager.getConnection(
					properties.getProperty("url"),
					properties.getProperty("user"),
					properties.getProperty("passwd")
			);
			//입력 반복
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.print("코드 입력 : ");
				String code = scanner.next();
				System.out.print("상품명 입력 : ");
				String sang = scanner.next();
				System.out.print("수량 입력 : ");
				String su = scanner.next();
				System.out.print("단가 입력 : ");
				String dan = scanner.next();
				
				// 입력자료 오류 검사는 생략
				pstmt = conn.prepareStatement("insert into sangdata values(?,?,?,?)");
				pstmt.setString(1, code);
				pstmt.setString(2, sang);
				pstmt.setString(3, su);
				pstmt.setString(4, dan);
				pstmt.executeUpdate(); // 추가됨
				
				System.out.print("계속할까요?(y/n)");
				String yn = scanner.next();
				if(yn.equals("n")) break;
			}
			
			scanner.close();
		} catch (Exception e) {
			System.out.println("insertData err : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e2) {}
		}
	}
	
	private void showData() {
		try {
			conn = DriverManager.getConnection(
					properties.getProperty("url"),
					properties.getProperty("user"),
					properties.getProperty("passwd")
			);
			
			pstmt = conn.prepareStatement("select * from sangdata");
			rs = pstmt.executeQuery();
			
			int cou = 0;
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
				cou++;
			}
			System.out.println("전체 건수 : " + cou);
		} catch (Exception e) {
			System.out.println("showData err : " + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		new DbTest5Insert();
	}
}
