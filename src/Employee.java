import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int employee_num = sc.nextInt();
		
		float salary = sc.nextFloat();
		
		float working_hour = sc.nextFloat();

		
		float month_salary = salary * working_hour;
		
		System.out.printf("NUMBER = \n" +employee_num );
		System.out.printf("SALARY = U$ %.2f",month_salary);

	}
 
}
