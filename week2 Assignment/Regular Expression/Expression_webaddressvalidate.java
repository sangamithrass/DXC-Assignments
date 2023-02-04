package dxc;

public class Expression_webaddressvalidate {
	public static boolean checkwebaddress(String address)
	{
		boolean flag=false;
		String regex="((http|https)://)(www.)?"+ "[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]" + "{2,6}\\b([-a-zA-Z0-9@:%._\\\\+~#?&//=]*)";
		if(address.matches(regex))
		{
			flag=true;
		}
		return flag;
		
	}

	public static void main(String[] args)
	{
		String address="http://www.company.com";
		if(checkwebaddress(address))
		{
			System.out.println("The Web Address is Valid");
		}
		else
		{
			System.out.println("The Web Address is InValid");
		}

	}

}

