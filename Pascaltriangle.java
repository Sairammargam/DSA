class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0)
          return ans;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);

        for(int i = 1;i<numRows;i++){
            List<Integer> prev  = ans.get(i-1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j = 1;j<i;j++)
               current.add(prev.get(j-1)+prev.get(j));

current.add(1);
            ans.add(current);
        }
        return ans;
    }
}
