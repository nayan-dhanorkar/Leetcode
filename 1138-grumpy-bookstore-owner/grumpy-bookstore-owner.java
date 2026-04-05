class Solution {
    public int maxSatisfied(int[] cust, int[] arr, int min) {
        int n = arr.length;
        int i=0,j=min-1;
        int a =i;
        int b=j;
        int unsat=0;
        int maxsat=0;
        for(int x =i;x<=j;x++){
            if(arr[x]==1) unsat+=cust[x];
        }
        while(j<n){
            if(maxsat<unsat){
                maxsat=unsat;
                a=i;
                b=j;
            }
            i++;j++;
            if(arr[i-1]==1) unsat-=cust[i-1];
            if(j<n && arr[j]==1) unsat+=cust[j]; 
        }
        for(int x=a;x<=b;x++){
            arr[x]=0;
        }
        int sum =0;
        for(int x=0;x<n;x++){
            if(arr[x]==0) sum += cust[x];
        }
        return sum;
    }
}