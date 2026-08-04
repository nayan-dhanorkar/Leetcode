class Solution {
    public int maximumNumberOfStringPairs(String[] str) {
        HashSet<String> set = new HashSet<>();
        int n = str.length;
        int i=0;
        int count=0;
        while(i<n){
            if(set.contains(str[i])){
                count++;
                i++;
            }
            else{
                String rev = new StringBuilder(str[i]).reverse().toString();
                set.add(rev);
                i++;
            }
        }
        return count;
    }
}