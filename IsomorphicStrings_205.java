package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
	public static void main(String[] args){
		String s = "aabcbe";
		String t = "abbcbe";
		System.out.println(isIsomorphic(s,t));
		
	}
	public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer tb = new StringBuffer(t);
        for(int i = 0; i < sb.length(); i ++){
            char c1 = sb.charAt(i);
            char c2 = tb.charAt(i);
            
            if(!map.containsKey(c1) && !map.containsValue(c2))
                map.put(c1,c2);
            else if(!map.containsKey(c1) && map.containsValue(c2))
                map.put(c1,c1);
            
            sb.setCharAt(i,map.get(c1));
            
        }
        
        s = sb.toString();
        t = tb.toString();
        if(s.equals(t))
            return true;
        else
            return false;
    }
}
