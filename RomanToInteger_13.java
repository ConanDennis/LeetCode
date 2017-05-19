package LeetCode;

public class RomanToInteger_13 {
	public static void main(String[] args){
		String s = "DCXXI";
		System.out.println(romanToInt(s));
		
	}
	
	public static int romanToInt(String s) {
        int[] in = new int[26];
        in['I' - 'A'] = 1;
        in['V' - 'A'] = 5;
        in['X' - 'A'] = 10;
        in['L' - 'A'] = 50;
        in['C' - 'A'] = 100;
        in['D' - 'A'] = 500;
        in['M' - 'A'] = 1000;
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++)
            sum += in[s.charAt(i) - 'A'];    
        
        for(int i = 0; i < s.length()-1; i++)
            if(in[s.charAt(i)-'A'] < in[s.charAt(i+1)-'A'])
                sum -= in[s.charAt(i) - 'A']*2;
            
        return sum;
    }
	
	/*自己最初的解法
	 * 
	public static int romanToInteger(String s){
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum += convert(s.charAt(i));
		}
		
		for(int i = 0; i < s.length()-1; i++){
			if(convert(s.charAt(i)) < convert(s.charAt(i+1))){
				
				sum -= 2*convert(s.charAt(i));
				
			}
				
			
		}
		
		return sum;
		
	}
	
	public static int convert(char ch){
		int a = 0;
		
		if(ch == 'I')
			a = 1;
		else if(ch == 'V')
			a = 5;
		else if (ch == 'X')
			a = 10;
		else if (ch == 'L')
			a = 50;
		else if (ch == 'C')
			a = 100;
		else if (ch == 'D')
			a = 500;
		else if (ch == 'M')
			a = 1000;
		
		return a;
	}
	*/
    
}




