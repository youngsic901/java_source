package pack5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ex38EmployeeMainMultiArray {
	private ArrayList<Ex38Employee> list = new ArrayList<Ex38Employee>();
	
	public void insertData(String[][] arr) {
		
		for(String[] i: arr) {
			int num = Integer.parseInt(i[0]);
			int pay = Integer.parseInt(i[2]);
			int year = Integer.parseInt(i[3]);
			String name = i[1];
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
		String[][] arr = {
				{"1", "강나루", "1500000", "2015"},
				{"2", "홍길동", "1800000", "2019"},
				{"3", "김인호", "2000000", "2023"}
		};
		
		Ex38EmployeeMainMultiArray test = new Ex38EmployeeMainMultiArray();
		test.insertData(arr);
		test.showData();
	}
}
