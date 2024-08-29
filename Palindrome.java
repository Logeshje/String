package String;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String original = scan.nextLine();
		StringBuilder Reverse = new StringBuilder(original);
		String Duplicate = Reverse.reverse().toString();
		if(original.equals(Duplicate)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}