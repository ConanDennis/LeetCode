package LeetCode;

import java.util.Scanner;

public class SumOfTwoIntegers_371 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(new SumOfTwoIntegers_371().getSum(a , b));
		
		s.close();
		
	}
    public int getSum(int a, int b) {
        if(b == 0){             //û�н�λ��ʱ���������
            return a;
        }
        
        int sum , carry;
        sum = a ^ b;                  //�����Եõ���λ�ϵĽ��
        carry = (a & b) << 1;         //��֮����Եõ���λ���Ƿ��н�λ������ʵ�ֽ�λ
        
        return getSum(sum , carry);   //��Ϊ��λ���ܻ������λ������Ӳ����ٽ�λ�����Բ��õݹ���ͣ���û�н�λ��ʱ��b == 0���õ����
    }
}
