package inheritance;

public class Hdfc extends Bank
{
	int amount;
	
	public Hdfc()
	{
		
	}
	public Hdfc(int accno,String customername,int amount)
	{
		super(accno,customername);
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString()+"Hdfc [amount=" + amount + "]";
	}
	

}
