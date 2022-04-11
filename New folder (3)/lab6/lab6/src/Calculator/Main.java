package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.println("Enter No 01");
        int num1 = scan.nextInt();

        System.out.println("Enter No 02");
        int num2 = scan.nextInt();

        try{
            System.out.println(obj.div(num1,num2));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        } mmmmmmmmmmmmmmmmm
    }

}
