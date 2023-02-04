package dxc;

class author
{
	private String aname;
	private String emailid;
	private char gender;
	
	public author(String aname,String emailid,char gender)
	{
		this.aname=aname;
		this.emailid=emailid;
		this.gender=gender;
	}

	public String getName() {
		return aname;
	}

	public void setName(String name) {
		this.aname = aname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
class book
{
	private String bname;
	private author author;
	private double price;
	private int quantity;
	
	public book(String bname,double price,int quantity)
	{
		this.bname=bname;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
public author getAuthor() {
		return author;
	}

	public void setAuthor(author author) {
		this.author = author;
	}

public void displayAuthorDetails(author author) 
{
	// TODO Auto-generated method stub
	System.out.println("Author name: "+ author.getName()+"\nAuthor email: "+ author.getEmailid()+ "\nAuthor gender "+ author.getGender());
	//System.out.println("\nBook name: "+ getBname()+"\nAuthor : "+ getAuthor()+ "\nPrice: "+ getPrice()+ "\nQuantity: "+ getQuantity());
}
}


public class Aggregation_bookauthor{

	public static void main(String[] args)
	{
		author a1 = new author("Joshua Bloch", "joshua@gmail.com", 'M');
		book b1 = new book("Effective Java", 45.0,15);
		b1.displayAuthorDetails(a1);

	}

}
