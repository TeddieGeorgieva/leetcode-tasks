public class Solution {
    public static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    counter++;
                }
            }
        }
        return counter;
        
    }
    public static void main(String[] args) {
        
        int[][] grid = {{1,2,-3,4}, {5,-6,7,8}};
        System.out.println(countNegatives(grid));
    }
}