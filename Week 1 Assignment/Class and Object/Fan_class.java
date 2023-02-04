package dxc;
class Fan_class
{
 public static final int SLOW=1,MEDIUM=2,FAST=3;
 int speed;
 boolean fan_ON;
 double radius;
 String color;
 
 Fan_class()
 {
  speed=SLOW;
  fan_ON=false;
  radius=4;
  color="blue";
 }
 
 Fan_class(int speed,double radius,String color,boolean fan_ON)
 {
  this.speed=speed;
  this.radius=radius;
  this.color=color;
  this.fan_ON=fan_ON;
 }
 
 void display()
 {
  if(fan_ON==true)
  {
   System.out.println("Fan is on \n the speed is ="+speed+"\n the color is ="+color+"\n the radius is ="+radius);
  }
  else
  {
   System.out.println("Fan is off \n the color of fan is ="+color+"\n the radius of fan is ="+radius);
  }
 }
 
public static void main(String [] args)
{
 Fan_class obj = new Fan_class();
 Fan_class obj1 = new Fan_class(MEDIUM,6,"brown",true);
 obj.display();
 obj1.display();
 
}
}