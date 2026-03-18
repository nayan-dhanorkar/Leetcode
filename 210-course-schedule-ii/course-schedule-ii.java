class Solution {
    public boolean dfs(int i,List<List<Integer>> adj,List<Integer> ans,boolean[] vis,boolean[] pathVis){
        vis[i]=true;
        pathVis[i] =true;
        for(int ele : adj.get(i)){
            if(!vis[ele]){
                if(dfs(ele,adj,ans,vis,pathVis)) return true;
            }
            else if(pathVis[ele]){
                return true;
            }
        }
        pathVis[i]=false;
        ans.add(i);
        return false;
    }
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<prerequisites.length;i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(i,adj,ans,vis,pathVis)){
                    return new int[0];
                }
            }
        }
        Collections.reverse(ans);
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}