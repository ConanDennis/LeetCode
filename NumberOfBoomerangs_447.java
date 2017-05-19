package LeetCode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs_447 {
	public static void main(String[] args){
		int[][] points = new int[][]{
				{0,0},
				{1,0},
				{2,0},
				{3,0}
		};
		System.out.println(numberOfBoomerangs(points));
	}
	
	//本题在于理解题意，题目的大意是说，在给定的points中，找出能构成三角回标的情况数，一个三角回标中，有两个点j,k到另一个点i的距离相等，而且j,k有位置顺序。
	//也就是说，以i点为中心，假如有n个点到i的距离相等，那么以i为中心就可以构成An2个三角回标
	//所以，只需要遍历完以所有点为中心的情况，将以每个点为中心能构成的三角回标数加起来，就得到结果
	
	public static int numberOfBoomerangs(int[][] points) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();   //用HashMap来记录每个距离的point数量
        int dis = 0 ,total = 0;
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++){
                if(i == j)     //之所以i和j都是从0到points.length，是因为要考虑点与点之间的顺序，互换位置之后，中心就变了，左右翼也会变，三角回标的构成就会变。但自己本身就可以略过了
                    continue;
                dis = (int)Math.pow(points[j][0]-points[i][0],2) + (int)Math.pow(points[j][1]-points[i][1],2);
                //严格来说dis是需要开根号的，但是这里无需算出具体结果，只是为了区分距离的不同
                if(!map.containsKey(dis))
                    map.put(dis,1);
                else
                    map.put(dis,map.get(dis)+1);
            }
            
            Collection<Integer> set = map.values();    //Map的values()方法可以返回map中存储的所有value的Collection视图
            for(int n : set){
                if(n>1)                  //只要有2个或2个以上的点到当前中心的距离相等，就能构成三角回标
                    total += n*(n-1);      //An2 = n!/(n-2)! = n*(n-1)
                
            }
            map.clear();              //每换一个中心，重新开始记录
            
        }
        
        return total;
    }
}
