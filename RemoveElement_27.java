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
        int k = 0;              //����ͳ�������е���val�ĸ���
        for(int i = 0; i < nums.length-k; i++){
            while(nums[i] == val){            //ֻҪiλ�õ�Ԫ�ػ�����val���ͼ����������Ԫ����ǰ��
                k ++;
                int j;
                for(j = i; j < nums.length-1; j++)
                    nums[j] = nums[j+1];
                nums[j] = 0;				  //�ճ���λ�ò�0��
                
            }
        }
        
        int count = 0;          //����ͳ�������з�0Ԫ�صĸ�������Ϊ����ɾ��Ԫ�غ�ĳ���
        for(int i = 0; i < nums.length; i++)
            if(nums[i] < 0)
                count ++;
                
        return nums.length - count;
        
    }
}
