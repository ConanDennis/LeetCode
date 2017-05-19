package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow_500 {
	public static void main(String[] args){
		String[] s = {"Hello", "Alaska", "Dad", "Peace"};
		String[] ss = findWords(s);
		for(String word:ss){
			System.out.print(word+" ");
		}
	}
	
	public static String[] findWords(String[] words) {
        int[] arr = new int[26];
        arr['q'-'a'] = 1;
        arr['w'-'a'] = 1;
        arr['e'-'a'] = 1;
        arr['r'-'a'] = 1;
        arr['t'-'a'] = 1;
        arr['y'-'a'] = 1;
        arr['u'-'a'] = 1;
        arr['i'-'a'] = 1;
        arr['o'-'a'] = 1;
        arr['p'-'a'] = 1;
        
        arr['a'-'a'] = 2;
        arr['s'-'a'] = 2;
        arr['d'-'a'] = 2;
        arr['f'-'a'] = 2;
        arr['g'-'a'] = 2;
        arr['h'-'a'] = 2;
        arr['j'-'a'] = 2;
        arr['k'-'a'] = 2;
        arr['l'-'a'] = 2;
        
        arr['z'-'a'] = 3;
        arr['x'-'a'] = 3;
        arr['c'-'a'] = 3;
        arr['v'-'a'] = 3;
        arr['b'-'a'] = 3;
        arr['n'-'a'] = 3;
        arr['m'-'a'] = 3;
        
        List<String> list = new ArrayList<String>();
        
        for(String word:words){
            String wordLower = word.toLowerCase();
            int judge = arr[wordLower.charAt(0)-'a'];
            int i;
            for(i=1; i<wordLower.length(); i++){
                if(arr[wordLower.charAt(i)-'a'] != judge){
                    break;
                }else{
                    continue;
                }
                
            }
            if(i >= wordLower.length())
                list.add(word);
        }
        
        String[] s = new String[list.size()];
        for(int j=0; j<s.length; j++)
            s[j] = list.get(j);
             
        return s;    
    }
}
