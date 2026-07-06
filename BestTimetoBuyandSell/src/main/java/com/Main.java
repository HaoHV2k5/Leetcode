package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int maxProfit(int[] prices) {
        int current = 0;
        int profit = 0;
        int sum = 0;
        int max = 0;
        for(int i=1; i < prices.length ; i++){
            int temp = prices[i] - prices[i-1];
            if(temp> 0 ){
                sum+=temp;
            }
            profit  = Math.max(profit, prices[i] - prices[current] );

            if(prices[i] < prices[current]) current = i;
        }
        profit = Math.max(profit, sum);
        return profit;
    }


    static void main() {

    }
}
