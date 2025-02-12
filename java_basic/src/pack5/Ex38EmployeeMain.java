package pack5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex38EmployeeMain {
	private ArrayList<Ex38Employee> list = new ArrayList<Ex38Employee>();
	
	public void insertData(String[] arr) {
		
		for(String i: arr) {
			StringTokenizer tok = new StringTokenizer(i, ",");
			int num = Integer.parseInt(tok.nextToken());
			String name = tok.nextToken();
			int pay = Integer.parseInt(tok.nextToken());
			int year = Integer.parseInt(tok.nextToken());
			Ex38Employee employee = new Ex38Employee(num, pay, year, name);
			list.add(employee);
		}
		
	}
	
	public void showData() {
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		LocalDate today = LocalDate.now();
		for(Ex38Employee dto: list) {
			int employeeYear = today.getYear() - dto.getYear(); // 근무년수
			int workPayment = 0; // 근속수당
			
			if(employeeYear >= 9) { // 근속수당 대입
				workPayment = 1000000;
			} else if(employeeYear >= 4) {
				workPayment = 450000;
			} else {
				workPayment = 150000;
			}
			
			int deductible = (int)((dto.getPay() + workPayment) * 0.05); // 공제액
			int realPay = dto.getPay() + workPayment - deductible; // 수령액
			
			System.out.println(
					dto.getNum() + "\t" + 
					dto.getName()+ "\t" + 
					dto.getPay() + "\t" + 
					employeeYear + "\t" + 
					workPayment + "\t" + 
					deductible + "\t" +
					realPay
			);
		}
	}
	
	public static void main(String[] args){
//		String[][] arr = {
//				{"1", "강나루", "1500000", "2015"},
//				{"2", "홍길동", "1800000", "2019"},
//				{"3", "김인호", "2000000", "2023"}
//		};
		
		String[] arr = new String[3];
		arr[0] = "1,강나루,1500000,2015";
		arr[1] = "2,홍길동,1800000,2019";
		arr[2] = "3,김인호,2000000,2023";
		
		Ex38EmployeeMain test = new Ex38EmployeeMain();
		test.insertData(arr);
		test.showData();
	}
}
