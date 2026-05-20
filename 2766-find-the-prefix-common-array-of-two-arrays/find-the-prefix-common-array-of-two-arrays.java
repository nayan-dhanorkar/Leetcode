class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int n =A.length;
        int[] c = new int[n];
        if(A[0]==B[0]){
            c[0]=1;
        }
        int i=0;
        int j=0;
        while(i<n){
            j=0;
            count=0;
            while(j<=i){
                for(int k=0;k<=i;k++){
                    if(A[j]==B[k]){
                        count++;
                    }
                }
                j++;
            }
            c[i]=count;
            i++;
        }
        return c;
    }
}