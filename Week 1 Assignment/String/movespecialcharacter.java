package dxc;

	import java.util.Scanner;

	public class movespecialcharacter {

		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			String n,indata="",spdata="",reg;
	        System.out.println("Enter the string :");
	        n=s.nextLine();
	        reg="[^a-zA-Z0-9]";
	        for(int i=0;i<n.length();i++)
	        {
	        	char c=n.charAt(i);
	        	if(n.valueOf(c).matches(reg))
	        		spdata=spdata+c;
	        	else
	        		indata=indata+c;
	        }
	        System.out.println(indata+spdata);
	        
		}
	}
