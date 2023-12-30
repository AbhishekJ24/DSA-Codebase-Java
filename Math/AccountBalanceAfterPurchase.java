package Math;
public class AccountBalanceAfterPurchase{
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int amt=0;
        if(purchaseAmount!=0){
            double temp = (double)purchaseAmount/10;
            amt = (int)Math.round(temp)*10;
        }
        return (100-amt);
    }
    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(84));
    }
}