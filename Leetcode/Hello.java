class Hello{
    public static  int maxProfit(int[] prices) {
        int buy= Integer.MIN_VALUE;
         int maxprofit=0;
         for(int i=0; i<prices.length;i++){
             if(buy<prices[i]){
                 
             }else{
                 buy =prices[i];
             }
         }
         return maxprofit;
     }
    public static void main(String[] args) {
       int [] prices = {2,4,1,16,47,45,16 ,8,5};
       System.out.println(maxProfit(prices));
    }

}