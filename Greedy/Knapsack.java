class Solution {
    class Item{
        int value,weight;
        double ratio;
        Item(int value,int weight){
            this.value=value;
            this.weight = weight;
            ratio = (double)value/weight;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        // Your code goes here 
        int n = val.length;
        Item [] items = new Item[n];
        for(int i = 0;i<n;i++){
            items[i]=new Item(val[i],wt[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double totalValue = 0.0;
        long remainingCap = cap;
        for(Item item : items){
            if(remainingCap ==0)
                 break;
            if(item.weight<=remainingCap){
                  totalValue+=item.value;
                  remainingCap-=item.weight;
            }else{
                totalValue += item.ratio*remainingCap;
                remainingCap=0;
            }
        }

        return Math.round(totalValue*1e6)/1e6;  

    }
}
