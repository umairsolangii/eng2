public class loanCalculator {

    public loanCalculator(double amount,int period) throws Exception{
        this.setAmount(amount);
        this.setPeriod(period);
    }

    private int period;
    private double amount;
    private static double interestRate = 5.3;
    private static String password = "123";

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws Exception{
        if (amount > 0){
        this.amount = amount;
        }else{
            throw new Exception("amount should be greater than 0");
        }
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) throws Exception{
        if(period >0) {
            this.period = period;
        }else {
            throw new Exception("period should be greater than 0");
        }
    }

    public double MonthlyAmount(){

        return this.getAmount()/12 + this.InterestAmount(this.getAmount()/12);
    }
    public double AnnualAmount(){

        return this.getAmount() + this.InterestAmount(this.getAmount());
    }
    private double InterestAmount(double amount){

        return amount * this.interestRate;
    }

    public static void setInterestRate(double interestRate, String password) throws Exception{
        if (loanCalculator.password == password){
        loanCalculator.interestRate = interestRate;}
        else {
            throw new Exception("Not Authorised");
        }
    }
}
