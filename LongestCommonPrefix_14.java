package LeetCode;

public class LongestCommonPrefix_14 {
	public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) 
        	return "";
        
        //��Ƚ������ַ������ǰ׺����ô���Դ�������̣���ֻ��һ���ַ���ʱ���غϵ�ǰ׺���Ǳ������������ַ���ʱ��Ȼ����ڵ�һ���ַ����Ļ����ϣ����ȥ�����һλ�����Ƿ��ǵڶ����ַ�����ǰ׺������ǣ���ȷ���������ַ����Ĺ�ͬ�ǰ׺�����αȽ��������ĸ������������̹���ǰ׺�ĳ��ȣ����������ַ����Ƚ���ʱ���õ��Ĺ���ǰ׺���������ǰ׺��
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)        //indexOf(str)=0�ͱ�ʾ���Ӵ����Դ��Ӵ���ͷ����Ϊǰ׺
                pre = pre.substring(0 , pre.length()-1);      //��ע��subString(int begin, int end)�Ǵ��±�begin��end-1��ʵ�������ﻹ������StringBuffer��deleteCharAt(pre.length()-1)���
        return pre;
    }
}