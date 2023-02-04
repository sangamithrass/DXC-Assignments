package dxc;
class employee
{
	private int employeeid;
	private String empname;
	private double salary;
	
	public employee(int employeeid,String empname)
	{
		this.employeeid=employeeid;
		this.empname=empname;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
 
class permanentemp extends employee
{
	private double basicpay;
	private double hra;
	private double experience;
	
	public permanentemp(int employeeid,String empname,double basicpay,double hra,double experience)
	{
		super(employeeid,empname);
		this.basicpay=basicpay;
		this.hra=hra;
		this.experience=experience;
	}

	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	public double calculatesalary(double salary)
	{
		if(experience<3)
		{
	         salary=Math.round(basicpay+hra);
		}
		else if(experience>=3 && experience<5)
		{
			salary=Math.round(basicpay+hra+(5*basicpay)/100);
		}
		else if(experience>=5 && experience<10)
		{
			salary=Math.round(basicpay+hra+(7*basicpay)/100);
		}
		else if(experience>=10)
		{
			salary=Math.round(basicpay+hra+(12*basicpay)/100);
		}
		return salary;

		
	}
	
}
class contractemp extends employee
{
	private double wages;
	private float hrwk;
	public contractemp(int employeeid,String empname,double wages,float hrwk)
	{
		super(employeeid,empname);
		this.wages=wages;
		this.hrwk=hrwk;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public float getHrwk() {
		return hrwk;
	}
	public void setHrwk(float hrwk) {
		this.hrwk = hrwk;
	}
	public double calculatesalary(double salary)
	{
		salary=hrwk*wages;
		return salary;
		
	}
	
}

public class Inheritance_companywages {

	public static void main(String[] args) 
	{
		permanentemp permanentemp=new permanentemp(711211,"Rafael",1855,115,3.5f);
		System.out.println("Hai "+permanentemp.getEmpname()+" your salary is $"+permanentemp.calculatesalary(0));
		System.out.println();
		contractemp contractemp=new contractemp(102,"Jennifer",16,90);
		System.out.println("Hai "+contractemp.getEmpname()+" your salary is $"+contractemp.calculatesalary(0));

	}

}
