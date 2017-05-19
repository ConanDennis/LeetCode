package LeetCode;

import java.util.Scanner;

public class ClimbingStairs_70 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(climbStairs(n));
		
	}
	
    public static int climbStairs(int n) {
        //n��̨�׵ķ�������������n-2��̨�ף�Ȼ��2��ֱ�������һ����������n-1��̨�ף��ٵ�����һ����
        //ʵ���Ͼ���һ��Fabulacci���У�S[n] = S[n-1] + S[n-2] S[1] = 1 S[2] = 2
        int[] kind = new int[n+1];
        kind[1] = 1;
        kind[2] = 2;
        
        for(int i = 3; i < kind.length; i ++)
            kind[i] = kind[i-1] + kind[i-2];
            
        return kind[n];
    }
	
}
