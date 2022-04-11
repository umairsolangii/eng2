public class student {

    public student(String Name) throws Exception{
        this.setName(Name);;
    }
    private String Name;
    public void setName(String Name) throws Exception {
        if(Name.length() >= 6) {
            this.Name = Name;
        }else {
            //System.out.println("Name should be 6 character");
            Exception err = new Exception("Name should be 6 character");
            throw err;
        }
    }
    public String getName(){

        return this.Name.substring(0,3);
    }

}
