package LeetCode;

public class NthDigit_400 {
	public static void main(String[] args){
		int n = 1000000000;
		System.out.println(findNthDigit(n));
	}
	public static int findNthDigit(int n) {
        /*1~9 9个数 9*1=9个digit 
        10~99 90个数 90*2=180个digit 
        100~999 900个数 900*3=2700个digit 
        10^(k-1) ~ k个9连成的数 9*10^(k-1)个数 (9*10^(k-1))*k个digit
        
                     知道每个数位的数有多少个后，先确定第n个digit是几位数，然后再确定是那个数位的第几个数，然后就可以知道第n个digit是多少了
        */
        int k = 1 ;       //k用来表示数字位数，初始考虑个位数
        while(n/k >= 9*(int)Math.pow(10,k-1)){    //9*(int)Math.pow(10,k-1)*k是根据规律推导出的k位数digit数量的公式。这里特别注意，之所以把右边的*k放到左边作为被除数，是因为当k=9时，9*(int)Math.pow(10,k-1)*k=8100000000，超过了int的上限2^31=2147483647，为了避免这一种情况，将k除到左边，下一次判定就能正常退出循环了
            n -= 9*(int)Math.pow(10,k-1)*k;       //每次都减掉较小数位digit数量，那么我每次仅需比较当前数位digit的数量，更直观得确定第n个digit是不是当前数位的数的digit。比如，当n=10，那么n>9(k=1)，说明n不是属于个位数的digit，需要到十位数去考虑，事先减掉个位数digit数量9，那么得到1，1<180(k=2)，说明第n个digit一定属于十位数
            k ++;         //依次增加数位
        }
        
        int result , remainder;
        result = n/k;          //n现在表示得是当前数位排列的第n个digit，所以除以数位k后，结合余数就能得到是当前数位的第几个数
        remainder = n%k;	   
        
        int prefig , behfig;   //由于余数不确定，所以digit可能在前一个数的末尾，也可能在后一个数里
        prefig = (int)Math.pow(10,(k-1))+result-1;      //前一个数很好确定
        if(remainder == 0)     //如果余数为0，直接可以说明digit就是前一个数的末尾，模10即可得到
            return prefig%10;
        else{
            behfig = prefig+1; //得到后一个数后，很容易想到转化为String，余数是几，就把第几位取出来。
            String s = String.valueOf(behfig);
            return s.charAt(remainder-1)-'0';
        }
        
    }
}
