package Calculator;

public class Calculator {

    public int add(int num1, int num2){
        return  num1+num2;
    }
    public int sub(int num1, int num2){
        return num1-num2;
    }
    public int mul(int num1, int num2){
        return  num1*num2;
    }

    public double div(int num1 , int num2)throws Exception {
        if (num2 == 0) {
            throw new Exception("Can't divide by zero");
        }
        else{
            return num1/num2;
        }
    }


}
