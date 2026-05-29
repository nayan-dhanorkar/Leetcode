class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        String s = Arrays.toString(nums);
        int[] arr =new int[n];
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            while(nums[i]>0){
                sum += nums[i]%10;
                nums[i]/=10;
            }
            arr[i]=sum;
            sum=0;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}