class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count=0;
        int[] copy = nums.clone();
        Arrays.sort(copy);
        while(count<n){
            if(Arrays.equals(nums,copy)){
                return true;
            }
            else{
                int lastelement=nums[n-1];
                for(int i=n-1;i>0;i--){
                    nums[i]=nums[i-1];
                }
                nums[0]=lastelement;
                count++;
            }
        }
        return false;
    }
}