package LeetCode;

public class MergeSortedArray_88 {
	public static void main(String[] args){
		int[] nums1 = new int[11];
		nums1[0] = 1;nums1[1] = 3; nums1[2] = 4;
		int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 9};
		int[] nums3 = new int[11];
		nums3 = merge(nums1,3,nums2,8);
		for(int i = 0 ; i< nums3.length; i ++)
			System.out.print(nums3[i]+" ");
		
	}
	
	//运用归并排序中的合并思想，但此题要求直接将nums2并入nums1，所以不能额外构建一个数组，为了不破坏nums1前面的数，我们应该从nums1的末尾开始填数
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m + n -1;
        while(m >= 1 && n >= 1 )
            nums1[k--] = nums1[m-1]>=nums2[n-1]?nums1[m---1]:nums2[n---1];
        while(n >= 1)
            nums1[k--] = nums2[n---1];
             
        return nums1;
    }
}
