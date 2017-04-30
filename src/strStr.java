/**
 * 
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Subscribe to see which companies asked this question.
 * 
 * Show Tags Show Similar Problems
 * 
 * 
 * 
 * 
 * 
 */
public class strStr {

	public int strStr(String haystack, String needle) {
		int h = haystack.length();
		int n = needle.length();

		for (int i = 0; i < h; i++) {

			int j = 0;
			while (i + j < h && haystack.charAt(i + j) == needle.charAt(j)) {

				if (j == n)
					return i;
				j++;

			}

		}
		return -1;
	}

	/**
	 * good answer
	 * 
	 * public int strStr(String haystack, String needle) { for (int i = 0; ;
	 * i++) { for (int j = 0; ; j++) { if (j == needle.length()) return i; if (i
	 * + j == haystack.length()) return -1; if (needle.charAt(j) !=
	 * haystack.charAt(i + j)) break; } } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 **/

	/**
	 * leetcode my answer
	 * 
	 * public int strStr(String haystack, String needle) { int h =
	 * haystack.trim().length(); int n = needle.trim().length();
	 * 
	 * if( n == 0){return 0;} if( h == 0 && n != 0){return -1;}
	 * 
	 * for( int i = 0; i < h; i++){
	 * 
	 * int index = i; int j = 0; while (i+j < h && haystack.charAt(i+j) ==
	 * needle.charAt(j)){
	 * 
	 * j++;
	 * 
	 * if(j == n){ return index; } } } return -1; }
	 * 
	 * 
	 **/
}
