// class Solution {
//     public int beautySum(String s) {
//         int ans =0;
//         int n = s.length();
//         for(int i=0;i<n;i++){
//             HashMap<Character,Integer> map = new HashMap<>();
//             for(int j=i;j<n;j++){
//                 char ch = s.charAt(j);
//                 if(map.containsKey(ch)){
//                     int freq = map.get(ch);
//                     map.put(ch,freq+1);
//                 }
//                 else{
//                     map.put(ch,1);
//                 }
//                 int min = Integer.MAX_VALUE;
//                 int max = Integer.MIN_VALUE;
//                 for(int freq : map.values()){
//                     min = Math.min(min,freq);
//                     max = Math.max(max,freq);
//                 }
//                 ans += max-min;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < n; j++) {

                // Add current character
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                // Find minimum and maximum frequency
                for (int freq : map.values()) {
                    min = Math.min(min, freq);
                    max = Math.max(max, freq);
                }

                // Beauty = max frequency - min frequency
                ans += max - min;
            }
        }

        return ans;
    }
}