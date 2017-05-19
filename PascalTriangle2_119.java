package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle2_119 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int rowIndex = s.nextInt();
		List<Integer> list = getRow(rowIndex);
		System.out.println(list);
		s.close();
	}
	
	//��118�����ͬ˼·
	public static List<Integer> getRow(int rowIndex) {
        int[][] pascal = new int[rowIndex+1][];
        for(int i = 0; i < rowIndex+1; i++){
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
        }
        
        for(int i = 2; i < rowIndex+1; i++)
            for(int j = 1; j < i; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
         
        List<List<Integer>> list = new ArrayList<List<Integer>>();     
        for(int i = 0; i < rowIndex+1; i++){
            List<Integer> l = new ArrayList<Integer>();
            for(int j = 0; j < pascal[i].length; j++){
                l.add(Integer.valueOf(pascal[i][j]));
            }
            list.add(l);
           
        }
        
        return list.get(rowIndex);
    }
}
