class Solution {
  class Job{
    int id,deadline,profit;
     Job(int id , int dl, int p){
      this.id=id;
      deadline = dl;
      profit=p;
    }
  }
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        int n = Jobs.length;
        Job[] jobs = new Job[n];
        for(int i = 0;i<n;i++)
           jobs[i]=new Job(Jobs[i][0],Jobs[i][1],Jobs[i][2]);
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadLine = 0;
        for(Job j : jobs){
          maxDeadLine=Math.max(maxDeadLine,j.deadline);
        }
        boolean slot[] = new boolean[maxDeadLine+1];
        int jobCount = 0, maxProfit = 0;
        for(Job j: jobs){
          for(int i = j.deadline;i>0;i--){
                if(!slot[i]){
                  slot[i]=true;
                  jobCount++;
                  maxProfit+=j.profit;
                  break;
                }
          }
        }

        return new int [] {jobCount,maxProfit};
    }
}
