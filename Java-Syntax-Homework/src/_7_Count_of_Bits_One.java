import java.util.Locale;
import java.util.Scanner;


public class _7_Count_of_Bits_One {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int count = 0;
		while (number > 0) {
			if ((number & 1) == 1) {
				count++;
			}
			number = number >> 1;
		}
		System.out.println(count);
	}
}
