

public class Account {
    private double balance;
    private double minBalance = 50;
    private int accountNumber;

    public Account(int accountNumber ,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Making getter.
    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // function to calculate balance increase over year when giving interest
    public double findMonthlyProfit(double interest, int period) {

        double total;
        total = this.balance +( this.balance * interest);
        return total/period;
    }

    public double findTotalProfit(double interest) {
        double total = 0;
        total = this.balance + (this.balance*interest);
        return total;
    }


}
