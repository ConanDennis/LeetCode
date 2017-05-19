package LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber_202 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(isHappy(n));
		
	}
	
	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        int sum = n;
        while(sum != 1){
            String s = String.valueOf(sum);
            char[] ch = s.toCharArray();
            
            sum = 0;
            
            for(int i = 0; i < ch.length; i++)
                sum += Math.pow((ch[i]-'0') , 2);         //��charת��Ϊint
                
            if(!set.contains(Integer.valueOf(sum) ))      //������ȷ��һ������happy number�����ף��������ǣ����������ѭ��������һ��Ҫ��ѭ��������һ���ж����ǵĳ���
                set.add(Integer.valueOf(sum));            //���о�������happy number�������ڰ����з������㼸��֮�󣬻�õ�ͬ����ֵ��֮���һֱ���Ǽ�����֮��ѭ��������ֻҪ�ж��õ��ظ�������������Ϊ��������happy number
            else
                return false;
                
        }
        
        return true;
        
    }
}
