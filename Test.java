public class Test {
    public static void main( String[] args ) {
	BankAcc testAcc = new BankAcc("Lynne","1234qwer",1111,111111111,1000.0);
	testAcc.Deposit(45);
	testAcc.Withdraw(15);
        System.out.println(testAcc.retName());
	System.out.println(testAcc.retPwd());
	System.out.println(testAcc.retPin());
	System.out.println(testAcc.retNum());
	System.out.println(testAcc.retBalance());
	System.out.println("should be 1030");
    }
}
