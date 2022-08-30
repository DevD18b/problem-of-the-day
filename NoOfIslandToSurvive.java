public class NoOfIslandToSurvive {
    public static int countIsland(int [][] grid){

        int row  = grid.length;
        int col  = grid[0].length;
        boolean [][] visited = new boolean[row][col];
        int count  = 0;
        for(int i =0; i<row; i++){
           for(int j =0; j<col; j++){
            if(!visited[i][j] && grid[i][j]==1){
                dfs(i , j , row,col , grid,  visited);
                count++;
            
            }
           }
        }
        return count;
    }

    private static void dfs(int i, int j, int row, int col, int[][] grid, boolean[][] visited) {
   
        if(i<0 || i>=row || j<0 || j>=col || visited[i][j]|| grid[i][j]==0) return;


        visited[i][j] = true;

        dfs(i+1, j, row, col, grid, visited);
        dfs(i-1, j, row, col, grid, visited);
        dfs(i, j+1, row, col, grid, visited);
        dfs(i, j-1, row, col, grid, visited);
    }
    
}
