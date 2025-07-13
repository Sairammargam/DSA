class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int mx =1;
        int ct = 1;
        int i = 1, j = 0;
        while(i<Arrival.length && j<Departure.length){
                 if(Arrival[i]<=Departure[j]){
                    i++;
                    ct++;
                 }else{
                    ct--;
                    j++; 
                 }
                 mx =Math.max(ct,mx);
        }
        return mx;
    }
}
