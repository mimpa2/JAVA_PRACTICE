import java.util.Scanner;
public class Ave3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		float MEDIA = (float)(A/10 * 2) + (B/10 * 3) + (C/10 * 5);
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		
		
	}

}