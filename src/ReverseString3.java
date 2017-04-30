/**
 * 
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * 
 * 
 * **/
public class ReverseString3 {

public String reverseWords(String s) {
    String [] str = s.trim().split("\\s+");
    String ans = "";
  
    for(int i = 0; i < str.length; i++) {
    	char[] arr =  str[i].toCharArray();
    	for(int j = 0; j < arr.length/2; j++) {
    	
    		char temp = arr[j];
    		arr[j] = arr[arr.length-1-j];
    		arr[arr.length-1-j] = temp;
    	}
    	ans += new String(arr).trim() + " ";
    }
	
	return ans.trim();
	
    }
	
}
