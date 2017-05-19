package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
	public static void main(String[] args){
		int n = 15;
		System.out.println(new FizzBuzz_412().fizzBuzz(n));
		
	}
	public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5!=0)
                list.add("Fizz");
            else if(i%3!=0 && i%5==0)
                list.add("Buzz");
            else if(i%3==0 && i%5==0)
                list.add("FizzBuzz");
            else
                list.add(i+"");
        }
        
        return list;
    
    }
}
