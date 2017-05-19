package LeetCode;

import java.util.Scanner;

public class UglyNumber_263 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(isUgly(n));
		
	}
	
	public static boolean isUgly(int num) {
	    if(num <= 0)
	        return false;
	    if(num == 1)
	        return true;
	
	    if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
	        int temp = num;
	        
	        while(temp % 5 == 0)
	            temp /= 5;
	        while(temp % 3 == 0)
	            temp /= 3; 
	        while(temp % 2 == 0)
	            temp /= 2;
	            
	        if(temp == 1)
	            return true;
	        else
	            return false;
	        
	    }
	        
	    else
	        return false;
	}
}
