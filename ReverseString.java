package String;

import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scan.nextLine();
		StringBuilder reversed = new StringBuilder(string);
		reversed.replace(0, 0, "kannan");
	}
}