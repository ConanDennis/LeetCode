package LeetCode;

public class RotateFunction_396 {
	public static void main(String[] args){
		int[] A = {4, 3, 2, 6};
		System.out.println(maxRotateFunction(A));
	}
	
	//是一种比较笨的方法，也就是把所有排列的方法摆出来后，依次代入A[0]*0+A[1]*1+...A[n-1]*(n-1)的公式，得到一个值sum，然后比较所有情况的sum，取最大的一个
	public static int maxRotateFunction(int[] A) {
		int len = A.length ;
        if(len == 0) return 0;
        int max = Integer.MIN_VALUE , sum = 0 , temp;
        
        int count = 0;
        while(count != len){
            
        	temp = A[0];          
            for(int i = 0; i < len; i ++){
                sum += i * A[i];
                if(i < len-1)
                    A[i] = A[i+1];     //计算当前情况和值的同时，把后面的元素往前移一位，以便于下一次循环时可以计算下一种情况
            }
            A[len-1] = temp;           //第一个元素调到最后一个去
            
            count ++;
            if(sum > max)
                max = sum;
            sum = 0;
        }
        
        return max;
    }
	
	//本题还有一种开销较少的方法， 涉及数列的推导公式，用两种情况的公式相减
}
