package LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber_202 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(isHappy(n));
		
	}
	
	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        int sum = n;
        while(sum != 1){
            String s = String.valueOf(sum);
            char[] ch = s.toCharArray();
            
            sum = 0;
            
            for(int i = 0; i < ch.length; i++)
                sum += Math.pow((ch[i]-'0') , 2);         //将char转换为int
                
            if(!set.contains(Integer.valueOf(sum) ))      //此题想确定一个数是happy number很容易，但若不是，则会陷入死循环。所以一定要在循环中设置一个判定不是的出口
                set.add(Integer.valueOf(sum));            //经研究，不是happy number的数，在按题中方法计算几次之后，会得到同样的值，之后便一直在那几个数之间循环，所以只要判定得到重复的数，即可认为此数不是happy number
            else
                return false;
                
        }
        
        return true;
        
    }
}
