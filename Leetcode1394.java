class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x :arr){
           mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getKey() == entry.getValue())
                 ans = Math.max(ans,entry.getKey());
        }
        return ans;
    }
}
