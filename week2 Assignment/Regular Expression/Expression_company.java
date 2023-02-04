package dxc;

public class Expression_company {
	public static boolean checkproductname(String name)
	{
		boolean flag=false;
		String regex ="([A-Za-z]{3,10}.\\s[A-Za-z]{3,10}.\\s[A-Za-z]{3,10})"+ "|([A-Za-z]{3,10}.*\\s[A-Za-z]{3,10})";
		if(name.matches(regex))
		{
			flag=true;
		}
		return flag;
		
	}
	public static boolean checkproductid(String id)
	{
		boolean flag=false;
		String regex1="[A-Za-z0-9]{2,20}";
		if(id.matches(regex1))
		{
			flag=true;
		}
		return flag;
	}
	public static boolean checktrackerid(String tid)
	{
		boolean flag=false;
		String regex2="[A-Z]{1}+\\:[A-Z]{4}+\\:[a-z]{3}+\\:[0-9]{2}";
		return flag;
	}

	public static void main(String[] args) 
	{
		String name="Digital Camera";
		String id="DC1911";
		String tid="D:CMDM:cmd:23";
		if(checkproductname(name))
		{
			System.out.println("Product Name is Valid");
		}
		else
		{
			System.out.println("Product Name is InValid");
		}
		
		if(checkproductid(id))
		{
			System.out.println("Product Id is Valid");
		}
		else
		{
			System.out.println("Product Id is InValid");
		}
		
		if(checktrackerid(tid))
		{
			System.out.println("Tracker Id is Valid");
		}
		else
		{
			System.out.println("Tracker Id is InValid");
		}



	}

}
