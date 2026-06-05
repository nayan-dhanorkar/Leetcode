class Solution {
    public int findMinArrowShots(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] ele : arr){
            // Arrays.toString(ele);
            if(ans.size()==0 || ans.get(ans.size()-1)[1] < ele[0]){
                ans.add(ele);
            }
            else{
                int start = Math.max(ans.get(ans.size()-1)[0],ele[0]);
                int end = Math.min(ans.get(ans.size()-1)[1],ele[1]);
                int[] interval = {start,end};
                ans.set(ans.size()-1,interval);
            }
        }
        return ans.size();
    }
}