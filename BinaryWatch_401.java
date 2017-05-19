package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch_401 {
	public static void main(String[] args){
		int num = 6;
		System.out.println(readBinaryWatch(num));
	}
	
	//想通过给定亮灯数来得到所有可能的情况是不现实的，一是并不知道上下分别有几盏灯，二是即使知道想遍历开销也是相当大的，如果有三盏灯，就要有三层循环，所以本题想直接遍历是不可取的。
	public static List<String> readBinaryWatch(int num) {
		ArrayList<String> list = new ArrayList<>();
		
		//法1：前向匹配
		//既然上下几盏灯不方便考虑，那就选择回避。直接遍历所有的时间，来反推每一刻时间的亮灯情况，从而匹配总亮灯数为num的情况
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) {     //Integer的bitcount()方法可以直接得到一个数的二进制含有几个1，恰好这题连哪几个位置是1都不需要知道，只需要匹配总个数
                    list.add(String.format("%d:%02d", i, j));               //&02d表示2位整数，不足2位时自动补0
                }
            }
        }
        return list;
        
        /*法2：暴力解
         *既然把所有情况遍历得出来很困难，那就人为先把所有情况写出来，然后再上下个数分配一下，满足总数为num，再在数组中遍历就很简单了。而且这种解法耗时非常短
         * String[][] hour = {
    	    {"0"},     //亮0个
            {"1", "2", "4", "8"},    //亮1个
    		{"3", "5", "6", "9", "10"},
    	    {"7", "11"}
    	};
    	String[][] minute = {
    	    {"00"}, 
    		{"01", "02", "04", "08", "16", "32"},
    		{"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"},
    		{"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"},
    		{"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"},
    		{"31", "47", "55", "59"}
    	}; 
     
    	List<String> ret = new ArrayList<String>();
    	for (int i = 0; i <= 3 && i <= num; i++) {
    		if (num - i <= 5) {
    			for (String str1 : hour[i]) {
    				for (String str2 : minute[num - i]) {
    					ret.add(str1 + ":" + str2);
    				}
    			}
    		}
    	}
    	return ret;*/
    }
	
}
