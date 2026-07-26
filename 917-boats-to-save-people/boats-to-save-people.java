class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        int count=0;
        Arrays.sort(arr);
        while(i<=j){
            // if(arr[j]==limit){
            //     count++; j--;
            // }
            // else if((arr[i]+arr[j])==limit){
            //     count++; i++ ; j--;
            // }
            // else if((arr[i]+arr[j])>limit){
            //     count++; j--;
            // }
            if(arr[i]+arr[j]<=limit){
                i++; j--;
            }
            else j--;
            count++;
        }
        return count;
    }
}