import java.util.*;
class Sumofsubsets{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> ans = new ArrayList<>();
        subSetSum(arr,ans,0,0,arr.size());
        Collections.sort(ans);
        System.out.println(ans.toString());

    }
    public static void subSetSum(ArrayList<Integer> a,ArrayList<Integer> ans,int sum,int start,int n){
        if(n==start){
            ans.add(sum);
            return;
        }
        subSetSum(a,ans,a.get(start)+sum,start+1,n);
        subSetSum(a, ans, sum, start+1, n);
    }

}