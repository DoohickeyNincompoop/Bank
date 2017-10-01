public class BankAcc {

    //Instance Vars
    private String AccName;
    private String  AccPwd;
    private int AccPin;
    private int AccNum;
    private double AccBal;

    //Constructors
    public BankAcc() {
	AccName = "Default";
	AccPwd = "000aaa";
	AccPin = 0000;
	AccNum = 000000000;
	AccBal = 0.0;
    }

    public BankAcc(String Name, String Pwd, int Pin, int Num, double Balance) {
	AccName = Name;
	AccPwd = Pwd;
	AccPin = Pin;
	AccNum = Num;
	AccBal = Balance;
    }

    //Methods
    public void Deposit(double Amount) {
	AccBal += Amount;
    }

    //Work on withdrawal limit - if your withdrawal amount is greater than your account balance, print a message to the person.
    public void Withdraw(double Amount) {
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
