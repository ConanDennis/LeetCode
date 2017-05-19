package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome_409 {
	public static void main(String[] args){
		String s = "ccc";
		System.out.println(longestPalindrome(s));
	}
	
	public static int longestPalindrome(String s) {
	
        Map<Character,Integer> map = new HashMap<Character,Integer>();      //用map存储每个字符有多少个
        Set<Character> set = new HashSet<Character>();                      //用set存储有几种字符
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                map.put(c,1);
                set.add(c);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        int sing = 0 , odd = 0 , even = 0;        
        for(char a : set){        //遍历Set的简单方法 
            int num = map.get(a);
            if(num%2!=0){         //对于奇数个字符，要先去掉一个，剩下的偶数个也可以，但是最后别忘了去掉的那一个也可以放在最中间，所以要加上单个1，如果没有奇数个的字符的话，sing就为0
            	sing = 1;
            	odd += num-1;
            }
            else if(num%2==0)     //对于有偶数个的字符，无论怎样都可以成为回文的对称部分；而
            	even += num;
            
        }
        
        return sing+odd+even;
    }
}
