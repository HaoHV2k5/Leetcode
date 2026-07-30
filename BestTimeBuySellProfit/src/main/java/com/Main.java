package com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// c1
    public int maxProfit(int[] prices) {
        int cur = prices[0];
        int ans  = 0;
        int len = prices.length;
        for(int i = 1 ; i < len ; i++){
            ans = Math.max(ans, prices[i] - cur);
            cur = Math.min(cur, prices[i]);
        }
        return ans;
    }
    static void main() {

    }
}
