public class Account {
    private int balance = 0;
    private int accountNo;
    private String CustomerName;
    private int ContactNo;
    public String name;


    //Getter
    public int getBalance(){
        return  balance;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public int getAccountNo(){
    return accountNo;
    }
    public int getContactNo(){
        return ContactNo;
    }
    //Setter
    public void setCustomerName(String newValue){
        CustomerName = newValue;
    }
    public void setAccountNo(int newValue){
        accountNo = newValue;
    }
    public void setContactNo(int newValue){
        ContactNo = newValue;
    }
    public void setBalance(int newValue){
        balance = newValue;
    }




    public void withdraw(int amount) throws Exception{
        Exception e;
        if(amount <=0){
            e = new Exception("Amount shouldn't be less than zero");
            throw e;
        }
        else if(amount >this.balance){
            e = new Exception("Your Withdraw amount should be less than to your current balance");
            throw e;

        }
        else{
            this.balance = amount;
        }
    }

    public void deposit(int amount)throws Exception{
        Exception e;
        if(amount <=0){
            e = new Exception("Amount can't be negative or less than zero");
            throw e;
        }
        else{
            this.balance +=amount;
        }
    }
}
