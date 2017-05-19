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
	
	//���ù鲢�����еĺϲ�˼�룬������Ҫ��ֱ�ӽ�nums2����nums1�����Բ��ܶ��⹹��һ�����飬Ϊ�˲��ƻ�nums1ǰ�����������Ӧ�ô�nums1��ĩβ��ʼ����
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m + n -1;
        while(m >= 1 && n >= 1 )
            nums1[k--] = nums1[m-1]>=nums2[n-1]?nums1[m---1]:nums2[n---1];
        while(n >= 1)
            nums1[k--] = nums2[n---1];
             
        return nums1;
    }
}
