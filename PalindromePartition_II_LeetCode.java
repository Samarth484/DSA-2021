package DSAYear2021;

public class PalindromePartition_II_LeetCode {

	public static void main(String[] args) {

		System.out.println(minCut("aab"));
	}

	public static int minCut(String str) {
		int arr[] = { Integer.MAX_VALUE };
		palinPar(str, 0, arr);
		return arr[0] - 1;

	}

	public static void palinPar(String ques, int mincutbf, int resArr[]) {
		if (ques.length() == 0) {
			resArr[0] = Math.min(resArr[0], mincutbf);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String part = ques.substring(0, i + 1);
			if (isPalindrome(part)) {
				String roq = ques.substring(i + 1);
				palinPar(roq, mincutbf + 1, resArr);
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
