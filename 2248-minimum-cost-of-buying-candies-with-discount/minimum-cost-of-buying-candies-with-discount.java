class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int l=0;
        int r=n-1;
        int count=0;
        int sum=0;
        while(l<=r){
            if(count<2){
                sum+=cost[r];
                r--;
                count++;
            }
            else if(count==2){
                r--;
                count=0;
            }
        }
        return sum;
    }
}