class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int i=0;
        HashSet<Integer> set = new HashSet<>();
        for(int j=0;j<n;j++){
            set.add(nums[j]);
        }
        while(i<n){
            int rev=0;
            while(nums[i]!=0){
                int digit = nums[i]%10;
                rev = rev*10 + digit;
                nums[i]/=10;
            }
            set.add(rev);
            i++;
        }
        return set.size();
    }
}