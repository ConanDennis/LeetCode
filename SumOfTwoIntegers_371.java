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
        if(b == 0){             //没有进位的时候完成运算
            return a;
        }
        
        int sum , carry;
        sum = a ^ b;                  //异或可以得到本位上的结果
        carry = (a & b) << 1;         //与之后可以得到该位上是否有进位，左移实现进位
        
        return getSum(sum , carry);   //因为进位可能还会与高位的数相加产生再进位，所以采用递归求和，当没有进位的时候（b == 0）得到结果
    }
}
