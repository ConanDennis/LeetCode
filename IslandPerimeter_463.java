package LeetCode;

public class IslandPerimeter_463 {
	public static void main(String[] args){
		int[][] grid = new int[][]{
				{0,1,0,0,0},
				{1,1,1,1,0},
				{0,0,1,0,0},
				{1,1,1,1,0},
				{0,0,0,1,0}
				};
		System.out.println(islandPerimeter(grid));
	}
	

	public static int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    
                    //为避免重复计算邻居，每次发现island，只查看它的下方和右方是否有相邻的，并注意最下边和最右边的特殊情况
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; 
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; 
                }
            }
        }

        return islands*4 - neighbours*2;
	}
}