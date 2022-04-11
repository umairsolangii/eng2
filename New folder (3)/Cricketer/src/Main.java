class Cricketer{
    private String CricketerName;
    private int CricketerAge;
    private String CricketerTeam;
    private int CricketerTotalRuns;
    private int CricketerTotalSixer;
    private int CricketerTotalFours;
    private int CricketerTotalWickets;
    private int CricketerShirtNo;
    private int CricketerSalary;

    //Getter and Setter Methods
    public String getCricketerName(){
        return CricketerName;
    }
    public String getCricketerTeam(){
        return CricketerTeam;
    }
    public int getCricketerAge(){
        return CricketerAge;
    }
    public int getCricketerTotalRuns(){
        return CricketerTotalRuns;
    }
    public int getCricketerTotalSixer(){
        return CricketerTotalSixer;
    }
    public int getCricketerTotalFours(){
        return CricketerTotalFours;
    }
    public int getCricketerTotalWickets(){
        return CricketerTotalWickets;
    }
    public int getCricketerShirtNo(){
        return CricketerShirtNo;
    }
    public int getCricketerSalary(){
        return CricketerSalary;
    }

    public void setCricketerName(String newvalue){
        CricketerName = newvalue;
    }
    public void setCricketerAge(int newvalue){
        CricketerAge = newvalue;
    }
    public void setCricketerTeam(String newvalue){
        CricketerTeam = newvalue;
    }
    public void setCricketerTotalRuns(int newvalue){
        CricketerTotalRuns = newvalue;
    }
    public void setCricketerTotalSixer(int newvalue){
        CricketerTotalSixer = newvalue;
    }
    public void setCricketerTotalFours(int newvalue){
        CricketerTotalFours = newvalue;
    }
    public void setCricketerTotalWickets(int newvalue){
        CricketerTotalWickets = newvalue;
    }
    public void setCricketerShirtNo(int newvlaue){
        CricketerShirtNo = newvlaue;
    }
    public void setCricketerSalary(int newvalue){
        CricketerSalary = newvalue;
    }

}


public class Main {
    public static void main(String[] args) {
        Cricketer obj = new Cricketer();
        obj.setCricketerName("Shahid Afride");
        obj.setCricketerAge(35);
        obj.setCricketerTeam("Pakistan");
        obj.setCricketerTotalRuns(10343);
        obj.setCricketerTotalSixer(200);
        obj.setCricketerTotalFours(500);
        obj.setCricketerTotalWickets(120);
        obj.setCricketerShirtNo(69);
        obj.setCricketerSalary(120000);
        System.out.println("CricketerName " + obj.getCricketerName());
        System.out.println("CricketerAge " + obj.getCricketerAge());
        System.out.println("CricketerTeam " + obj.getCricketerTeam());
        System.out.println("CricketerTotalRuns " + obj.getCricketerTotalRuns());
        System.out.println("CricketerTotalSixer " + obj.getCricketerTotalSixer());
        System.out.println("CricketerTotalFours " + obj.getCricketerTotalFours());
        System.out.println("CricketerTotalWickets " + obj.getCricketerTotalWickets());
        System.out.println("CricketerShirtNo " + obj.getCricketerShirtNo());
        System.out.println("CricketerSalary " + obj.getCricketerSalary());
    }
}
