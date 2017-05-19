package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams_438 {
	public static void main(String[] args){
		String s = "abab";
		String p = "ab";
		System.out.println(findAnagrams(s,p));
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
		
		//法一：滑动窗口法，每次只考虑窗口首尾的变动，因为窗口滑动1个单位，中间的元素是不会变的，只有首尾会变
		//然后构造一个长度为26的int数组来统计单个字母的个数（这种思想很重要，要多用，数组的开销比Map要小得多）
		//窗口在s上滑动，大小为p的长度。先统计第一个窗口的各字符个数，每出现一个字符，就在该字符上加1，相反，p中每出现一个字符，就在该字符上减1
		//如果最后26个字符都为0，说明该窗口与p是Anagrams。同理，可发现任何窗口都满足该规律，只要int数组中有一个不为0，就说明该窗口不是Anagrams
		//而除了第一个窗口需要统计完整个长度以外，其他的窗口只需要统计首尾变化即可，大大降低了开销
		List<Integer> count = new ArrayList<>();
        if(s==null || s.length()==0 || s.length() < p.length())     return count;
        
        int len1 = s.length(), len2 = p.length();
        int[] t = new int[26];
       
        int i = 0;          //第一个窗口由于要统计完整的p长度，所以单独拿出来考虑
        for(int j=i ; j<len2; j++){
            t[s.charAt(j)-'a'] ++;
            t[p.charAt(j)-'a'] --;
        }
        int k = 0;
        for(; k<26; k++){
            if(t[k] != 0)
                break;
        }
        if(k == 26)               //当26个元素都为0时，k才会等于26
            count.add(i);
        
        for(i=1; i<=len1-len2; i++){    //从第二个窗口开始就只需考虑首尾变化了
            t[s.charAt(i-1)-'a']--;
            t[s.charAt(i+len2-1)-'a']++;
            
            k = 0;
            for(; k<26; k++){
                if(t[k] != 0)
                    break;
            }
            if(k == 26)
                count.add(i);
        }
        
        return count;
        
        //法二：很容易想到的方法，但注定开销非常大，LTE了，其实大思想与上面是差不多的，但是每次循环都考虑了很多废情况，也就是除了首尾的中间段的字符
        /*List<Character> list = new ArrayList<>();
        for(int i=0; i<p.length(); i++){
            list.add(p.charAt(i));
        }
        

        for(int j=0; j<=s.length()-p.length(); j++){
        	List<Character> temp = new ArrayList<>(list);
            for(int k=j; k<j+p.length(); k++){
            	
                boolean judge = temp.remove(Character.valueOf(s.charAt(k)));
                if(!judge)       //如果p中不含该窗口中的元素，就直接忽略当前窗口，继续下一个
                    break;
            }
            if(temp.size()==0)
                count.add(j);
        }
        
        return count;*/
        
    }
}
