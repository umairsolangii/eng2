import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        loanCal obj = new loanCal();

        System.out.println("Enter Loan Amount");
        int amount = scan.nextInt();
        obj.setLoanAmount(amount);
        System.out.println("Enter loan Period");
        int period = scan.nextInt();
        obj.setLoanPeriod(period);
        int result;
        int tPayment;
        result = obj.monthlyPayment();
        tPayment = obj.totalPayment();
        System.out.println("Your Total Amount of loan after Interest:"  + tPayment);
        System.out.println("Your Total Monthly Instalment with Interest: " + result);
    }
}
