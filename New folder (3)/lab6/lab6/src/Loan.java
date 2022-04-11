public class Loan {
private float loanAmount;
private float interestRate = 2000;
private float loanPeriod;



public float getLoanAmount(){
    return loanAmount;
}
public float getLoanPeriod(){
    return loanPeriod;
}

public void setLoanAmount(float loanAmount){
 this.loanAmount = loanAmount;
}

public void setLoanPeriod(float loanPeriod){
    this.loanPeriod = loanPeriod;

}

public float monthlyPayment(){
    float total;
    total = this.loanAmount + (this.loanAmount * this.interestRate);
    return total/this.loanPeriod;


}
public float totalPayment(){
    float total = 0;
    total = this.loanAmount + (this.loanPeriod*this.interestRate);
    return total;
}


}
