package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class KDiffPairsInArray_532 {
	
	//思路：用两个Set，一个用来存储数组元素，一个用来存储符合条件的元素。每次遍历到数组中的某个元素时，有可能满足条件的有两种情况，
	//一种是nums[i]-k和nums[i]，一种是nums[i和]nums[i]+k，如果把它们都加入到第二个set中，会导致下面的遍历出现重复统计的情况，想到用这样的方法来避免，
	//每次条件符合时，只将小的那个加入到set中，有一个元素就表示满足情况加一，那样就能避免重复统计了
	public int findPairs(int[] nums, int k) {
        if (k < 0) { return 0; }

        Set<Integer> starters = new HashSet<Integer>();
        Set<Integer> uniqs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqs.contains(nums[i] - k)) starters.add(nums[i] - k);
            if (uniqs.contains(nums[i] + k)) starters.add(nums[i]);
            uniqs.add(nums[i]);
        }

        return starters.size();
	}
}
