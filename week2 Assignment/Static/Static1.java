package dxc;
class bill
{
	private static int counter;
	private String billid;
	private String Paymentmode;
	static
	{
		counter=9000;
	}
	public bill(String Paymentmode) 
	{
		this.billid="B"+ ++counter;
		this.Paymentmode=Paymentmode;
	}
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	public String getPaymentmode() {
		return Paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		Paymentmode = paymentmode;
	}
	
}

public class Static1 {

	public static void main(String[] args)
	{
		bill b1=new bill("Debitcard");
		bill b2=new bill("paypal");
		bill[] bills= {b1,b2};
		for(bill b:bills)
		{
			System.out.println("Bill Details");
			System.out.println("Bill Id :"+b.getBillid());
			System.out.println("Payment Mode :"+b.getPaymentmode());
			System.out.println();
		}
		

	}

}