class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        Arrays.sort(nums);
        while(i<n && k>0 && nums[i]<0){
            nums[i] *= (-1);
            i++;k--;
        }
        if(k%2 == 1){
            Arrays.sort(nums);
            nums[0]*=(-1);
        }
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
        }
        return sum;
    }
}