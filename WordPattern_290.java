package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
	public static void main(String[] args){
		String pattern = "abba";
		String str = "dog cat cat cat";
		System.out.println(wordPattern(pattern, str));
		
	}
	
	public static boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if(strArr.length != pattern.length())     //���str���������֮��ĸ�����pattern���ȶ���һ��Ҳ�������ٱ���
        	return false;
        
        Map<Character,String> map = new HashMap<Character,String>();   //��Map��pattern�е�Ԫ����str�е�Ԫ�ع�������������a��Ӧ��dog
        for(int i = 0 ; i < pattern.length(); i ++){
            char c = pattern.charAt(i);
            String s = strArr[i];
            if(!map.containsKey(c)){             //���Map��key�в�������ǰɨ�赽��pattern�е��ַ�
                if(!map.containsValue(s))        //���Map��value��Ҳ������strArr�е�Ԫ�أ���ô���ǾͿ��Թ�����
                    map.put(c , s);
                else							 //���򣬼�ʹMap��key�в�������ǰɨ�赽��pattern�е��ַ�����value�Ѿ�������pattern�е�Ԫ�ع����ˣ�����Ҳ���ܹ���
                    return false;
            }else{                               //���Map��key�а�����ǰɨ�赽��pattern�е��ַ���˵���Ѿ������й�����key-value����
                if(s.equals(map.get(c)))         //���ɨ�赽��str��Ԫ�غ;���key�ҵ���value��һ���ģ�˵����ǰ��ֵ�Ƿ��ϵģ����������һ��
                    continue;
                else                             //���򣬾Ϳ���˵�����߽ṹ��һ��
                    return false;
            }
                
            
        }
        
        return true;
    } 
}
