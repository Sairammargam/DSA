class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int max = 0;
        int cookIdx = s.length-1;
        int childIdx = g.length-1;
        while(cookIdx>=0 && childIdx>=0){
            if(s[cookIdx]>=g[childIdx]){
                max++;
                cookIdx--;
                childIdx--;
            }
            else
               childIdx--;
        }
        return max;
    }
}
