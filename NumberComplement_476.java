package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NumberComplement_476 {
	public static void main(String[] args){
		int num = 5;
		System.out.println(findComplement(num));
	}
	public static int findComplement(int num) {
        List<Integer> list = new ArrayList<>();
        int yushu;
        while(num>0){
            yushu = num % 2;
            list.add(yushu);
            num /= 2;
        }
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            list.set(i,1-list.get(i));
            if(list.get(i)!=0)
            	sum += (int)Math.pow(2,i);
        }
        
        return sum;
        
    }
}
