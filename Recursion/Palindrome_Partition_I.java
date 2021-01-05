package DSAYear2021;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partition_I {

	public static void main(String[] args) {
		String str = "aab";

	}

	public static List<List<String>> partition(String str) {
		List<String> partitions= new ArrayList<String>();
		List<List<String>> partitionsList=new ArrayList<List<String>>();
		partition(str, "",partitions,partitionsList);

	}



	private static void partition(String str, String ans, List<String> partitions, List<List<String>> partitionsList) {
		// TODO Auto-generated method stub
		
	}

	private static void partition(String ques, String ans, ArrayList<String> partitions,
			ArrayList<ArrayList<String>> partitionList) {
		
		if (ques.length() == 0) {
			partitionList.add(partitions);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String roq = ques.substring(0, i + 1);
			String leftPart = ques.substring(i + 1);
			if (isPalindrome(leftPart))
				partition(roq, ans + leftPart, partitions.add(leftPart), partitionList);

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
