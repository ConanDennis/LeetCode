package LeetCode;

//import java.math.BigInteger;

public class FactorialTrailingZeroes_172 {
	public static void main(String[] args){
		int n = 2470;
		System.out.println(trailingZeroes(n));
	}
	
	/*O（logn）解法：

	考虑n!的质数因子。 
	后缀0总是由质因子2和质因子5相乘得来的。如果我们可以计数2和5的个数，问题就解决了。考虑下面的例子： 
	n = 5时 5!的质因子中 (2 * 2 * 2 * 3 * 5)包含一个5和三个2。因而后缀0的个数是1。 
	n = 11时 11!的质因子中(2^8 * 3^4 * 5^2 * 7)包含两个5和三个2。于是后缀0的个数就是2。 
	我们很容易观察到质因子中2的个数总是大于等于5的个数。因此只要计数5的个数就可以了。那么怎样计算n!的质因子中所有5的个数呢？ 
	观察15! = 有3个5(来自其中的5, 10, 15)， 所以计算n/5就可以。但是25! = 有6个5(有5个5来自其中的5, 10, 15, 20, 25， 另外还有1个5来自25=(5*5)的另外一个5），所以除了计算n/5， 还要计算n/5/5, n/5/5/5, n/5/5/5/5, …, n/5/5/5,,,/5直到商为0。
	 */
	public static int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
        	n /= 5;
        	count += n;
        }
                
        return count;
    }
	
	/*朴素解法：

	首先求出n!，然后计算末尾0的个数。（重复÷10，直到余数非0） 
	该解法在输入的数字稍大时就会导致阶乘得数溢出，不足取。
	 
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
