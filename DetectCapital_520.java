package LeetCode;

public class DetectCapital_520 {
	public static void main(String[] args){
		String s = "Length";
		System.out.println(detectCapitalUse(s));
	}
	
	//主要就是分类，第一类是首字符为大写，那么在其下又可分为两种，一是第二个字符为大写，那么其后一定要为大写，二是第二个字符为小写，那么其后一定为小写
	//第二类是首字符为小写，那么其后都要为小写
	public static boolean detectCapitalUse(String word) {
        if(word.length() == 1)
            return true;
            
        if(word.charAt(0)-'A'<26){
            if(word.charAt(1)-'A'<26){
                for(int i=2; i<word.length(); i++){
                    if(word.charAt(i)-'A'>=26)
                        return false;
                }
                return true;
            }else{
                for(int i=2; i<word.length(); i++){
                    if(word.charAt(i)-'A'<26)
                        return false;
                }
                return true;
            }
        }else{
            for(int i=0; i<word.length(); i++){
                if(word.charAt(i)-'A'<26)
                    return false;
            }
            return true;
        }
    }
}
