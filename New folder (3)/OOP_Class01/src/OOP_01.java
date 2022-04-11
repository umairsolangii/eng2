import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


class employe{
int Salery;
String Name;

public int getSalery(){
    return Salery;
}
public String getName(){
    return Name;
}
public void setName(String Name){
    this.Name = Name;
}


}
class cellPhone{
    public void ring(){
        System.out.println("Phone is Ringing");
    }
    public void vibrate(){
        System.out.println("Phone is Vibrating");
    }
    public void friendCalling(){
        System.out.println("Ibrahim is calling");
    }
}


class square{
    int side;

    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}

class Umair{
    public void hit(){
        System.out.println("Hitttiinnnnng the Enemy");
    }
    public void run(){
        System.out.println("Runnnnning from the Enemy");
    }
    public void fir(){
        System.out.println("Firinnnnng on the Enemy");
    }
}
public class OOP_01 {
    public static void main(String[] args) {
//Problem 01
     employe obj = new employe();
     obj.setName("UmairSolangi");
     obj.Salery = 12000;
        System.out.println(obj.getName());
        System.out.println(obj.getSalery());
//Problem 02
        cellPhone nokia = new cellPhone();


        nokia.friendCalling();
        nokia.ring();
        nokia.vibrate();

//Problem 03
       square sq = new square();

       sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

//Problem 04

       Umair player = new Umair();

       player.fir();
       player.hit();
       player.fir();


    }
}
