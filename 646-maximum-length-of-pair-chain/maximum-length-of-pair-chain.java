class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int curr = Integer.MIN_VALUE, ans=0;
        for(int[] ele : arr){
            if(curr < ele[0]){
                curr = ele[1];
                ans++;
            }
        }
        return ans;
    }
}