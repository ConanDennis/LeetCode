package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BullsAndCows_299 {
	public static void main(String[] args){
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret , guess));
		
	}
	public static String getHint(String secret, String guess) {
		int A = 0 , B = 0;
        Map<Character,Integer> m1 = new HashMap<Character,Integer>();     //用m1记录secret中出现的字符以及对应的个数
        Map<Character,Integer> m2 = new HashMap<Character,Integer>();     //用m2记录guess中出现的字符以及对应的个数
        for(int i = 0; i < secret.length(); i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 == ch2){         //统计Bulls的个数，计数之后直接跳过下面语句，不在Map中记录
                A ++;
                continue;
            }
            
            if(!m1.containsKey(ch1)){
                m1.put(ch1,1);
            }else{
                m1.put(ch1 , m1.get(ch1)+1);
            }
            
            if(!m2.containsKey(ch2)){
                m2.put(ch2,1);
            }else{
                m2.put(ch2 , m2.get(ch2)+1);
            }
                
        }
        
        //统计Cows的个数
        List<Character> list = new ArrayList<Character>();             //用来记录统计过了的字符
        for(int i = 0; i < secret.length(); i++){
            char c = secret.charAt(i);
            if(c == guess.charAt(i))           //直接跳过Bulls的位置
                continue;
            
        	if(m1.containsKey(c) && m2.containsKey(c) && !list.contains(c)){      //加上!list.contains(c)是为了防止有重复字符时会导致重复计数
                B += Math.min(m1.get(c) , m2.get(c));
                list.add(c);
        	}
        }
        
        return A+"A"+B+"B";
            
    }
}
