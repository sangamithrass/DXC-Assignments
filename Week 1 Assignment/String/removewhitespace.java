package dxc;

import java.util.Scanner;

public class removewhitespace {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String n;
       System.out.println("Enter the String :");
       n=s.nextLine();
       System.out.println(n.replaceAll(" ", ""));
       
	}

}
