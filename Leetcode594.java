class Solution {
    public int findLHS(int[] nums) {
        int maxi = 0;
      Map<Integer,Integer> mp = new HashMap<>();
      for(int num : nums){
        mp.put(num,mp.getOrDefault(num,0)+1);
      }
      for(int key : mp.keySet()){
        if(mp.containsKey(key+1))
             maxi = Math.max(maxi,mp.get(key)+mp.get(key+1));
      }
      return maxi;
    }
}
