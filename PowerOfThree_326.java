package LeetCode;

public class PowerOfThree_326 {
	public static void main(String[] args){
		int n = 243;
		System.out.println(isPowerOfThree(n));
		
	}
	public static boolean isPowerOfThree(int n) {
	      double d = Math.log10((double)n) / Math.log10((double)3);

	      if(d == (int)d)
	          return true;
	      else 
	          return false;
	}
}
