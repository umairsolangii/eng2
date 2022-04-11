import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Account obj = new Account();

        obj.setCustomerName("Alfa Row");
        obj.setAccountNo(211122123);
        obj.setContactNo(923434334);
        obj.setBalance(0);
        int CurrentBalance = obj.getBalance();


        int op;
        do{
            System.out.println("Enter 1: Deposit \n Enter 2: Withdrawl \n Enter 3: Account Detail");
            op = scan.nextInt();


        int amount;

            try{
                switch (op){
                    case 1:
                        System.out.println("Enter Amount to deposit");
                        amount = scan.nextInt();
                        obj.deposit(amount);
                        obj.withdraw(amount);
                        System.out.println("Your Just Deposit " + amount + "PKR");
                        System.out.println("Balance is " + amount+CurrentBalance);
                        break;
                    case 2:
                        System.out.println("Ente Amount to Withdrawl");
                        amount = scan.nextInt();
                        obj.withdraw(amount);
                        System.out.println("You Just Withdrawl " + amount);
                        break;
                    case 3:
                        System.out.println(obj.getCustomerName());
                        System.out.println(obj.getAccountNo());
                        System.out.println(obj.getContactNo());

                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(op != 0);

    }
}
