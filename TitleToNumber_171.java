package LeetCode;

public class TitleToNumber_171 {
	public static void main(String[] args){
        String s = "AC";
        System.out.println(titleToNumber(s));
        
    }
    public static int titleToNumber(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        
        int val = 0;
        
        for(int i = len-1; i >= 0; i--)
            val += (ch[i] - 'A' + 1)*Math.pow(26,len-1-i);
        
        return val;
    }
}
