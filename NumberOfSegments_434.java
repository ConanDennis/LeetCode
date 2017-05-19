package LeetCode;

public class NumberOfSegments_434 {
	public static void main(String[] args){
		String s = ", , , ,        a, eaefa";
		System.out.println(countSegments(s));
	}
	public static int countSegments(String s) {
        if(s.equals(""))
            return 0;
        String[] ss = s.split(" ");
        int len = ss.length;
        for(String a : ss){
        	if(a.equals(""))
        		len = len-1;     //如果有连续的空格，分割之后会出现很多空字符串，应该把这些空的减掉
        }
        return len;
    }
}
