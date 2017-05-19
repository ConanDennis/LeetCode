package LeetCode;

public class AddStrings_415 {
	public static void main(String[] args){
		String num1 = "123";
		String num2 = "34";
		System.out.println(addStrings(num1,num2));
	}
	
	//比较简单，从低位向高位逐位相加，每一位产生该位上的数和进位值，直到两个字符串的每一位和进位都加完即可
	public static String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int temp=0 , cur=0 , jin = 0;
        int len1=num1.length(), len2=num2.length();
        int i ,j;
        for(i=len1-1,j=len2-1; i>=0 && j>=0; i--,j--){
            char n1 = num1.charAt(i) , n2 = num2.charAt(j);
            temp = Integer.parseInt(n1+"") + Integer.parseInt(n2+"") + jin;
            cur = temp%10;
            jin = temp/10;
            sb.append(cur+"");
        }
        while(i>=0){
            char n1 = num1.charAt(i);
            temp = Integer.parseInt(n1+"") + jin;
            cur = temp%10;
            jin = temp/10;
            sb.append(cur+"");
            i--;
        }
        while(j>=0){
            char n2 = num2.charAt(j);
            temp = Integer.parseInt(n2+"") + jin;
            cur = temp%10;
            jin = temp/10;
            sb.append(cur+"");
            j--;
        }
        if(jin > 0)
            sb.append(jin);
        
        return sb.reverse().toString();
    }
}
