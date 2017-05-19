package LeetCode;

public class FindDifference_389 {
	public static void main(String[] args){
		String s = "abcde";
		String t = "bdefca";
		System.out.println(findTheDifference(s,t));
		
	}
	
    public static char findTheDifference(String s, String t) {
        StringBuffer tb = new StringBuffer(t);
        for(int i = 0; i < s.length(); i++){
            if(tb.indexOf(String.valueOf(s.charAt(i))) >=0 )
                tb.deleteCharAt(tb.indexOf(String.valueOf(s.charAt(i))));
        }
        return tb.charAt(0);
    }
	
}
