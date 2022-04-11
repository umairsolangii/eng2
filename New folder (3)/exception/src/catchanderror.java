import java.util.Scanner;

public class catchanderror {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        catchanderror obj = new catchanderror();

        int [] marks = new int [5];
        marks[0] = 59;
        marks[1] = 34;
        marks[2] = 98;

        System.out.println("Enter Index here");
        int ind = scan.nextInt();
        System.out.println("Enter Number here you want to divide");
        int num = scan.nextInt();
        try{
            System.out.println("The Value of array index entered is: " + marks[ind]);
            System.out.println("The the value of divided by array inedx by no is: " + marks[ind]/num);

        }
        catch (Exception e){
            System.out.println("Exception accured");
        }
    }
}
