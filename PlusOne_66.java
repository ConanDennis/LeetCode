package LeetCode;

public class PlusOne_66 {
	public static void main(String[] args){
		int[] digits = {9, 9, 9, 9};               //这个题目就是把一个数的各个数位上的数字放到数组中，第一个元素是最大的数位，求这个数加1后的结果，以数组的形式返回
		int[] newDig = plusOne(digits);
		for(int ele : newDig)
			System.out.print(ele + " ");
	}
	
	public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i = len-1; i >= 0; i --){         //从最后一个元素（个位数）开始遍历，只要遇到该数位小于9，那么将该位加1后即可返回数组，因为不会产生进位了。换句话说，只要遍历到了该位，那么该位一定有来自上一位的进位
    
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            
            else 
                digits[i] = 0;            
                
        }
        
        int[] newDig = new int[len + 1];        //如果能执行到这里，那么数组的最高位一定有进位，所以要将数组长度加一，来存放最高位进位
        newDig[0] = 1;
        System.arraycopy(digits, 0, newDig, 1, len);    
        
        return newDig;
        
    }
}
