import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.println("How many students marks you want to take");
        input = scan.nextInt();
          int [] marks = new int [input];
        System.out.println("Enter Student 01 Marks");
        int std1 = scan.nextInt();
        System.out.println("Enter Student 02 Marks");
         int std2 = scan.nextInt();
         System.out.println("Enter Student 03 Marks");
         int std3 = scan.nextInt();
        System.out.println("Enter Student 03 Marks");
        int std4 = scan.nextInt();
        System.out.println("Enter Student 03 Marks");
        int std5 = scan.nextInt();
         marks[0]= std1;
         marks[1] = std2;
         marks[2] = std3;
        marks[3] = std4;
        marks[4] = std5;


        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
        System.out.println(std4);
        System.out.println(std5);

      }
    }

