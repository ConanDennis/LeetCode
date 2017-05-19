package LeetCode;

public class HammingDistance_461 {
	public static void main(String[] args){
		int x = 17;
		int y = 46;
		System.out.println(hammingDistance(x,y));
	}
	public static int hammingDistance(int x, int y) {
        int xs = 0 , ys = 0; 
        int count = 0;
        while(x!=0 && y!=0){
            xs = x % 2;
            ys = y % 2;
            if(xs != ys)
                count ++;
            x /= 2;
            y /= 2;
        }
        while(x != 0){
            xs = x % 2;
            if(xs == 1)
                count ++;
            x /= 2;
        }
        while(y != 0){
            ys = y % 2;
            if(ys == 1)
                count ++;
            y /= 2;
        }
        
        return count;
    }
}
