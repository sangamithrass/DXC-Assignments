package dxc;
abstract class payment
{
	private int customerid;
	public payment(int customerid)
	{
	this.customerid=customerid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
}

class debitcard extends payment
{
 
	private static int counter;
	private String paymentid;
	private double amount;
	private double servicetax;
	private double discount;
	private double finalamount;
	static
	{
		counter=1000;
	}
	public debitcard(int customerid,double amount) {
		super(customerid);
		this.paymentid="D"+ ++counter;
		this.amount=amount;
		// TODO Auto-generated constructor stub
	}
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getServicetax() {
		return servicetax;
	}
	public void setServicetax(double servicetax) {
		this.servicetax = servicetax;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}
	public double calculateservicetax()
	{
		if(amount<=500)
		{
			servicetax=2.5;
		}
		else if(amount>500 && amount<=1000)
		{
			servicetax=4;
		}
		else if(amount>1000)
		{
			servicetax=5;
		}
		return servicetax;
		
	}
	
	public double calculatediscount()
	{
		if(amount<=500)
		{
			discount=1;
		}
		else if(amount>500 && amount<=1000)
		{
			discount=2;
		}
		else if(amount>1000)
		{
			discount=3;
		}
		return discount;
		
	}
	public double calculatetotal()
	{
		if(amount<=500)
		{

		finalamount=amount+amount*(2.5/100)-amount*(1/100);
		}
		else if(amount>500 && amount<=1000)
		{
			finalamount=amount+amount*(4/100)-amount*(2/100);
		}
		else if(amount>1000)
		{
			finalamount=amount+amount*(5/100)-amount*(3/100);
		}
		return finalamount;
}
}

class creditcard extends payment
{
	private static int counter;
	private String paymentid;
	private double amount;
	private double servicetax;
	private double finalpayment;
	static
	{
		counter=1000;
	}

	public creditcard(int customerid,double amount) {
		super(customerid);
		this.paymentid="C"+ ++counter;
		this.amount=amount;
		// TODO Auto-generated constructor stub
	}

	public String getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getServicetax() {
		return servicetax;
	}

	public void setServicetax(double servicetax) {
		this.servicetax = servicetax;
	}

	public double getFinalpayment() {
		return finalpayment;
	}

	public void setFinalpayment(double finalpayment) {
		this.finalpayment = finalpayment;
	}
	public double calculateservicetax()
	{
		if(amount<=500)
		{
			servicetax=3;
		}
		else if(amount>500 && amount<=1000)
		{
			servicetax=5;
		}
		else if(amount>1000)
		{
			servicetax=6;
		}
		return servicetax;
		
	}
	
	public double calculatetotal()
	{
		if(amount<=500)
		{

		finalpayment=amount+amount*3/100;
		}
		else if(amount>500 && amount<=1000)
		{
			finalpayment=amount+amount*5/100;
		}
		else if(amount>1000)
		{
			finalpayment=amount+amount*6/100;
		}
		return finalpayment;
}
	
}
public class Abstract_billpayment {

	public static void main(String[] args) 
	{
		debitcard debitcard=new debitcard(101,500);
		debitcard.calculateservicetax();
		debitcard.calculatediscount();
		debitcard.calculatetotal();
		System.out.println("Customer Id :"+debitcard.getCustomerid());
		System.out.println("Payment Id :"+debitcard.getPaymentid());
		System.out.println("Service Tax percentage:"+debitcard.getServicetax());
		System.out.println("Discount percentage :"+debitcard.getDiscount());
		System.out.println("Total Bill Amount :"+debitcard.getFinalamount());
		
		System.out.println();
		creditcard creditcard=new creditcard(102,1000);
		creditcard.calculateservicetax();
		creditcard.calculatetotal();
		System.out.println("Customer Id :"+creditcard.getCustomerid());
		System.out.println("Payment Id :"+creditcard.getPaymentid());
		System.out.println("Service Tax percentage:"+creditcard.getServicetax());
		System.out.println("Total Bill Amount :"+creditcard.getFinalpayment());

	}


}
