import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /*
      Student std,std1;
      std = new Student();
      String str = "KHI";
      change(std,str);
      change(std,str);
      System.out.println(std.getName());
      System.out.println(str);
//why str didn't change in case of string
      std1 = new Student();
      change(std1,str);
      System.out.println(std.getName());
      System.out.println(std1.getName());
    }0

    public static void change(Student std, String str){
        str = str + "123";
        std.setName(str);

    }*/
        Scanner scan = new Scanner(System.in);
        Loan obj = new Loan();

        System.out.println("Enter Loan Amount");
        float amount = scan.nextFloat();
        obj.setLoanAmount(amount);

        System.out.println("Enter Loan Period");
        float period = scan.nextFloat();
        obj.setLoanPeriod(period);

        float res = obj.monthlyPayment();
         System.out.println("Your Monthly Payment is " + res);

         float totalPayment = obj.totalPayment();
         System.out.println("Your total payment is " + totalPayment);

    }

}