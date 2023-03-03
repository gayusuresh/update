package abstraction;

public class EBill implements Bill
{
	private int billno;
	private int noofunits;
	private int costperunit;
	public EBill()
	{
		
	}
	
	public EBill(int billno,int noofunits, int costperunit) {
		super();
		this.billno=billno;
		this.noofunits = noofunits;
		this.costperunit = costperunit;
	}

	public int getNoofunits() {
		return noofunits;
	}
	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	

	

	public int getBillno() {
		return billno;
	}

	public void setBillno(int billno) {
		this.billno = billno;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return noofunits*costperunit;
	}
	@Override
	public String toString() {
		return "EBill [billno=" + billno + ", noofunits=" + noofunits + ", costperunit=" + costperunit + "]";
	}
	@Override
	public void display() {
		System.out.println(" The EBill is=:"+calculateBill());
		
	}
	

}
