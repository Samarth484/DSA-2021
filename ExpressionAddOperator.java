package DSAYear2021;

//problem link: https://leetcode.com/problems/expression-add-operators/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpressionAddOperator {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = scn.nextInt();
//		int num = 123;
		System.out.println("Enter the target");
		int tar = scn.nextInt();
//		int tar = 6;

		System.out.println(addOperators("" + num, tar));
	}

	public static List<String> addOperators(String num, int target) {
		List<String> list = new ArrayList<String>();
		addOperators(num, 0, 0, target, "", list);
		return list;

	}

//	private static void addOperators(String num, int idx, int vsf, int target, String expsf, List<String> list) {
//
//		if (idx >= num.length()) {
//			if (vsf == target)
//				list.add(expsf);
//			return;
//		}
//		int num1 = num.charAt(idx) - '0';
//		int num2 = 0;
//		if (!num.substring(idx + 1).equals(""))
//			num2 = Integer.parseInt(num.substring(idx + 1));
//		else {
//			System.out.println("At line 40");
//			return;
//		}
//		vsf = num1 + num2;
//		addOperators(num, idx + 1, vsf, target, expsf + num1 + " + ", list);
//		vsf = num1 - num2;
//		addOperators(num, idx + 1, vsf, target, expsf + num1 + " - ", list);
//		vsf = num1 * num2;
//		addOperators(num, idx + 1, vsf, target, expsf + num1 + " * ", list);
//
//	}
	
//	private static int addOperators(String num, int idx, int vsf, int target, String expsf, List<String> list) {
//		if (idx == num.length() - 1) {
//			return num.charAt(idx) - '0';
//		}
////		if (idx >= num.length()) {
////			if (vsf == target)
////				list.add(expsf);
////			return;
////		}
//		int num1 = num.charAt(idx) - '0';
//
//		if (idx + 1 <= num.length())
//			vsf = num1 * addOperators(num, idx + 1, vsf, target, expsf + num1 + " * ", list);
//		if (vsf == target) {
//			expsf += " * " + num.charAt(num.length() - 1);
//			list.add(expsf);
//			System.out.println(expsf);
//			System.out.println("match in *");
//		}
//		if (idx + 1 <= num.length())
//			vsf = num1 + addOperators(num, idx + 1, vsf, target, expsf + num1 + " + ", list);
//		if (vsf == target) {
//
//			list.add(expsf);
//			System.out.println("match in +");
//		}
//		if (idx + 1 <= num.length())
//			vsf = num1 - addOperators(num, idx + 1, vsf, target, expsf + num1 + " - ", list);
//		if (vsf == target) {
//			list.add(expsf);
//			System.out.println("match in -");
//		}
//		return 0;
//
//	}

	private static void addOperators(String num, int idx, int vsf, int target, String expsf, List<String> list) {

		if (vsf == target) {
			list.add(expsf);
			System.out.println(expsf);
			return;
		}

		if (idx >= num.length()) {
			if (vsf == target) {
				list.add(expsf);
//				System.out.println(expsf);
			}
			return;
		}

		int num1 = num.charAt(idx) - '0';
		

		if (idx == 0)
			addOperators(num, idx + 1, num1, target, expsf + num1, list);

		else {
			addOperators(num, idx + 1, vsf + num1, target, expsf + "+" + num1, list);
			addOperators(num, idx + 1, vsf - num1, target, expsf + "-" + num1, list);
			addOperators(num, idx + 1, vsf * num1, target, expsf + "*" + num1, list);
		}

	}

}
