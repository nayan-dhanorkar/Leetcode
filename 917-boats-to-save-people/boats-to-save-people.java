class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p); 
        int n = p.length;
        int r=n-1;
        int l=0;
        int count=0;
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