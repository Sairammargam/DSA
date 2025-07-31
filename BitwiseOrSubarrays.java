class Solution {
    public int subarrayBitwiseORs(int[] arr) {
       Set<Integer> ans = new HashSet<>();
       Set<Integer> prev = new HashSet<>();
      int n = arr.length;
      for(int num : arr){
            Set<Integer> curr = new HashSet<>();
            curr.add(num);
            for(int val : prev)
                  curr.add(val|num);
                  
            ans.addAll(curr);
            prev = curr;
     }
       return ans.size();
}
}
