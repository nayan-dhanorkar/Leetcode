class Solution {
    public int[] findEvenNumbers(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=100;i<999;i+=2){
            int x = i;
            int a = x%10; x /= 10;
            int b = x%10; x /= 10;
            int c = x;
            if(map.containsKey(a)){
                int afreq = map.get(a);
                map.put(a,afreq-1);
                if(afreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bfreq = map.get(b);
                    map.put(b,bfreq-1);
                    if(bfreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        int cfreq = map.get(c);
                        map.put(c,cfreq-1);
                        if(cfreq==1) map.remove(c);
                        list.add(i);
                        map.put(c,cfreq);
                    }
                    map.put(b,bfreq);
                }
                map.put(a,afreq);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}