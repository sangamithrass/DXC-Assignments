package dxc;

import java.util.Scanner;

class bmi
{
	String name;
	int age=20;
	double weight,height,bmi;
	
	void bmi()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name :");
		name=s.nextLine();
		System.out.println("Enter the Age :");
		age=s.nextInt();
		System.out.println("Enter the Weight :");
		weight=s.nextDouble();
		System.out.println("Enter the Height :");
		height=s.nextDouble();
	}
	void display()
	{
		System.out.println("Name of the Person :"+name);
		System.out.println("Age of the Person :"+age);
		System.out.println("Weight of the Person :"+weight);
		System.out.println("Height of the Person :"+height);
	}
	void getbmi()
	{
		height=height/100;
		height=Math.pow(height, 2);
		bmi=weight/height;
	}
	void bmistatus()
	{
		if(bmi<18.5)
		{
			System.out.println("Under Weight");
		}
		else if(bmi>=18.5 && bmi<24.9)
		{
			System.out.println("Normal");
		}
		else
		{
			System.out.println("Over Weight");
		}
	}
	
}

public class humanbmi {

	public static void main(String[] args) 
	{
		bmi b=new bmi();
		b.bmi();
        b.display();
        b.getbmi();
        b.bmistatus();
	}

}