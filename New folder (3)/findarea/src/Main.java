import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Length and Width of the rectangle");

        float Length = in.nextFloat();
        float Width = in.nextFloat();
        float Area;

        Area = Length * Width;
         System.out.println("Area of Rectangle = " + Area + "Units");

    }
}
