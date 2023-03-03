package inheritance;

public class BankMain {

	public static void main(String[] args) {
		HDFCPune p=new HDFCPune(1,"gayathri",56000);
		System.out.println(p);
		HDFCPune p1=new HDFCPune();
		p1.setAccno(2);
		p1.setCustomername("ravi");
		System.out.println(p1.getAccno());
		System.out.println(p1.getCustomername());

	}

}
