package LeetCode;

public class LongestCommonPrefix_14 {
	public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) 
        	return "";
        
        //想比较所有字符串的最长前缀，那么可以从最长逐渐缩短，当只有一个字符串时，重合的前缀就是本身，当有两个字符串时，然后就在第一个字符串的基础上，逐次去掉最后一位，看是否是第二个字符串的前缀，如果是，则确定了两个字符串的共同最长前缀。依次比较三个、四个，即可逐步缩短公共前缀的长度，最后把所有字符串比较完时，得到的公共前缀就是最长公共前缀。
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)        //indexOf(str)=0就表示是子串且以此子串开头，即为前缀
                pre = pre.substring(0 , pre.length()-1);      //请注意subString(int begin, int end)是从下标begin到end-1，实际上这里还可以用StringBuffer的deleteCharAt(pre.length()-1)完成
        return pre;
    }
}