import java.util.Scanner;


public class _6_Sum_Two_Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.print("Enter b: ");
		int b = scan.nextInt();
		System.out.println("Sum of two numbers is: " + (a+b));
		
		System.out.print("Enter two numbers in one line: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Sum of two numbers is: " + (a+b));
	}

}
