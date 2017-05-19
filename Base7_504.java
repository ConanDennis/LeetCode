package LeetCode;

public class Base7_504 {
	public static void main(String[] args){
		int num = -48;
		System.out.println(convertToBase7(num));
	}
	
	//7进制转换，没啥可说的，要注意的就是负数的情况。
	public static String convertToBase7(int num) {
        if(num == 0)
            return "0";
        int temp = (int)Math.abs(num);
        StringBuilder s = new StringBuilder();
        while(temp != 0){
            s.append(temp%7);
            temp /= 7;
        }
        if(num < 0)
            s.append("-");
        return s.reverse().toString();
    }
}
