package classandobject;

public class Bill 
{
	private int billno;
	private int noofunit;
	 private int costperunit;
	public Bill()//default
	{
		
	}
	
	public Bill(int i,int j,int k)
	{
		billno=i;//10001
		noofunit=j;//7899
		costperunit=k;//67
	}

	public int getBillno() {
		return billno;
	}

	public void setBillno(int billno) {
		this.billno = billno;
	}

	public int getNoofunit() {
		return noofunit;
	}

	public void setNoofunit(int noofunit) {
		this.noofunit = noofunit;
	}

	public int getCostperunit() {
		return costperunit;
	}

	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}

	@Override
	public String toString() {
		return "Bill [billno=" + billno + ", noofunit=" + noofunit + ", costperunit=" + costperunit + "]";
	}
	

}
