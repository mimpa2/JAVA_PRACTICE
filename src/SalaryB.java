import java.util.Scanner;
public class SalaryB {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		float salary = sc.nextFloat();
		float value = sc.nextFloat();
		 
		
		double Total = (salary + value * 0.15); 
		
		System.out.printf("TOTAL = R$ %.2f\n " ,Total);
		
		
		
		
	}

}
