package LeetCode;

public class ConstructRectangle_492 {
	public static void main(String[] args){
		int area = 16;
		for(int i:constructRectangle(area))
			System.out.print(i + " ");
	}
	
	//一个数的因子的较小的那一个，一定不会超过其开根号，只需寻着其根号逐次递减，知道可以被整除时，就得到这个数因子较小的那一个
	public static int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
	    while (area%w!=0) 
	        w--;
	    return new int[]{area/w, w};
    }
}
