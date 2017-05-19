package LeetCode;

public class ConvertNumberToHex_405 {
	public static void main(String[] args){
		int num = -27;
		System.out.println(toHex(num));
	}
	
	//这道题比较简单，只需理解10进制整数转换成16进制整数的原理就行了，16进制数的0-9与10进制是一样的，从10-15开始不一样
	//特别要注意的是，正数可以通过求模运算直接从十进制转换到十六进制，负数转换16进制的过程不能像正数那样。因为数在计算机中都是以二进制补码的形式存储的，正数的原码和补码一致，负数的原码和补码是不一样的，如果直接用求模运算是得不到正确结果的，
	//所以这里要追根溯底到二进制与十六进制间的转换，四个二进制位可以凑成一个十六进制位，所以只要四个四个位转化，就能将负数转换成十六进制补码。其实对于正数也适用，只是略微繁琐了些
	public static String toHex(int num) {
		StringBuffer sb = new StringBuffer();
        if(num>=0 && num<=9){
            return num+"";
        } else if(num>9){
            while(num!=0){
            	int yushuInt = num%16;
            	if(yushuInt>=0 && yushuInt<=9)
            	    sb.append(yushuInt);
            	else{
                    String yushu = yushuInt + "";
                    if(yushu.equals("10"))
                        yushu = "a";
                    else if(yushu.equals("11"))
                        yushu = "b";
                    else if(yushu.equals("12"))
                        yushu = "c";
                    else if(yushu.equals("13"))
                        yushu = "d";
                    else if(yushu.equals("14"))
                        yushu = "e";
                    else
                        yushu = "f";
                    sb.append(yushu);
                
            	}
                num = num/16;
            }
            return sb.reverse().toString();
           
        } else{
            while(num!=0){
                int decimal = num&15 ;       //相当于每次拿num的最后四位与1111相与
                if(decimal>=0 && decimal<=9)
            	    sb.append(decimal);
            	else{
                    String hex = decimal + "";
                    if(hex.equals("10"))
                        hex = "a";
                    else if(hex.equals("11"))
                        hex = "b";
                    else if(hex.equals("12"))
                        hex = "c";
                    else if(hex.equals("13"))
                        hex = "d";
                    else if(hex.equals("14"))
                        hex = "e";
                    else if(hex.equals("15"))
                        hex = "f";
                    sb.append(hex);
            	}
                num = num>>>4;       //用无符号右移四位，就能达到每次计算四位的目的了
            }
            return sb.reverse().toString();
        }
        
    }
}
