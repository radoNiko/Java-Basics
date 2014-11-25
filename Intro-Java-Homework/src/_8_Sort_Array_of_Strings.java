import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class _8_Sort_Array_of_Strings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		input.nextLine();
		String[] strArray = new String[n];
		TreeSet<String> setOfStrings = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string: ");
			strArray[i] = input.nextLine();
		}
		
		Arrays.sort(strArray); //sort array alphabetical
		//print array
		for (String item : strArray) {
			System.out.println(item);
		}
		
		//TreeSet is sorted by default
		for (int i = 0; i < strArray.length; i++) {
			System.out.print("Enter string: ");
			setOfStrings.add(input.nextLine());
		}
		//print TreeSet
		for (String item : strArray) {
			System.out.println(item);
		}
		
	}

}
