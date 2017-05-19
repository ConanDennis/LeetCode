package LeetCode;

import java.util.Stack;

public class ValidParentheses_20 {
	public static void main(String[] args){
		String s1 = "([{]})";
		String s2 = "([]{})";
		System.out.println(isValid(s1)+"/"+isValid(s2));
		
	}
	
	public static boolean isValid(String s) {
        if(s==null || s.length()%2!=0)
            return false;
            
        Stack<Character> stack = new Stack<Character>();   //因为括号是前后匹配的，所以用栈来模拟最合适
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')      //前括号一定在前面，所以遇到前括号就要入栈
                stack.push(c);
            else{                                     //遇到后括号
                if(stack.isEmpty())                   //如果栈已经为空，说明没有前括号与之匹配，不符合
                    return false;
                else if(c == ')' && stack.pop() != '(')    //如果是小后括号，那么前一位压入栈中的一定要是小前括号。如果栈顶不是小前括号，那么就不符合
                    return false;
                else if(c == ']' && stack.pop() != '[')
                    return false;
                else if(c == '}' && stack.pop() != '{')
                    return false;
            }
        }
        
        return stack.isEmpty();     //如果字符串有效，那么在经过入栈与出栈之后，栈一定为空。
        
    }
}
