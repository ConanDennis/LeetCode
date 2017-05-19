package LeetCode;

import java.util.Arrays;

public class AssignCookies_455 {
	public static void main(String[] args){
		int[] g = {1,3,2,4,1};
		int[] s = {1,2,2,2};
		System.out.println(new AssignCookies_455().findContentChildren(g, s));
		
	}
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 , j = 0;
        for( ;i<g.length && j<s.length;j++) {          
        	if(g[i]<=s[j]) i++;      //如果当前child获得满足了，就开始考虑其他child，如果当前没有满足，就继续通过更多分量的cookie尝试。总之，无论i是否变化，j都要自加1
        }
        return i;          //i跳动了几次，就有几个child得到了满足
    }
}
