package LeetCode;

public class ReverseStringII_541 {
	
	//思路：只要找到前面2k的顺序，后面的只需按前面2k的规律拼接即可
	public String reverseStr(String s, int k) {
        int len = s.length() ;
        StringBuilder sb = new StringBuilder(s);
        if(len <= k){
            return sb.reverse().toString();
        } else if(len>k && len<=k*2){
            return new StringBuilder(sb.substring(0,k)).reverse().append(sb.substring(k)).toString();
            //return temp.toString();
        } else {
            String qian = sb.substring(0,k*2);
            String hou = sb.substring(k*2);
            return reverseStr(qian,k) + reverseStr(hou,k);
        }
        
    }
}
