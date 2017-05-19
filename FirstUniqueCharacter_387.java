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
                if(!list.contains(ch))     //ͳ�ƹ�����ĸ����ͳ��
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
		
		/*HashMapʵ�֣�˼����ǽ���ĸ��Ϊkey�������и���ĸ��λ�õ��±���Ϊvalue��ͨ���õ�ĳ��key��value֮�󣬿���value�ĳ��ȣ���֪�м���λ�����и���ĸ��
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
