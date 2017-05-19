package LeetCode;

import java.util.Iterator;
import java.util.TreeSet;



public class RemoveDupFromSortedArray_26 {
	public static void main(String[] args){
		int[] nums = new int[]{1, 1, 2, 2, 3, 4, 5, 5};
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < nums.length; i++)
            set.add(Integer.valueOf(nums[i]));
       
        Iterator<Integer> its = set.iterator();
        int j = 0;
        while(its.hasNext()){
            nums[j] = its.next().intValue();
            j++;
        }
              
        return set.size();
    }
}
