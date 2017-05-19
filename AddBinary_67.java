package LeetCode;

public class AddBinary_67 {
	public static void main(String[] args){
		String a = "1011010010110000010";
		String b = "1110000010101";
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
        int alen = a.length() , blen = b.length();
        StringBuffer sb = new StringBuffer();
        int pos=0 , jin=0 ,cur=0;                 //pos得到本位上的结果，jin是该位上的进位
        int i ,j;
        for(i=alen-1,j=blen-1; i>=0&&j>=0; i--,j--){                //从后往前逐位相加，注意考虑到进位，i是a的指针，j是b的指针
            cur = Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(j)+"") + jin;
            if(cur == 0){
                pos = 0;
                jin = 0;
            }else if(cur == 1){
                pos = 1;
                jin = 0;
            }else if(cur == 2){
                pos = 0;
                jin = 1;
            }else{
                pos = 1;
                jin = 1;
            }
            sb.append(pos);
        }
        
        //如果是a比较短，那么当for循环结束，一定是i=-1，那么继续计算b多出来的那几位就行了
        if(i<0){
            while(j>=0){
                cur = Integer.parseInt(b.charAt(j)+"") + jin;
                if(cur == 0){
                    pos = 0;
                    jin = 0;
                }else if(cur == 1){
                    pos = 1;
                    jin = 0;
                }else{
                    pos = 0;
                    jin = 1;
                }
                sb.append(pos);
                j--;
            }
            if(jin == 1)              //当计算完a和b相加完的本位，还要看有没有最高位的一个进位，有就加上
                sb.append(jin);
        }
        //如果是b比较短，那么当for循环结束，一定是j=-1，那么继续计算a多出来的那几位就行了
        else if(j<0){
            while(i>=0){
                cur = Integer.parseInt(a.charAt(i)+"") + jin;
                if(cur == 0){
                    pos = 0;
                    jin = 0;
                }else if(cur == 1){
                    pos = 1;
                    jin = 0;
                }else{
                    pos = 0;
                    jin = 1;
                }
                sb.append(pos);
                i--;
            }
            if(jin == 1)
                sb.append(jin);
        }
        
        /*用一个指针的代码，原理基本一致，但耗时多1ms，因为多用了两次StringBuffer的reverse()
        int alen = a.length() , blen = b.length();
        int sholen = Math.min(alen,blen);
        
        StringBuffer aa = new StringBuffer(a).reverse();
        StringBuffer bb = new StringBuffer(b).reverse();
        
        StringBuffer sb = new StringBuffer();
        int pos=0 , jin=0 ,cur=0;
        int i;
        for(i=0; i < sholen; i++){
            cur = Integer.parseInt(aa.charAt(i)+"") + Integer.parseInt(bb.charAt(i)+"") + jin;
            if(cur == 0){
                pos = 0;
                jin = 0;
            }else if(cur == 1){
                pos = 1;
                jin = 0;
            }else if(cur == 2){
                pos = 0;
                jin = 1;
            }else{
                pos = 1;
                jin = 1;
            }
            sb.append(pos);
        }
        while(i<alen){
            cur = Integer.parseInt(aa.charAt(i)+"") + jin;
                if(cur == 0){
                    pos = 0;
                    jin = 0;
                }else if(cur == 1){
                    pos = 1;
                    jin = 0;
                }else{
                    pos = 0;
                    jin = 1;
                }
                sb.append(pos);
                i++;
            
        }
        while(i<blen){
            cur = Integer.parseInt(bb.charAt(i)+"") + jin;
                if(cur == 0){
                    pos = 0;
                    jin = 0;
                }else if(cur == 1){
                    pos = 1;
                    jin = 0;
                }else{
                    pos = 0;
                    jin = 1;
                }
                sb.append(pos);
                i++;
        }
        
        if(jin == 1)
            sb.append(jin);*/
        
        return sb.reverse().toString();
        
    }
}
