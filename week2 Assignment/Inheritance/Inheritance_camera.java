package dxc;
class camera1
{
	private String brand;
	private double cost;
	public camera1()
	{
		this.brand="Nikon";

	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
class digitalcamera extends camera1
{
	private int memory;
	public digitalcamera(String brand,double cost)
	{
		
		this.memory=16;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
}
public class Inheritance_camera {

	public static void main(String[] args)
	{
		digitalcamera c =new digitalcamera("canon",100);
		System.out.println(c.getBrand()+" "+c.getCost()+" "+c.getMemory());

	}

}