class Solution {
    public int MinimumCoins(int[] coins, int amount) {
          int n = coins.length;
          ArrayList<Integer> ans = new ArrayList<>();
          Arrays.sort(coins);
          for(int i = n-1;i>=0;i--){
            while(amount>=coins[i]){
                amount -= coins[i];
                ans.add(coins[i]);
            }
          }
          if(ans.size()==0 || amount !=0)
              return -1;
        return ans.size();
    }
}


