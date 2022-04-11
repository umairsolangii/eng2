class Employee{
    private String Name;
    private int age;


    // Getter
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }

    //Setter
  public void setName(String Name){
        if(Name.length() <= 5){
            System.out.println("Name Should be more then 5 Character");
        }
        else{
            System.out.println("All is well");
        }
        this.Name = Name;
  }
  public void setAge(int age){
        this.age = age;
  }



}


public class GetterandSetter {
    public static void main(String[] args) {
    Employee obj = new Employee();

    obj.setName("UmairSolangi");
    obj.setAge(23);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
