class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int count=0;
        int previndex=-1;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                if(previndex!=-1){
                    count=Math.max(count,i-previndex);
                }
                previndex=i;
            }
        }
        return count;
    }
}