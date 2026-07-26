class Solution {
    public int climb(int[] cost,int i , int[] dp){
        if(i<=1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(climb(cost,i-1,dp),climb(cost,i-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(climb(cost,n-1,dp),climb(cost,n-2,dp    ));
    }
}