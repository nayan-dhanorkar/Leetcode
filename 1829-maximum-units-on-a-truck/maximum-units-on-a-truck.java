class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        Arrays.sort(arr,(a,b)-> b[1]-a[1]);
        int sum =0;
        for(int i=0;i<arr.length;i++){
            int x = arr[i][0];
            int y = arr[i][1];
            int min = Math.min(x,truckSize);
            truckSize -= min;
            sum += min*y;
            if(truckSize==0){
                return sum;
            }
        }
        return sum;
    }
}