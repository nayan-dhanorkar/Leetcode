class Solution {
    public int longestOnes(int[] arr, int k) {
        int i=0,j=0,count=0,maxlen=0;
        int n = arr.length;
        for(j =0;j<n;j++){
            if(arr[j]==0) count++;
            while(k<count){
                if(arr[i]==0) count--;
            i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}