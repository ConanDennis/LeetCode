package LeetCode;
import java.util.*;

public class AddDigits_258 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int last = addDigits(num);
        System.out.println(last);
    } 
    
    public static int addDigits(int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        int total = 0;
        for(int i = 0; i < ch.length; i++)
            total += Integer.parseInt(ch[i] + "");
        
        if(total >= 10)
            total = addDigits(total);
            
        return total;
    }
	
}
