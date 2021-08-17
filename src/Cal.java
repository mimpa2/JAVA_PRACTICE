import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		int code1 = sc.nextInt();
		int num1 = sc.nextInt();
		float price1 =sc.nextFloat();
		
		
		int code2 = sc.nextInt();
		int num2 = sc.nextInt();
		float price2 =sc.nextFloat();
		
		float product1 =  num1 * price1;
		float product2 =  num2 * price2;
		
		float total = product1 + product2;
		
		System.out.printf("Valor a pagar: R$ %.2f" , total );
		
		
	}

}
