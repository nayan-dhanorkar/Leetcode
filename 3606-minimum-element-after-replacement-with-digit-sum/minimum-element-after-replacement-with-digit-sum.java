class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        // String s = Arrays.toString(nums);
        // int[] arr =new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            while(nums[i]>0){
                sum += nums[i]%10;
                nums[i]/=10;
            }
            // arr[i]=sum;
            min=Math.min(min,sum);
        }
        return min;
    }
}