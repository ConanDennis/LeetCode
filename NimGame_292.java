package LeetCode;

import java.util.Scanner;

//考虑把每堆的石子数a1, a2, …, an表示成二进制，那么当前游戏局面的Nim数为a1, a2, …, an的按位异或
//这里不加证明地给出结论：假设游戏双方都非常聪明，当Nim数为0时，当前游戏者必败；当Nim数不为0时，当前游戏者必胜。
//但是本题是简化版，只有一堆，经思考，只要石子数为4的倍数，那么此时取石子的人必输。
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
