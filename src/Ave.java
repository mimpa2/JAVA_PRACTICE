import java.util.Scanner;
public class Ave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		
		float MEDIA = (float)(((A*3.5)+(B*7.5))/(3.5+7.5)); 
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		
		
		

	}

}
