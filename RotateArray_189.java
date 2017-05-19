package LeetCode;

public class RotateArray_189 {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums , k);
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+" ");
		}
		
	}
	
	//思路：很直接得想到将原数组扩大一倍，无论移动多少位，移动后的数组可以在扩大后的数组中截取出来。
	public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int t = k%len;
        int pos = len - t;
        int[] arr = new int[len*2];
        System.arraycopy(nums,0 ,arr,0,len);
        System.arraycopy(nums,0 ,arr,len,len);
        System.arraycopy(arr,pos ,nums,0,len);
        
    }
}
