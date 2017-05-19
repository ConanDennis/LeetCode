package LeetCode;

public class ValidPerfectSquare_367 {
	public static void main(String[] args){
		int num = 16;
		System.out.println(isPerfectSquare(num));
	}
	
	//思路：二分查找法，用num/mid，结果如果>mid，说明mid*mid<num，low++；如果<mid，说明mid*mid>num，high--
	public static boolean isPerfectSquare(int num) {
        if(num == 1)    return true;
        int high = num;
        int low = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid * mid == num)    return true;
            int div = num/mid;
            if(div >= mid)
                low = mid + 1;
            if(div < mid)
                high = mid - 1;
            
        }
        return false; 
        
    }
}