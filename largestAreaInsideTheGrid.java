public class largestAreaInsideTheGrid {


// 1 0 1 1 
// 1 0 0 0 
// 1 1 1 1
// 1 1 1 1
// so we are given grid like above we need to return the area with largest 
// number of 1's
// well if we look at the question we can simply find it that it is normal
// dfs problem

// lets solve without waiting too much.
public static int find(int [][] grid , int n){

boolean [][] visited = new boolean[n][n];

for(int i= 0; i<grid.length; i++){
    for(int j =0; j<grid[0].length; j++){
        visited[i][j] = false;
    }
}

int ans = 0;


for(int i =0; i<grid.length; i++){
    for(int j =0; j<grid[0].length; j++){
        if(grid[i][j]==1){
            ans = Math.max(ans, helper(i, j, grid, visited));
        }
    }
   
}
return ans;



}
public static int helper(int row , int col , int[][] grid , boolean [][] visited){

// base case
// that cell we are currently processing is valid or not.
if(row<0 || row>grid.length || col<0 || col>=grid[0].length ||grid[row][col]!=1 || visited[row][col])
return 0;

int sum =0;
grid[row][col] = 0;
sum++;
visited[row][col] = true;

sum+=helper(row-1, col, grid, visited);
sum+=helper(row+1, col, grid, visited);
sum+=helper(row-1, col-1, grid, visited);
sum+=helper(row+1, col+1, grid, visited);
sum+=helper(row, col-1, grid, visited);
sum+=helper(row, col+1, grid, visited);
sum+=helper(row-1, col+1, grid, visited);
sum+=helper(row+1, col-1, grid, visited);
return sum;








}


    
}
