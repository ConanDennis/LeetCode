package LeetCode;

import java.util.Scanner;

//���ǰ�ÿ�ѵ�ʯ����a1, a2, ��, an��ʾ�ɶ����ƣ���ô��ǰ��Ϸ�����Nim��Ϊa1, a2, ��, an�İ�λ���
//���ﲻ��֤���ظ������ۣ�������Ϸ˫�����ǳ���������Nim��Ϊ0ʱ����ǰ��Ϸ�߱ذܣ���Nim����Ϊ0ʱ����ǰ��Ϸ�߱�ʤ��
//���Ǳ����Ǽ򻯰棬ֻ��һ�ѣ���˼����ֻҪʯ����Ϊ4�ı�������ô��ʱȡʯ�ӵ��˱��䡣
public class NimGame_292 {
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        boolean b = canWinNim(n);
        System.out.println(b);
        
    }
    
    public static boolean canWinNim(int n) {
        boolean b = true;
        if(n%4 == 0)
            b = false;
            
        return b;
    }
}
