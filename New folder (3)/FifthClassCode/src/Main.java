public class Main {
    public static void main(String[] args) {
        /*int i = 0, j = 9;
        System.out.println("Khalid 01");
        System.out.println(j/i);
        System.out.println("Khalid 02");
        try{
            System.out.println(j/i);
            //Exception err = new Exception("Testing");
            //throw err;
            //System.out.println("after Exception throw");
        }
            catch( Exception e )   {
            System.out.println("Cannot by divide by zero" + e.getMessage());
        }
        System.out.println("Khalid 02");
*/      student std;
        try {
            std = new student("Ali");
            System.out.println("Khalid 01");
            System.out.println(std.getName());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Khalid 02");

    }
}