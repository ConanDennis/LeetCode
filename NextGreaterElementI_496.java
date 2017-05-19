package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElementI_496 {
	public static void main(String[] args){
		int[] a = {4,1,2};
		int[] b = {1,3,4,2};
		int[] c = nextGreaterElement(a,b);
		for(int i:c)
			System.out.print(i+" ");
	}
	
	//通过将大数组导入到list中，方便小数组的元素能直接在list中找到第一次出现该元素的索引，进而开始查找后面第一个比它大的数。
	//此外，还要注意边界问题，当查找到的索引为大数组的最后一位时，它的后面已经没有元素，所以应直接给小数组赋-1
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int k:nums)
        	list.add(k);
        int[] arr = new int[findNums.length];
        for(int i=0; i<findNums.length; i++){
            int index = list.indexOf(findNums[i]);
            if(index<nums.length-1){
                int j;
                for(j=index+1; j<nums.length; j++){
                    if(nums[j]>findNums[i]){
                        arr[i] = nums[j];
                        break;
                    }
                }
                if(j >= nums.length)
                	arr[i] = -1;
            }else{
            	arr[i] = -1;
            }
            
        }
        return arr;
            
    }
}
