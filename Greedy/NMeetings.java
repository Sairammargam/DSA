class Solution {
    class Meetings{
        int start,end;
        public Meetings(int s , int e){
            start = s;
            end = e;
        }
    }
 class MeetingComparator implements Comparator<Meetings>{
    public int compare(Meetings m1, Meetings m2){
        return Integer.compare(m1.end,m2.end);
    }
 }
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
       int n = start.length;
       ArrayList<Meetings> meetings = new ArrayList<>();
       for(int i = 0;i<n;i++)
            meetings.add(new Meetings(start[i],end[i]));
            Collections.sort(meetings,new MeetingComparator());
        int count = 1;
        int last = meetings.get(0).end;
        for(int i = 0;i<n;i++){
            if(meetings.get(i).start>=last){
                count ++;
                last =  meetings.get(i).end;
            }
        }
        return count;
    }
}
