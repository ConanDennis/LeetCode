package LeetCode;

public class TwoSumII_167 {
	public static void main(String[] args){
		int[] numbers = {2,7,11,13};
		int target = 9;
		int[] res = twoSum(numbers,target);
		System.out.print(res[0]+" ");
		System.out.print(res[1]+" ");
	}
	
	//从两头向中间逐步逼近，和大了就把右指针向左移，小了就把左指针向右移
	public static int[] twoSum(int[] numbers, int target) {
		int[] indice = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
		/*int[] result = new int[2];
        for(int i=0; i<numbers.length && numbers[i]<=target; i++){
            int cha = target - numbers[i];
            for(int j=i+1; j<numbers.length &&numbers[j]<=cha; j++){
                if(numbers[j] == cha){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
            continue;   
        }
        return result;*/
    }
}
