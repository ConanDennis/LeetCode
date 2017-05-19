package LeetCode;

//import java.util.HashSet;
//import java.util.Set;

public class RepeatedSubstringPattern_459 {
	public static void main(String[] args){
		String str = "ababaababa"/*"abababaaba"*/;
		System.out.println(repeatedSubstringPattern(str));
	}
	
	
	//天才的解法，如果是重复的话，如AA型，那么两个并起来后，成为AAAA，破坏首尾的A，成为BAAB，那么其中包不包含原来的AA就是判断是否重复的条件。
	public static boolean repeatedSubstringPattern(String str) {
		String s = str + str;
        return s.substring(1, s.length()-1).contains(str);
    }
	
	
	//笨蛋的解法：从头开始遍历，如果遇到没出现过的字符，就把它加到sub中，如果遇到出现过的字符，说明可能开始重复之前的sub了。
	//如果是的话，那么让sub和剩下的字符串逐段比较之后，每段都能匹配。如果不是的话，那么就继续让sub添加字符。然后重复上述步骤。
	/*public static boolean repeatedSubstringPattern(String str) {
		if(str.length()==1)
            return false;
        if(str.substring(0,str.length()/2).equals(str.substring(str.length()/2,str.length())))
            return true;
            
        StringBuffer strbuf = new StringBuffer(str);
        StringBuffer sub = new StringBuffer();
        String temp = "";
        Set<Character> set = new HashSet<>();
        
        outer: for(int i =0 ; i<str.length(); i++){
            if(sub.length() > str.length()/2)      //如果sub超过了原字符串的一半，就无需再做比较了
                return false;
            char c = str.charAt(i);
            
            if(!set.contains(c)){
                sub.append(c);
                set.add(c);
                strbuf.deleteCharAt(0);
            }else{
                while(strbuf.length()>=sub.length()){
                    if(strbuf.substring(0,sub.length()).toString().equals(sub.toString()) ){
                        strbuf.delete(0,sub.length());
                        temp = temp + sub;
                        //避免这种情况，"abababaaba"，如果不加这一条和下面的sub.append(temp)，前三个"ab"都会被delete，剩下strbuf="aaba"，此时"aa"与sub="ab"匹配不上，
                        //则sub会把后面的'a'添加上来，sub="aba"，剩下strbuf="aba"，正好又能匹配上了，会返回true，而实际上这个字符串不是重复的。因此要用一个变量把之前因为匹配过而删除的子串记录下来，等到不能全部匹配的情况发生时，再把它们加到sub上去。
                    	
                    }else{
                    	sub.append(temp);
                        sub.append(c);
                        strbuf.deleteCharAt(0);
                        continue outer;
                    }
                }
                if(strbuf.length() == 0)
                    return true;
              
            }
        }
        return false;
    }*/
}
