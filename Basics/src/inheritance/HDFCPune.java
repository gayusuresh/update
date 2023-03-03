package inheritance;

public class HDFCPune extends Hdfc
{
	public HDFCPune()
	{
		
	}
	public HDFCPune(int accno,String customername,int amount)
	{
		super(accno,customername,amount);
	}
	
	public String deposit()
	{
		int dp=amount+3000;
		return "The Deposit=:"+dp;
	}
	@Override
	public String toString() {
		return super.toString()+"HDFCPune [deposit()=" + deposit() + "]";
	}

}
