class Solution {
    public int maxProfit(int[] prices){
        if(prices==null || prices.length==0){
            return 0;
        }
        int n=prices.length;
        int hold=-prices[0];
        int sell=0;
        int coolDown=0;
        for(int i=0;i<n;i++){
            int prevHold=hold;
            int prevSell=sell;
            int prevCoolDown=coolDown;
            hold=Math.max(prevHold, prevCoolDown-prices[i]);
            sell=prevHold+prices[i];
            coolDown=Math.max(prevSell, prevCoolDown);
        }
        return Math.max(sell, coolDown);
    }
}