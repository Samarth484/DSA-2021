package DSAYear2021;

import java.util.Scanner;

public class PalindromePartitions {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Enter the String");
//		String str=scn.nextLine();
		String str = "nitin";
		palindromicPartitions(str, "");
	}

	static int count = 0;

	private static void palindromicPartitions(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(++count + "  " + ans);

			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			String roq = ques.substring(i + 1);
			String leftPart = ques.substring(0, i + 1);
			if (isPalindrome(leftPart))
				palindromicPartitions(roq, ans + leftPart + " ");

		}
	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i <= j)
			if (str.charAt(i++) != str.charAt(j--))
				return false;
		return true;
	}

}
