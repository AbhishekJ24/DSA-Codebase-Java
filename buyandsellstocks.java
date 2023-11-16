public class buyandsellstocks {
    public static int factorial(int number){
        int facto=1;
        for(int i=1;i<number;i++){
            facto*=i;
        }
        return facto;
    }
    public static int maxProfit(int rates[]){
        int l=rates.length;
        int profit=Integer.MIN_VALUE;
        int check=0;
        for(int bd=0;bd<=l-2;bd++){
            for(int sd=bd+1;sd<=l-1;sd++){
                profit=Math.max(profit,rates[sd]-rates[bd]);
                if(rates[sd]<rates[bd])
                check+=1;
            }
        }
        if(check==(factorial(l+1)/(2*factorial(l-1))))
        return 0;
        else
        return profit;
    }
    public static void main(String[] args) {
        int rates[]={7,6,5,4,3};
        int profit=maxProfit(rates);
        System.out.println(profit);
    }
}
