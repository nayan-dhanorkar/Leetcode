class Solution {
    public boolean canPartitionGrid(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        long total=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total +=arr[i][j];
            }
        }
        // horizontal
        long curr=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                curr += arr[i][j];
            }
            if(curr*2 == total) return true;
        }
        //vertical
        curr=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                curr += arr[j][i];
            }
            if(curr*2 == total) return true;
        }
        return false;
    }
}