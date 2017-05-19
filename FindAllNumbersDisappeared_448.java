package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared_448 {
	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	//思路：正负标记法，元素是介于1~8的数，那么在长为8的数组里，这些数减1后可以与下标值一一对应
	//但是由于有部分数是有重复的，所以有些位置上肯定出现空缺。本题依据该思想，将元素值减1后作为索引，给该索引指向的值标记一个负号
	//也就是说，1~8中有的元素减1后对应索引上的值都被标记了负号。而没有被标记的元素，就是空缺，这些元素的索引加1，即为1~8中没有的数
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            nums[index] = -Math.abs(nums[index]);
        }
        for(int i=0; i<nums.length; i++)
            if(nums[i] > 0)
                list.add(i+1);
        return list;
		
		/*List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list1.add(nums[i]);
            list2.add(i+1);
        }
        for(int j=0; j<list2.size();){
            if(list1.contains(list2.get(j)))
                list2.remove(j);
            else
            	j++;
        }
        return list2;*/
    }
}
