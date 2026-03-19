class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] vis){
        int m= grid.length, n =grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        while(q.size()>0){
            Pair front = q.remove();
            int row = front.row, col = front.col;
            //top
            if((row)>0){
                if(grid[row-1][col]=='1' && vis[row-1][col]==false){
                    q.add(new Pair(row-1,col));
                    vis[row-1][col]=true;
                }
            }
            // bottom
            if((row+1)<m){
                if(grid[row+1][col]=='1' && vis[row+1][col]==false){
                    q.add(new Pair(row+1,col));
                    vis[row+1][col]=true;
                }
            }
            //right
            if((col+1)<n){
                if(grid[row][col+1]=='1' && vis[row][col+1]==false){
                    q.add(new Pair(row,col+1));
                    vis[row][col+1]=true;
                }
            }
            //left
            if((col)>0){
                if(grid[row][col-1]=='1' && vis[row][col-1]==false){
                    q.add(new Pair(row,col-1));
                    vis[row][col-1]=true;
                }
            }
        } 
    }
    public int numIslands(char[][] grid) {
        int m = grid.length, n =grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }
}