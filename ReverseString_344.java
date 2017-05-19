package LeetCode;

public class ReverseString_344 {
    public static void main(String[] args){
        String s = "hello";
        String res = reverseString(s);
        System.out.println(res);
    }
    
    
    
    public static String reverseString(String s) {
        char[] c = s.toCharArray();
        int i , j ;
        char t;
        i = 0 ; j = c.length-1 ;
        for(; i < j; ){
            t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        
        String res = "";
        for(int k = 0; k < c.length; k++)
            res = res + c[k];
            
        return res;
            
    }
    
    /*LeetCode AC
    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        String res = sb.reverse().toString();
            
        return res;
            
    }
    */
    
}