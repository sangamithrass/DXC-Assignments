package dxc;

import java.util.Scanner;

public class Farm {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int h,l,chicount=0,rabcount=0;
		System.out.println("Enter the head:");
		h=s.nextInt();
		System.out.println("Enter the leg :");
		l=s.nextInt();
		if(h>=l || l%2!=0)
		{
			System.out.println("no. of chickens and rabbits cannot be found");
		}
		else
		{
			rabcount=(l-2*h)/2;
			chicount=h-rabcount;
			System.out.println("Chicken :"+chicount+"\n"+"Rabbit :"+rabcount);
		}
	}

}