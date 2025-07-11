class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        long [] last = new long [n];
        int [] usedCount = new int [n];
        for(int [] meeting : meetings){
            int start = meeting[0];
            int end = meeting[1];
            boolean found = false;
            int duration = end - start;
            long  earlyroomTime=Long.MAX_VALUE;
            int earlyendroom = 0;
            for(int room =0;room<n;room++){
                if(last[room]<=start){
                    last[room]=end;
                    found=true;
                    usedCount[room]++;
                    break;
                }
                if(last[room]<earlyroomTime){
                    earlyroomTime = last[room];
                    earlyendroom = room;
                }
            }
            if(!found){
                 last[earlyendroom]+=duration;
                 usedCount[earlyendroom]++;
            }
        }
    int ans = -1;
    int maxuse = 0;
    for(int room = 0;room<n;room++){
        if(usedCount[room]>maxuse){
            maxuse = usedCount[room];
            ans = room;
        }
    }
    return ans;
        
    }
}
