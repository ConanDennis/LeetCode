package LeetCode;

public class PalindromeNumber_9 {
	public static void main(String[] args){
		int x = -2147483648;
		System.out.println(isPalindrome(x));
		
	}
	
	public static boolean isPalindrome(int x) {
		String s = x + "";
        int len = s.length();
        if(len == 1)
            return true;
        else{
            for(int i = 0; i < len/2; i++)
                if(s.charAt(i) != s.charAt(len-1-i))
                    return false;
            return true;
        }
    }
}
