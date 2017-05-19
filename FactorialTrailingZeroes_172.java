package LeetCode;

//import java.math.BigInteger;

public class FactorialTrailingZeroes_172 {
	public static void main(String[] args){
		int n = 2470;
		System.out.println(trailingZeroes(n));
	}
	
	/*O��logn���ⷨ��

	����n!���������ӡ� 
	��׺0������������2��������5��˵����ġ�������ǿ��Լ���2��5�ĸ���������ͽ���ˡ�������������ӣ� 
	n = 5ʱ 5!���������� (2 * 2 * 2 * 3 * 5)����һ��5������2�������׺0�ĸ�����1�� 
	n = 11ʱ 11!����������(2^8 * 3^4 * 5^2 * 7)��������5������2�����Ǻ�׺0�ĸ�������2�� 
	���Ǻ����׹۲쵽��������2�ĸ������Ǵ��ڵ���5�ĸ��������ֻҪ����5�ĸ����Ϳ����ˡ���ô��������n!��������������5�ĸ����أ� 
	�۲�15! = ��3��5(�������е�5, 10, 15)�� ���Լ���n/5�Ϳ��ԡ�����25! = ��6��5(��5��5�������е�5, 10, 15, 20, 25�� ���⻹��1��5����25=(5*5)������һ��5�������Գ��˼���n/5�� ��Ҫ����n/5/5, n/5/5/5, n/5/5/5/5, ��, n/5/5/5,,,/5ֱ����Ϊ0��
	 */
	public static int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
        	n /= 5;
        	count += n;
        }
                
        return count;
    }
	
	/*���ؽⷨ��

	�������n!��Ȼ�����ĩβ0�ĸ��������ظ���10��ֱ��������0�� 
	�ýⷨ������������Դ�ʱ�ͻᵼ�½׳˵������������ȡ��
	 
	 */
	/*public static int trailingZeroes(int n) {
        if(n == 0 || n == 1)
            return 0;
        
        int f = 2;
        BigInteger t = BigInteger.valueOf(1) ;
        
        while(f != n){
            t = t.multiply(BigInteger.valueOf(f)) ;
            f ++;
        }
        t = t.multiply(BigInteger.valueOf(f)) ;
        
        int count = 0;
        String s = t.toString();
        for(int i = s.length()-1; i >= 0 ; i --){
            if(s.charAt(i) != '0')
                break;
            else
                count ++;
        }
                
        return count;
    }*/
	
	
}
