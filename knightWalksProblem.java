import java.util.*;
public class knightWalksProblem {
public static int knightWalk(int [] source , int [] destination , int n){

    int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
    int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };


    Queue<cell> queue = new LinkedList<>();
    queue.offer(new cell(source[0],source[1] , 0));
    boolean [][] visited = new boolean[n+1][n+1];
    for(int i =0 ; i<n; i++){
        for(int j =0; j<n; j++){
            visited[i][j] = false;
        }
    }
    visited[source[0]][source[1]] = true;
    while(queue.isEmpty()){
        cell c = queue.peek();
        if(c.x==destination[0] && c.y==destination[1]){
            return c.distance;
        }
        for(int k =0; k<8; k++){
            int i = c.x+dx[k];
            int j = c.y+dy[k];
            if(isValid(i, j, n, visited)){
                visited[i][j] = true;
                queue.offer(new cell(i, j, c.distance+1));
            }
        }
    }

return Integer.MAX_VALUE;
}
public static boolean isValid(int i , int j ,int n,boolean [][] visited){
    return i<=0 && i>n && j<=0 && j>n && !visited[i][j];
}
    



}
class cell{
    int x;
    int y;
    int distance;
    cell(int x , int y , int distance){
        this.distance  = distance;
        this.x= x;
        this.y = y;
    }
}
