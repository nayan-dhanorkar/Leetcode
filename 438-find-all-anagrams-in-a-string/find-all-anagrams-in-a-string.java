class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
        if(s.length()<p.length()){
            return arr;
        }
        HashMap<Character,Integer> pmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        for(char ch : p.toCharArray()){
            pmap.put(ch, pmap.getOrDefault(ch,0)+1);
        }
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(j-i+1 > p.length()){
                char removed = s.charAt(i);
                smap.put(removed,smap.get(removed)-1);

                if(smap.get(removed)==0){
                    smap.remove(removed);
                }
                i++;
            }
            if(smap.equals(pmap)){
                arr.add(i);
            }
        }
        return arr;
    }
}