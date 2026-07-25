class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int j=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = ((arr[i]%k)+k)%k;
            if(map.containsKey(x)){
                int freq = map.get(x);
                map.put(x , freq+1);
            }
            else{
                map.put(x , 1);
            }
        }

        if(map.containsKey(0)){
            if(map.get(0)%2!=0) return false;
            map.remove(0);
        }
        if(k%2==0 && map.containsKey(k/2)){
            if(map.get(k/2)%2!=0) return false;
            map.remove(k/2);
        }
        for(int key : map.keySet()){
            int rem = k-key;
            if(!map.containsKey(rem)) return false;
            int keyfreq = map.get(key);
            int remfreq = map.get(rem);
            if(keyfreq!=remfreq) return false;
        }
        return true;
    }
}