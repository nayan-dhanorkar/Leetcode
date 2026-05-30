class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int n = p.length;
        int r=n-1;
        int l=0;
        int count=0;
        Arrays.sort(p);
        while(l<=r){
            if(p[r]+p[l]<=limit){
                r--;l++;
            }
            else r--;
            count++;
        }
        return count;
    }
}