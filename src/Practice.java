import java.util.Scanner;


public class Practice {

	public static void main(String[] args) {
		 Scanner Number = new Scanner(System.in);
		 int num= Number.nextInt();
		 for( int i=1;i<=10;i++) {
			 
			 int sum = num*i;
			 System.out.println(num+ "x" +i+ "=" +sum);
			 
		 }

	}

}
