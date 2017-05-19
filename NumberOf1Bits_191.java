package LeetCode;

public class NumberOf1Bits_191 {
	public static void main(String[] args){
		int n = 429496729 ;  //java�н�intת��Ϊunsigned int�ķ���data & 0x0FFFFFFFF  ��int data��
		int hammin = hammingWeight(n);
		System.out.println(hammin);
	}
	
	public static int hammingWeight(int n) {
        int oneCount = 0;
        
        while(n != 0){
            
            oneCount += (n & 1);
            n = n >>> 1;
            
        }
                
        return oneCount;
    }
}