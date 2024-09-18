import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double amount;
        System.out.println("Currency Breakdown: Minimum Coin Denominations Calculator.\n\n Please enter an amount in decimal format:");
        amount = sc.nextDouble();
        coinCalculator(amount);
    }

    static void coinCalculator(double amount) {
        int[] coins = {200,100,50,20,10,5,2,1};
        int originalAmount = (int)(amount*100);
        for (int coin: coins)
        {
            int numberOfCoins = originalAmount / coin;
            if(numberOfCoins >0)
            {
                System.out.println(numberOfCoins + " £" + (coin/100.0) + " coins");
                originalAmount -= numberOfCoins * coin;
            }
        }
    }
}