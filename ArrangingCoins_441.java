package LeetCode;

import java.util.Scanner;

public class ArrangingCoins_441 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(arrangeCoins(n));
		sc.close();
	}
	
	public static int arrangeCoins(int n) {
        int k = 0;
        while(n >= k){
            n -= k;
            k ++;
        }
        return k-1;
    }
}
