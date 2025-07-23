class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        char [] chars = s.toCharArray();
        int len = s.length();
        char c1='a',c2='b';
        int cnt1 = 0, cnt2 = 0;
        if(x<y){
            int temp = x;
            x=y;
            y=temp;
            c1='b';
            c2='a';
        }
        for(int i = 0;i<len;i++){
            if(chars[i]==c1)
               cnt1++;
            else if(chars[i]==c2){
                if(cnt1>0){
                    cnt1--;
                    score+=x;
                }else
                cnt2++;
            }
            else{
                score+=Math.min(cnt1,cnt2)*y;
                cnt1 = 0;
                cnt2 = 0;
            }
        }
        if(cnt1 != 0){
                score+=Math.min(cnt1,cnt2)*y;
        }
        return score;
    }

}
