package LeetCode;

public class PlusOne_66 {
	public static void main(String[] args){
		int[] digits = {9, 9, 9, 9};               //�����Ŀ���ǰ�һ�����ĸ�����λ�ϵ����ַŵ������У���һ��Ԫ����������λ�����������1��Ľ�������������ʽ����
		int[] newDig = plusOne(digits);
		for(int ele : newDig)
			System.out.print(ele + " ");
	}
	
	public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i = len-1; i >= 0; i --){         //�����һ��Ԫ�أ���λ������ʼ������ֻҪ��������λС��9����ô����λ��1�󼴿ɷ������飬��Ϊ���������λ�ˡ����仰˵��ֻҪ�������˸�λ����ô��λһ����������һλ�Ľ�λ
    
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            
            else 
                digits[i] = 0;            
                
        }
        
        int[] newDig = new int[len + 1];        //�����ִ�е������ô��������λһ���н�λ������Ҫ�����鳤�ȼ�һ����������λ��λ
        newDig[0] = 1;
        System.arraycopy(digits, 0, newDig, 1, len);    
        
        return newDig;
        
    }
}
