package DSAYear2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromic_Partition_LeetCode {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("Enter the String");
//		String str=scn.nextLine();
		String str="RADAR";
		System.out.println(partition(str));

	}

	public static List<List<String>> partition(String str) {
		List<List<String>> result = new ArrayList<List<String>>();
		partitionLogic(str, "", new ArrayList<String>(), result);
		return result;
	}

	private static void partitionLogic(String ques, String ans, ArrayList<String> partition,
			List<List<String>> parList) {
		if (ques.length() == 0) {
			parList.add(new ArrayList<String>(partition));
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String remaining = ques.substring(0, i + 1);
			if (isPalindrome(remaining)) {
				String roq = ques.substring(i + 1);
				partition.add(remaining);
				partitionLogic(roq, ans, partition, parList);
				partition.remove(partition.size() - 1);
			}
		}

	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left <= right)
			if (str.charAt(left++) != str.charAt(right--))
				return false;
		return true;

	}

}
