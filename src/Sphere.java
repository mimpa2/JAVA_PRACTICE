import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		

	float pi = (float) 3.14159;
	
		
	Scanner sc = new Scanner(System.in);
	double R = sc.nextDouble();
	
	double volume =  (double) ((4/3.00) * pi * (R*R*R));
		
System.out.printf("VOLUME = %.3f\n", volume);		
		
		
		
	}

}
