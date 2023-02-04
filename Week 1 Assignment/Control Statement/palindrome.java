package dxc;

import java.util.Scanner;

public class palindrome {
	static void pal(int num)
	{
		int r=0,d,org;
		org=num;
		while(num!=0)
		{
			d=num%10;
			r=(r*10)+d;
			num=num/10;
		}
		System.out.println("reverse number:"+r);
if(org==r)
 System.out.println("number is palindrome");
else
	 System.out.println("number is not palindrome");
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=s.nextInt();
		pal(num);

	}

}
