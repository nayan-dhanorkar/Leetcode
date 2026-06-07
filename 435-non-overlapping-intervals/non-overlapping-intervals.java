class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        for(int[] ele : arr){
            if(ans.size()==0 || ans.get(ans.size()-1)[1] <= ele[0]){
                ans.add(ele);
            }
            // else{
                
            // }
        }
        return (arr.length-ans.size());
    }
}