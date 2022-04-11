
public class Person {
    // 3 variables
    private String name;
    private int age;
    private String gender;
    private int haveAccount = 0;

    // Person should have both Account and Vehicle objects.
    private Account account;
    private Vehicle vehicle;

    // Set account for person.
    public void setAccount(Account acc) {
        this.account = account;
        haveAccount = 1;
    }

    // making getter setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // Making getters
    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    // Making two functions

    // Function to calculate birthYear
    public int birthYear() {
        return this.age - 2021;
    }

    // Function show Person information
    public void showPerson() {
        System.out.printf("Name: %s\n Age: %d\nGender %s", this.name, this.age, this.gender);
    }

}
