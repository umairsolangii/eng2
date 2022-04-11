public class student {

    public student(String password){
        this.setPassword(password);
    }

    private String Name;
    public String Class;
    private String password;

    private void setPassword(String password){
        this.password = password;
    }
    public String getName(String password){
        if(this.password == password){
            return this.Name;
        }else {
            return this.Name.substring(0, 3);
        }
    }

    public void setName(String Name){
        if(Name.length() >= 5) {
            this.Name = Name;
        }else {
            System.out.println("Name length should be greater than 5 ");
        }
    }



}