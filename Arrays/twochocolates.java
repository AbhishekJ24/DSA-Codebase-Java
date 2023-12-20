package Arrays;

import java.util.Arrays;

public class twochocolates{
     public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if((prices[0]+prices[1])<=money)
        return money-(prices[0]+prices[1]);
        else
        return money;
    }
    public static void main(String[] args) {
        int prices[]={12,34,56,86,12,90};
        int money=100;
        buyChoco(prices,money);
    }
}