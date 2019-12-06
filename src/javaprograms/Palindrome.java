package javaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String original = sc.nextLine();
		String reverse ="";
		for(int i=original.length()-1;i>=0;i--) {
			char ch = original.charAt(i);
			reverse =reverse+ch;
		}
		System.out.println(reverse);
		

	}

}
