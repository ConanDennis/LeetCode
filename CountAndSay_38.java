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
        String sn = countAndSay(n-1);    //��һ�����Ǹ���ǰһ������ȷ���ģ������뵽�õݹ飬�ݹ�����ı�־Ϊ��ʼ����1
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
