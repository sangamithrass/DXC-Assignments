package dxc;

import java.util.Scanner;

public class fooddelivery {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char f;
		int q,sum1,d,d1,d2;
		System.out.println("Enter mael type(V/N):");
		f=s.next().charAt(0);
		if(f=='v'||f=='n'||f=='V'||f=='N')
		{
			if(f=='v'||f=='V')
			{
				System.out.println("No of quantity:");
				q=s.nextInt();
				if(q>=1)
				{
					sum1=12*q;
					System.out.println("Enter the distance to delivery:");
					d=s.nextInt();
					if(d>0)
					{
						if(d<=3)
						{
							System.out.println("Total amount to pay"+sum1);
						}
						if(d>3&&d<=6)
						{
							System.out.println("Total amount to pay"+(sum1+1));
						}
						if(d>6)
						{
							d1=(d-6)*2;
							d2=d1+sum1+1;
							System.out.println("Total amount to pay"+d2);
						}
					}
					else
					{
						System.out.println("Invalid input");
					}
				}
				else
				{
					System.out.println("Invalid input");
				}
			}
			else if(f=='n'||f=='N')
			{
				System.out.println("No of quantity:");
				q=s.nextInt();
				if(q>=1)
				{
					sum1=15*q;
					System.out.println("Enter the distance to delivery:");
					d=s.nextInt();
					if(d>0)
					{
						if(d<=3)
						{
							System.out.println("Total amount to pay:"+sum1);
						}
						if(d>3&&d<=6)
						{
							System.out.println("Total amount to pay:"+(sum1+1));
						}
						if(d>6)
						{
							d1=(d-6)*2;
							d2=d1+sum1+1;
							System.out.println("Total amount to pay:"+d2);
						}
					}
					else
					{
						System.out.println("Invalid input");
					}
				}
				else
				{
					System.out.println("Invalid input");
				}
			}
			
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
