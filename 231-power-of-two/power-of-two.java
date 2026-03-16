class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        boolean flag =true;
        while(n>1){
            if(n%2!=0){
                flag = false;
            }
            n=n/2;
        }
        return flag;
    }
}