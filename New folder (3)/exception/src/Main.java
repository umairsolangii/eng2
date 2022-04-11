

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        percentcal obj = new percentcal();

        System.out.println("Enter English Marks: ");
        int a = scan.nextInt();
        obj.setEng(a);
        System.out.println("Enter URdu Marks:");
        int b = scan.nextInt();
        obj.setUrdu(b);
        System.out.println("Enter Math Marks:");
        int c = scan.nextInt();
        obj.setMath(c);
        System.out.println("Enter OOP Marks:");
        int d = scan.nextInt();
        obj.setOop(d);
        System.out.println("Enter Com Marks:");
        int e = scan.nextInt();
        obj.setCom(e);
        int obtainMarks = obj.getEng() + obj.getUrdu() + obj.getMath() + obj.getOop() + obj.getCom();
        int totalMarks = 500;
        int percentage = obtainMarks/totalMarks;
        System.out.println("Your Percentage is: " + totalMarks);
        System.out.println("Your Percentage is: " + obtainMarks);
        System.out.println("Your Percentage is: " + (obtainMarks)/(totalMarks)*100);





    }
}
