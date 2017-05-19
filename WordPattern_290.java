package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
	public static void main(String[] args){
		String pattern = "abba";
		String str = "dog cat cat cat";
		System.out.println(wordPattern(pattern, str));
		
	}
	
	public static boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if(strArr.length != pattern.length())     //如果str经过正则拆开之后的个数跟pattern长度都不一，也就无需再比了
        	return false;
        
        Map<Character,String> map = new HashMap<Character,String>();   //用Map将pattern中的元素与str中的元素关联起来，比如a对应着dog
        for(int i = 0 ; i < pattern.length(); i ++){
            char c = pattern.charAt(i);
            String s = strArr[i];
            if(!map.containsKey(c)){             //如果Map的key中不包含当前扫描到的pattern中的字符
                if(!map.containsValue(s))        //如果Map的value中也不包含strArr中的元素，那么它们就可以关联了
                    map.put(c , s);
                else							 //否则，即使Map的key中不包含当前扫描到的pattern中的字符，但value已经与其他pattern中的元素关联了，它们也不能关联
                    return false;
            }else{                               //如果Map的key中包含当前扫描到的pattern中的字符，说明已经存在有关它的key-value对了
                if(s.equals(map.get(c)))         //如果扫描到的str的元素和经过key找到的value是一样的，说明当前的值是符合的，继续检查下一个
                    continue;
                else                             //否则，就可以说明二者结构不一致
                    return false;
            }
                
            
        }
        
        return true;
    } 
}
