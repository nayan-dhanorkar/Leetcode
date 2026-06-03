class Solution {
    private int calc(int[] s1, int[] d1, int[] s2, int[] d2){
        int time = Integer.MAX_VALUE;
        for(int i=0;i<s1.length;i++){
            time = Math.min(time, s1[i]+d1[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<s2.length;i++){
            int total = Math.max(time,s2[i])+d2[i];
            ans = Math.min(ans,total);
        }
        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int order1 = calc(landStartTime, landDuration, waterStartTime, waterDuration);
        int order2 = calc(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(order1,order2);
    }
}