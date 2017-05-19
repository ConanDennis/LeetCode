package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle_118 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int numRows = s.nextInt();
		List<List<Integer>> list = generate(numRows);
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		s.close();
	}
	public static List<List<Integer>> generate(int numRows) {   //里面的List装的是一行的元素，外面的List把一行的List作为元素装进来，也就是存储的是列信息
        int[][] pascal = new int[numRows][];
        for(int i = 0; i < numRows; i++){
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
        }
        
        for(int i = 2; i < numRows; i++)
            for(int j = 1; j < i; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
         
        List<List<Integer>> list = new ArrayList<List<Integer>>();     
        for(int i = 0; i < numRows; i++){
            List<Integer> l = new ArrayList<Integer>();
            for(int j = 0; j < pascal[i].length; j++){
                l.add(Integer.valueOf(pascal[i][j]));
            }
            list.add(l);
       
        }
        
        return list;
        
    }
}
