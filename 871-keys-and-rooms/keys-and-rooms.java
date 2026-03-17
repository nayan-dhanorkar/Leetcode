class Solution {
    public void bfs(int i,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front = q.remove();
            int n = rooms.get(front).size();
            for(int j=0;j<n;j++){
                int nextroom = rooms.get(front).get(j);
                if(!vis[nextroom]){
                    vis[nextroom]=true;
                    q.add(nextroom);
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0]=true;
        bfs(0,rooms,vis);
        for(boolean ele : vis){
            if(ele == false) return false;
        }
        return true;
    }
}