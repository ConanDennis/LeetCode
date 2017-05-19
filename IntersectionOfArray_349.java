package LeetCode;
import java.util.*;

public class IntersectionOfArray_349 {
	    public static void main(String[] args){
	        int[] nums1 = {1,2,3,5,9,0,3,5};
	        int[] nums2 = {2,6,4,2,3};
	        int[] intersec = intersection(nums1 , nums2);
	        
	        for(int i = 0; i < intersec.length; i++)
	            System.out.print(intersec[i] + " ");
	        
	    }
	    
	    public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> s1 = new HashSet<Integer>();
	        Set<Integer> s2 = new HashSet<Integer>();
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums1.length; i++)
	            s1.add(Integer.valueOf(nums1[i]));
	        for(int j = 0; j < nums2.length; j++)
	            s2.add(Integer.valueOf(nums2[j]));
	        
	        Iterator<Integer> its = s2.iterator(); 
	        
	        while(its.hasNext()){
	            Integer in = its.next();
	            
	            if(s1.contains(in))
	                list.add(in);
	    
	        }
	        
	        int len = list.size();
	        int[] a = new int[len];
	        for(int i = 0; i < len; i++)
	            a[i] = list.get(i).intValue();

	        return a;        
	    } 
	
}
