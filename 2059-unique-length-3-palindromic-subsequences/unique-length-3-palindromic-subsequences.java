class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int i=0;
        int count=0;
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();
        while(i<n){
            if(!fmap.containsKey(s.charAt(i))) fmap.put(s.charAt(i),i);
            lmap.put(s.charAt(i),i);
            i++;
        }
        for(char key : fmap.keySet()){
            int fidx = fmap.get(key);
            int lidx = lmap.get(key);
            HashSet<Character> set = new HashSet<>();
            for(int k=fidx+1;k<=lidx-1;k++){
                set.add(s.charAt(k));
            }
            count+=set.size();
        }
        return count;
    }
}