package LeetCode;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

public class FirstUniqueCharacter_387 {
	public static void main(String[] args){
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) {
		if(s.length() == 0)
            return -1;
        else if(s.length() == 1)
            return 0;
        else{
            int i , j , count;
            List<Character> list = new ArrayList<Character>();
            for(i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                if(!list.contains(ch))     //统计过的字母不再统计
                    list.add(ch);
                else
                    continue;
                
                count = 0;
                
                for(j = i; j < s.length(); j ++)
                    if(s.charAt(j) == ch)
                        count ++;
                
                if(count == 1)
                    return i;
            }
            
            return -1;
        }
		
		/*HashMap实现，思想就是将字母作为key，所有有该字母的位置的下标作为value，通过拿到某个key的value之后，看该value的长度，便知有几个位置上有该字母。
		 * 
		 * HashMap<Character,ArrayList<Integer>> dic=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!dic.containsKey(c)){
                dic.put(c,new ArrayList<Integer>());
            }
                dic.get(c).add(i);
        }
        
        for(int i=0;i<s.length();i++){
            if(dic.get(s.charAt(i)).size()==1){
                return dic.get(s.charAt(i)).get(0);
            }
        }
        
        
        return -1;*/
        
        
    }
}
