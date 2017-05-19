package LeetCode;

public class ReverseBits_190 {
	public static void main(String[] args){
		int n = 1;
		System.out.println(reverseBits(n));
	}
	
	//这个题目不是很难，但是需要注意一些问题。那就是返回的整数是有可能超出2^31-1的范围的，所以输出的结果会是负值，但是不要在意这些细节，理解原理就行
	//n每次将最低位和1相与，得到最低位上的值后加到result的最低位，然后result左移一位，把刚才加上的最低位挪到高位，n继续向右移一位,这样n的低位就逐渐移到了result的高位，实现了二进制的翻转。
	public static int reverseBits(int n) {
		int result = 0;
        for(int i=0; i<32; i++){
            result <<= 1;
            result += n&1;
            n >>>= 1;
        }
        return result;
    }
}
