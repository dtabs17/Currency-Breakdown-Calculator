import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double amount;
        System.out.println("Currency Breakdown: Minimum Coin Denominations Calculator.\n\n Please enter an amount in decimal format:");
        amount = sc.nextDouble();

        amount*=100;
        int numof2euros = (int) (amount/200);
        System.out.println("There are:");
        System.out.println(numof2euros + " 2 euros");
        amount%=200;
        int numof1euro = (int) (amount/100);
        System.out.println(numof1euro + " 1 euros");
        amount%=100;
        int numof50cents = (int) (amount/50);
        System.out.println(numof50cents + " 50 cents");
        amount%=50;
        int numof20cents = (int) (amount/20);
        System.out.println(numof20cents + " 20 cents");
        amount%=20;
        int numof10cents = (int) (amount/10);
        System.out.println(numof10cents + " 10 cents");
        amount%=10;
        int numof5cents = (int) (amount/5);
        System.out.println(numof5cents + " 5 euros");
        amount%=5;
        int numof2cents = (int) (amount/2);
        System.out.println(numof2cents + " 2 cents");
        amount%=2;
        int numof1cents = (int) (amount);
        System.out.println(numof1cents + " 1 cents");

    }
}