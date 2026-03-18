class Solution {
    // public void bfs(int i,int[][] isConnected,boolean[] arr){
    //     Queue<Integer> que = new LinkedList<>();
    //     int n = isConnected.length;
    //     arr[i]=true;
    //     que.add(i);
    //     while(que.size()>0){
    //         int front = que.remove();
    //         for(int j=0;j<n;j++){
    //             if(!arr[j] && isConnected[front][j]==1){
    //                 arr[j]=true;
    //                 que.add(j);
    //             }
    //         }
    //     }
    // }

    public void dfs(int i, int[][] adj,boolean[] vis){
        int n = adj.length;
        vis[i]=true;
        for(int j=0;j<n;j++){
            if(adj[i][j]==1 && !vis[j]){
                dfs(j,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count=0;
        boolean[] arr = new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i]==false){
                // bfs(i,isConnected,arr);
                dfs(i,isConnected,arr);
                count++;
            }
        }
        return count;
    }
}