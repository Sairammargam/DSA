class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
          List<Integer> freeTime = new ArrayList<>();
          freeTime.add(startTime[0]);
          for(int i = 1;i<startTime.length;i++){
            freeTime.add(startTime[i]-endTime[i-1]);
          }
          freeTime.add(eventTime-endTime[endTime.length-1]);
          int i = 0, j = 0;
          int sum = 0, maxi = 0;
          int n = freeTime.size();
          while(j<n){
               sum += freeTime.get(j);
               if(i<n && (j-i+1)>k+1){
                     sum -= freeTime.get(i); 
                     i++;
               }
                 maxi = Math.max(maxi,sum);
               j++;
          }
          return maxi;
          
    }
}
