package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BullsAndCows_299 {
	public static void main(String[] args){
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret , guess));
		
	}
	public static String getHint(String secret, String guess) {
		int A = 0 , B = 0;
        Map<Character,Integer> m1 = new HashMap<Character,Integer>();     //��m1��¼secret�г��ֵ��ַ��Լ���Ӧ�ĸ���
        Map<Character,Integer> m2 = new HashMap<Character,Integer>();     //��m2��¼guess�г��ֵ��ַ��Լ���Ӧ�ĸ���
        for(int i = 0; i < secret.length(); i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 == ch2){         //ͳ��Bulls�ĸ���������֮��ֱ������������䣬����Map�м�¼
                A ++;
                continue;
            }
            
            if(!m1.containsKey(ch1)){
                m1.put(ch1,1);
            }else{
                m1.put(ch1 , m1.get(ch1)+1);
            }
            
            if(!m2.containsKey(ch2)){
                m2.put(ch2,1);
            }else{
                m2.put(ch2 , m2.get(ch2)+1);
            }
                
        }
        
        //ͳ��Cows�ĸ���
        List<Character> list = new ArrayList<Character>();             //������¼ͳ�ƹ��˵��ַ�
        for(int i = 0; i < secret.length(); i++){
            char c = secret.charAt(i);
            if(c == guess.charAt(i))           //ֱ������Bulls��λ��
                continue;
            
        	if(m1.containsKey(c) && m2.containsKey(c) && !list.contains(c)){      //����!list.contains(c)��Ϊ�˷�ֹ���ظ��ַ�ʱ�ᵼ���ظ�����
                B += Math.min(m1.get(c) , m2.get(c));
                list.add(c);
        	}
        }
        
        return A+"A"+B+"B";
            
    }
}
