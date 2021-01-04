package DSAYear2021;

import java.util.Scanner;

public class ValidParenthesis {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//System.out.println("Enter the value of n");
//int n=scn.nextInt();
		int n = 3;
		validParen(n, 0, 0, "");
	}

//op is for opening parenthesis and cp for closing parenthesis
	private static void validParen(int n, int op, int cp, String ans) {
		if (op == n && cp == n) {
			System.out.println(ans);
			return;
		}
		if (op > n || cp > n || cp > op)
			return;
		validParen(n, op + 1, cp, ans + "(");
		validParen(n, op, cp + 1, ans + ")");
	}

}
