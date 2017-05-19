package LeetCode;

import java.util.*;

public class ValidAnagram_242 {
	public static void main(String[] args){
		String s = "anagram";
		String t = "nagaram";
		boolean b = new ValidAnagram_242().isAnagram(s,t);
		System.out.println(b);
	}
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        
        for(int i = 0; i < a.length; i++)
            l1.add(String.valueOf(a[i]));
        for(int j = 0; j < b.length; j++)
            l2.add(String.valueOf(b[j]));
            
        Collections.sort(l1);
        Collections.sort(l2);
        
            
        return l1.equals(l2);
    }
}