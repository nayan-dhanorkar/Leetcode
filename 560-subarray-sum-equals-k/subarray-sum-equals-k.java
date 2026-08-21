class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int num : nums){
            sum+=num;
            int x = sum-k;
            if(map.containsKey(x)){
                count += map.get(x);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}