// Give Us All Your Money Bank - Clarence Cheng, Lynne Wang, Frank Chen
//APCS pd 1
//HW 09
//2017-10-02
public class BankAccount {

    //Instance Vars
    private String AccName;
    private String  AccPwd;
    private int AccPin;
    private int AccNum;
    private double AccBal;

    //Constructors
    public BankAccount() {
	AccName = "Default";
	AccPwd = "000aaa";
	AccPin = 0000;
	AccNum = 000000000;
	AccBal = 0.0;
    }

    public BankAccount(String Name, String Pwd, int Pin, int Num, float Balance) {
	AccName = Name;
	AccPwd = Pwd;
	AccPin = Pin;
	AccNum = Num;
	AccBal = Balance;
    }

    //Methods
    public void Deposit(float Amount) {
	AccBal += Amount;
    }

    //Work on withdrawal limit - if your withdrawal amount is greater than your account balance, print a message to the person.
    public void Withdraw(float Amount) {
	AccBal -= Amount;
    }

    public String retName() {
	return AccName;
    }

    public String retPwd() {
	return AccPwd;
    }

    public int retPin() {
        return AccPin;
    }

    public int retNum() {
	return AccNum;
    }
    
    public double retBalance() {
	return AccBal;
    }

}
