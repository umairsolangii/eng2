public class loanCal {
private int loanAmount;
private int loanPeriod;
private int interestRate = 1000;


//Getter
public int getLoanAmount(){
    return loanAmount;
}
public int getLoanPeriod(){
    return loanPeriod;
}
public int getInterestRate(){
    return interestRate;
}

//Setter
public void setLoanAmount(int loanAmount){
    this.loanAmount = loanAmount;
}
public void setLoanPeriod(int loanPeriod){
    this.loanPeriod = loanPeriod;
}
public void setInterestRate(int interestRate){
    this.interestRate = interestRate;
}

public int monthlyPayment(){
int mp;
int mi;
mi = interestRate/this.loanPeriod;
mp = this.loanAmount/this.loanPeriod;
return mp+mi;
}

public int totalPayment(){
    int tp;
    tp = this.loanAmount + interestRate;
    return tp;
}
}
