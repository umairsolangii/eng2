import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Practice Set 01
class Cylander{

    private int radious;
    private int height;
    private int contact;

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class GuessGame {
    public static void main(String[] args) {


     //Guess Game
       /*
        Scanner scan = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(34);
        System.out.println(randomNumber);
        int input = scan.nextInt();
        if(input == randomNumber){
            System.out.println("You Won");
        }
        else{
            System.out.println("You Loss");
        }
    */
// Input from user in private veriable
Scanner scan = new Scanner(System.in);
Cylander cl = new Cylander();
        System.out.println("Input Your Contact");
        int cont = scan.nextInt();
        cl.setContact(cont);
        System.out.println(cl.getContact());


    //Practice Set 01

      Cylander obj = new Cylander();
      obj.setHeight(34);
      obj.setRadious(23);
        System.out.println(obj.getHeight());
        System.out.println(obj.getRadious());


    }
}
