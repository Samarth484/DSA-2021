package DSAYear2021;

//link:               https://leetcode.com/problems/palindrome-partitioning/submissions/
import java.util.ArrayList;
import java.util.List;

public class palindromic_Partitions_optimal {

	public static void main(String[] args) {
		System.out.println(partition("RADAR"));

	}

	public static List<List<String>> partition(String str) {
		List<List<String>> result = new ArrayList<List<String>>();
		partitionLogic(str, 0, new ArrayList<String>(), result);
		return result;
	}

	private static void partitionLogic(String ques, int vidx, ArrayList<String> partition,
			List<List<String>> parList) {
		if (ques.length() == vidx) {
			parList.add(new ArrayList<String>(partition));
			return;
		}
		for (int i = vidx + 1; i <= ques.length(); i++) {
			String remaining = ques.substring(vidx, i);
			if (isPalindrome(remaining)) {
//				String roq = ques.substring(i + 1);
				partition.add(remaining);
				partitionLogic(ques, i, partition, parList);
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
