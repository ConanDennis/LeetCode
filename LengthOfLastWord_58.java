package LeetCode;

public class LengthOfLastWord_58 {
	public static void main(String[] args){
		String s = "Hello World My Home";
		System.out.println(lengthOfLastWord(s));
		
	}
	
	public static int lengthOfLastWord(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        String[] sarr = s.split(" ");    //ֱ����������ʽ�ָ������
        if(sarr.length == 0)
            return 0;
        String ss = sarr[sarr.length-1];
        return ss.length();
    }
}
