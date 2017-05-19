package LeetCode;

public class RevVowelsOfString_345 {
	public static void main(String[] args){
		String s = "qSweioAvFnpiSuqwDOerjknvzxiAFsgkiouKfdsNQsdfasJJsdKO";
		System.out.println(reverseVowels(s));
	}	
	
	public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        
        char tmp;
        int p1 = 0 , p2 = s.length()-1;
        
        loop:                                 //思想就是直接交换靠头部和靠尾部的元音字符，
        while(p1 < p2){
            while(ch[p1] != 'a' && ch[p1] != 'e' && ch[p1] != 'i' && ch[p1] != 'o' && ch[p1] != 'u' && ch[p1] != 'A' && ch[p1] != 'E' && ch[p1] != 'I' && ch[p1] != 'O' && ch[p1] != 'U'){
                p1 ++;
                if(p1 >= p2)
                    break loop;
            }
            
            while(ch[p2] != 'a' && ch[p2] != 'e' && ch[p2] != 'i' && ch[p2] != 'o' && ch[p2] != 'u' && ch[p2] != 'A' && ch[p2] != 'E' && ch[p2] != 'I' && ch[p2] != 'O' && ch[p2] != 'U'){
                p2 --;
                if(p1 >= p2)
                    break loop;
            }
                
            tmp = ch[p1];
            ch[p1] = ch[p2];
            ch[p2] = tmp;
            
            p1 ++;
            p2 --;
        }
        
        return new String(ch);             //直接通过构造函数将字符数组转化为String，能节省不少时间
        
        
        
        /*11ms
        int len = s.length();
        char[] ch1 = s.toCharArray();
        int count = 0;
        for(int i = 0; i < len; i++)          //遍历数组ch1，看数组中有多少个元音字符
            if(ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u' || ch1[i] == 'A' || ch1[i] == 'E' || ch1[i] == 'I' || ch1[i] == 'O' || ch1[i] == 'U')
                count ++;
        
        char[] ch2 = new char[count];         //建立一个元音字符个数大小的字符数组ch2
         
        int k = 0;
        for(int i = 0; i < len; i++){         //再遍历一遍数组ch1，将元音字符都装进ch2中
            if(ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u' || ch1[i] == 'A' || ch1[i] == 'E' || ch1[i] == 'I' || ch1[i] == 'O' || ch1[i] == 'U'){
                ch2[k] =  ch1[i];
                k++;
            }
        }
        
        for(int i = 0; i < len; i++)          //再遍历一遍数组ch1，将ch2的元素倒装进有元音字符的位置，实现逆序
            if(ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u' || ch1[i] == 'A' || ch1[i] == 'E' || ch1[i] == 'I' || ch1[i] == 'O' || ch1[i] == 'U'){
                ch1[i] = ch2[k-1];
                k--;
            }
        
            
        return new String(ch1);
        */
        
    }
}
