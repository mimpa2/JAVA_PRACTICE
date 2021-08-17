import java.util.Scanner;
public class Day2 {

    public static void main(String[] args) {
 float n = (float) 3.14159;
 float area;
 System.out.println(" Enter the radius : ");
 
 Scanner r = new Scanner(System.in);
float R = (float) r.nextFloat();
 
 
area= n*R*R; 
System.out.printf("The area : %.4f", area);

    }

}