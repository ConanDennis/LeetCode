package LeetCode;

class GuessGame{
	public static int n = 15;
	public int guess(int m){
		int myNumber = (int) (Math.random()*n);
		
		if(myNumber > m) return 1;
		else if(myNumber < m) return -1;
		else return 0;
	}
}

public class GuessNumHigherOrLower_374 extends GuessGame{
	public static void main(String[] args){
		System.out.println(new GuessNumHigherOrLower_374().guessNumber(GuessGame.n));
	}
	
	public int guessNumber(int n) {
        return guessNumRecur(1,n);
    }
    public int guessNumRecur(int low,int high) {
        if(low >= high) 
            return low;
        
        int mid = low + (high-low)/2;
        if (guess(mid) == 0) {
            return mid;
        }else if(guess(mid) > 0) {
            return guessNumRecur(mid+1,high);
        }else {
            return guessNumRecur(low,mid-1);
        }
    }
}
