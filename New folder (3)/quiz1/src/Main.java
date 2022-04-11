

import java.util.Scanner;

public class Main {
    public static Person[] array;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person obj = new Person();

        System.out.println("How many persons are there? ");
        int totalPersons = Integer.valueOf(scan.nextLine());

        // Creating array of persons.
        Person[] array = new Person[totalPersons];

        String name, gender;
        int age, option;

        for(int i=0; i<totalPersons; i++) {
            System.out.println("Enter name of person "+(i+1)+":");
            name = scan.nextLine();
            obj.setName(name);

            System.out.println("Enter age of person "+(i+1)+":");
            age = Integer.valueOf(scan.nextLine());
            obj.setAge(age);

            System.out.println("Enter gender of person "+(i+1)+":");
            gender = scan.nextLine();

            System.out.println("Do you want to create an account? (1 for yes, 0 for no)");
            option = Integer.valueOf(scan.nextLine());

            if(option == 1) {
                System.out.println("Enter account number: ");
                int accountNumber = Integer.valueOf(scan.nextLine());
                System.out.println("Enter initial balance: ");
                double balance = Double.valueOf(scan.nextLine());
                Account acc = new Account(accountNumber, balance);
                // Now passing account to person.
                obj.setAccount(acc);
            }
        }
    }

    public static void showInfoifPersonHasAccount() {
        for(int i = 0; i<array.length; i++) {

        }
    }
}
