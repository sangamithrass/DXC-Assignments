package dxc;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		int n,rem=0,count=0,temp;
		double sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
			
		}
		n=temp;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(Math.pow(rem , count));
			n=n/10;
		}
		System.out.println("sum of digits="+sum);
		
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
		
	
	}

}
