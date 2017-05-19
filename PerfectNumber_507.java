package LeetCode;

public class PerfectNumber_507 {
	
	//思路：要找出所有因子，遍历完一般长度肯定是有很多浪费的，因为因子都是成对的，所以找到一个因子的同时另一个也能找出来，而遍历的长度在根号n即可
	public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        
        return sum == num;
        
    }
}
