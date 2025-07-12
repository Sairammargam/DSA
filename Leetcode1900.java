class Solution {
    int mx=Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
    int N =0,f=0,s=0;
    int dp[][][] = new int[27][27][27];
    public void cal(int mask , int round, int i, int j,int l , int m , int r){

        if(i>=j){
             cal(mask,round+1,0,N,l,m,r);
        }else if((mask&(1<<i))==0){
            cal(mask,round,i+1,j,l,m,r);
        } else if((mask&(1<<j))==0){
            cal(mask,round,i,j-1,l,m,r);
        }
        else if(i==f && j==s){
            mn = Math.min(mn,round);
            mx = Math.max(mx,round);
        }
       
        else if(dp[l][m][r]==0){
            dp[l][m][r]=1;
             if(i!=s &&  i!=f)
                  cal(mask^(1<<i),round,i+1,j-1,
                   l - ((i < f) ? 1 : 0),
                   m - ((i > f) && (i < s) ? 1 : 0),
                   r - ((i > s) ? 1 : 0));
             if(j!=s && j!=f)
                 cal(mask^(1<<j),round,i+1,j-1,
                  l - ((j < f) ? 1 : 0),
                  m - ((j > f) && (j < s) ? 1 : 0),
                  r - ((j > s) ? 1 : 0));
        } 

    }
    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        N = n-1;  f=firstPlayer-1;  s=secondPlayer-1;
    
        //mask,round,i,j;
        cal((1<<n)-1,1,0,n-1,f,s-f-1,N-s);
        return new int[] {mn,mx};
    }
}
