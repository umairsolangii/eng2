import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        student std1, std2, std3;
        std1 = new student("1234356");
        std2 = new student("1236");
        std3 = new student("356");

        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        //std1.setPassword("1234356");
        std1.setName(tmp);
        System.out.println(std1.getName("12356"));

        /*tmp = sc.nextLine();
        std2.setName(tmp);
        tmp = sc.nextLine();
        std3.setName(tmp);
*/

/*
        if(tmp.length() >= 5) {
            std1.Name = tmp;
                  std1.setName(tmp);
        }


        tmp = sc.next();

        if(tmp.length() >= 5) {
              std1.setName(tmp);
            std2.Name = tmp;
        }
*/

    }

}