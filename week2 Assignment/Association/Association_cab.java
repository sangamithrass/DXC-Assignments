package dxc;

class driver
{
	private String drivername;
	private float avgrating;
	public driver(String drivername,float avgrating)
	{
	this.drivername=drivername;
	this.avgrating=avgrating;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public float getAvgrating() {
		return avgrating;
	}
	public void setAvgrating(float avgrating) {
		this.avgrating = avgrating;
	}
	public String toString()
	{
		return "driver\ndrivername:"+this.drivername+"\navgrating:"+this.avgrating;
		
	}
}
class cabserviceprovider
{
	static String cabservicename;
	int totalcab;
	public cabserviceprovider(String cabservicename,int totalcab)
	{
		cabserviceprovider.cabservicename=cabservicename;
		this.totalcab=totalcab;
	}
	public static double calculaterewardprice(driver Driver)
	{
		double bonus=0;
		double rating;
		rating=Driver.getAvgrating();
		if(cabservicename=="Halo")
		{
			if(rating>=4.5 && rating<5)
			{
				bonus=rating*10;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*5;
			}
		}
		else if(cabservicename=="Aber")
		{
			if(rating>=4.5 && rating<5)
			{
				bonus=rating*8;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*3;
			}
		}
		return bonus;
		
	}
}

public class Association_cab  {

	public static void main(String[] args)
	{
		cabserviceprovider c=new cabserviceprovider("Halo",50);
		driver d1=new driver("Luke",4.8f);
		driver d2=new driver("Mark",4.2f);
		driver d3=new driver("David",3.9f);
		driver[]d= {d1,d2,d3};
		for(driver Driver:d)
		{
			System.out.println("Driver Name :"+Driver.getDrivername());
			double bonus=cabserviceprovider.calculaterewardprice(Driver);
			if(bonus>0)
			{
				System.out.println("Bonus : $"+(bonus)+"\n");
			}
			else
				System.out.println("Sorry,Bonus is not available" );
		}
	}

}