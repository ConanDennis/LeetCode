package LeetCode;

public class MoveZeroes_283 {
	public static void main(String[] args){
        int[] nums = {0 , 0, 1, 0 , 3 , 12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    
    public static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++)
           
        	if(nums[i] == 0){              //ע�⣬���뿼����������0�����
                int count = 1;
                
            	for(int k = i+1 ; k < nums.length; k++){           //��ѭ������ͳ����������0�ĸ���
            		if(nums[k] == 0)
            			count ++;
            		else 
            			break;
            	}
            	
            	for(int j = i; j < nums.length-count; j++)        //��ѭ�����ڽ�ָ���ұߵ�һ������Ԫ����������Ԫ��Ų��ָ�괦��
                    nums[j] = nums[j+count];
            
                for(int l = nums.length-1; l >= nums.length-count; l--)          //��ѭ�����ڽ�0�ŵ�������ȥ���������ּ���0�����ں���ż���
                	nums[l] = 0;
            }
        
    }
}
