package LeetCode;

import java.util.Scanner;

public class CountAndSay_38 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countAndSay(n));
		s.close();
	}
	
	public static String countAndSay(int n) {
        if(n == 1)
            return 1+"";
        String sn = countAndSay(n-1);    //后一个数是根据前一个数来确定的，所以想到用递归，递归结束的标志为初始数字1
        String s = "";
        
        int i , j , count;
        for(i = 0 ; i < sn.length(); i = j){    
            count = 1 ;
            char c = sn.charAt(i);
            j = i+1;
            if(i != sn.length()-1){
                for(; j < sn.length(); j++){
                    if(sn.charAt(j) == c)
                        count ++;
                    else
                        break;
                    
                }
            }
            s = s + count + c;
            
        }
        
        return s;

    }
}
