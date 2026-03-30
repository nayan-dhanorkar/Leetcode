class Solution {
    static boolean ans;
    // public void bfs(int i,int[][] adj,int[] visited){
    //     Queue<Integer> q = new LinkedList<>();
    //     visited[i]=0;
    //     q.add(i);
    //     while(q.size()>0){
    //         int front = q.remove();
    //         int color = visited[front];
    //         for(int ele : adj[front]){
    //             if(visited[ele]==visited[front]){
    //                 ans = false;
    //                 return;
    //             }
    //             if(visited[ele]==-1){
    //                 q.add(ele);
    //                 visited[ele]=1-color;
    //             }
    //         }
    //     }
    // }

    public boolean dfs(int i,int[][] adj,int[] visited,int color){
            visited[i] = color;
            for(int ele : adj[i]){
                if(visited[ele]==color){
                    return false;
                }
                if(visited[ele]==-1){
                    if(!dfs(ele,adj,visited,1-color)){
                        return false;
                    }
                }
            }
            return true;
    }

    public boolean isBipartite(int[][] adj) {
        ans = true;
        int n = adj.length;
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        for (int i = 0; i < n; i++) {
        if (visited[i] == -1) {
            if (!dfs(i, adj, visited, 0)) {
                return false;
            }
        }
    }
    return true;
    }
}