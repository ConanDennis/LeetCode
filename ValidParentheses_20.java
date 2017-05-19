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
            
        Stack<Character> stack = new Stack<Character>();   //��Ϊ������ǰ��ƥ��ģ�������ջ��ģ�������
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')      //ǰ����һ����ǰ�棬��������ǰ���ž�Ҫ��ջ
                stack.push(c);
            else{                                     //����������
                if(stack.isEmpty())                   //���ջ�Ѿ�Ϊ�գ�˵��û��ǰ������֮ƥ�䣬������
                    return false;
                else if(c == ')' && stack.pop() != '(')    //�����С�����ţ���ôǰһλѹ��ջ�е�һ��Ҫ��Сǰ���š����ջ������Сǰ���ţ���ô�Ͳ�����
                    return false;
                else if(c == ']' && stack.pop() != '[')
                    return false;
                else if(c == '}' && stack.pop() != '{')
                    return false;
            }
        }
        
        return stack.isEmpty();     //����ַ�����Ч����ô�ھ�����ջ���ջ֮��ջһ��Ϊ�ա�
        
    }
}
