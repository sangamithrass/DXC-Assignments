package dxc;
class circle
{
	private double diameter;
	private  final double pi=3.14;
	private double circumference;
	private double area;
	public circle(double diameter)
	{
		this.diameter=diameter;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public double calculatecircumference()
	{
		circumference=pi*diameter;
		return circumference; 
	}
	public double calculatearea()
	{
		area=pi*Math.pow((diameter/2), 2);
		return area;
	}
}

public class Final_circle {

	public static void main(String[] args) 
	{
		circle circle1= new circle(10.2);
		circle circle2= new circle(5.7);
		circle[]circles= {circle1,circle2};
		for(circle circle:circles)
		{
           circle.calculatecircumference();
           circle.calculatearea();
			System.out.println("Diameter of the circle is "+circle.getDiameter());
			System.out.println("Circumference of the circle is "+Math.round(circle.getCircumference()*100)/100.0);
			System.out.println("Area of circle is "+Math.round(circle.getArea()*100)/100.0);
			System.out.println();
			
		}
	}

}