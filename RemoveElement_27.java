package LeetCode;

import java.util.Scanner;

public class RemoveElement_27 {
	public static void main(String[] args){
		int[] nums = {3,2,5,3,9,2,2,1,5,2,7,4,6,3,6,3};
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		System.out.println(removeElement(nums , val));
		s.close();
	}
	
	public static int removeElement(int[] nums, int val) {
        int k = 0;              //用来统计数组中等于val的个数
        for(int i = 0; i < nums.length-k; i++){
            while(nums[i] == val){            //只要i位置的元素还等于val，就继续将后面的元素往前移
                k ++;
                int j;
                for(j = i; j < nums.length-1; j++)
                    nums[j] = nums[j+1];
                nums[j] = 0;				  //空出的位置补0；
                
            }
        }
        
        int count = 0;          //用来统计数组中非0元素的个数，即为数组删除元素后的长度
        for(int i = 0; i < nums.length; i++)
            if(nums[i] < 0)
                count ++;
                
        return nums.length - count;
        
    }
}
