class Solution {
    public int reverse(int n){
        int rev =0;
        while(n!=0){
            rev = rev*10 + n %10;
            n/=10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = nums[i] - reverse(nums[i]);
            if(map.containsKey(x)){
                int freq=map.get(x);
                count+=freq;
                count %= 1000000007;
                map.put(x,freq+1);
            }
            else{
                map.put(x,1);

            }
        }
        return count;
    }
}