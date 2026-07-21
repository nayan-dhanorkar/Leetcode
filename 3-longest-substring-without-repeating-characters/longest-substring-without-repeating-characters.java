class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i=0,j=0;
        int len =0;
        int maxlen=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            if(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            else{
                map.put(s.charAt(j),j);
                len = j-i+1;
                maxlen = Math.max(maxlen,len);
                j++;
            }
        }
        return maxlen;
    }
}