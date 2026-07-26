class Solution {
    public int maximumUnits(int[][] arr, int k) {
        int m = arr.length;
        int n = arr[0].length;
        int sum =0;
        int i=0;
        int j=0;
        Arrays.sort(arr,(a,b) -> Integer.compare(b[1],a[1]));
        while(k!=0 && i<m){
            if(arr[i][j]>0){
                k--;
                sum+= arr[i][j+1];
                arr[i][j]-=1;
            }
            else i++;
        }
        return sum;
    }
}