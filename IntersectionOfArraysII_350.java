package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArraysII_350 {
	public static void main(String[] args){
		int[] nums1 = {1, 3, 6, 2, 3, 5, 2, 2};
		int[] nums2 = {0, 3, 8, 2, 8, 3, 2};
		int[] a = intersect(nums1 , nums2);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        List<Integer> l3 = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++)
            l1.add(Integer.valueOf(nums1[i]));
        for(int j = 0; j < nums2.length; j++)
            l2.add(Integer.valueOf(nums2[j]));
            
        for(int k = 0; k < l2.size(); k++){
            Integer in = l2.get(k);
            if(l1.contains(in)){
                l1.remove(in);
                l3.add(in);
            }
        }
        
        int[] a = new int[l3.size()];
        for(int i = 0; i < l3.size(); i++)
            a[i] = l3.get(i).intValue();
            
        return a;
        
    }
}
