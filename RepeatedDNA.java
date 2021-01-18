package DSAYear2021;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNA {

	public static void main(String[] args) {
		System.out.println(findRepeatedDnaSequences("123"));
	}

	static int count = 0;

	public static List<String> findRepeatedDnaSequences(String str) {
//		List<String> res = new ArrayList<String>();
		Set<String> hash_Set = new HashSet<String>();
		findRDS(str, hash_Set);
		return new ArrayList<String>(hash_Set);

	}

//012345
	public static void findRDS(String str, Set<String> res) {
		String excerpt = "";
		for (int i = 0; i <= str.length() - 10; i++) {

			excerpt = str.substring(i, i + 10);
			if (isMorethanTwice(excerpt, str)) {
				res.add(excerpt);
			}
		}

	}

	public static boolean isMorethanTwice(String excerpt, String str) {

		int begin = str.indexOf(excerpt);
		int last = str.lastIndexOf(excerpt);
		return begin == last ? false : true;

	}

}
