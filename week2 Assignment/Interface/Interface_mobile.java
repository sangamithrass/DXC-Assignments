package dxc;
interface Testable
{
	 boolean testCompatibility();
	
}
class Mobile 
{
	 private String name;
	 private String brand;
	 private String operatingSystemNmae;
	 private String operatingSystemVersion;
	
	    public Mobile(String name, String brand, String operatingSystemNmae, String operatingSystemVersion)
	    {
		this.name = name;
		this.brand = brand;
		this.operatingSystemNmae = operatingSystemNmae;
		this.operatingSystemVersion = operatingSystemVersion;
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemNmae() {
		return operatingSystemNmae;
	}

	public void setOperatingSystemNmae(String operatingSystemNmae) {
		this.operatingSystemNmae = operatingSystemNmae;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	 
	}
class SmartPhone extends Mobile implements Testable
{
		private String networkGeneration;
		
		 public SmartPhone(String name, String brand, String operatingSystemNmae, String operatingSystemVersion,String networkGeneration) 
		 {
				 super(name,brand,operatingSystemNmae,operatingSystemVersion);
	             this.networkGeneration = networkGeneration;
	     }
		public String getNetWorkGeneration() {
			return  getNetWorkGeneration();
		}
		
		 public void steNetworkGeneration(String networkGeneration) {
		 this.networkGeneration=networkGeneration;
		 }
		 
		 public boolean testCompatibility() 
		 {
			 if(super.getOperatingSystemNmae().equalsIgnoreCase("Saturn")) 
			 {
				 if(networkGeneration.equals("3G"))
				 {
					 if(super.getOperatingSystemVersion().equals("1.1") || super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3"))
					 { 
						 return true;
					 }
				 }
			 
			 else  if(networkGeneration.equals("4G"))
			 {
				 if(  super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3")) 
				 {
					return true;
				 }
			 }
		     else if(networkGeneration.equals("5G")) 
		     {
				 if(super.getOperatingSystemVersion().equals("1.3")) 
				 {
							 return true;
				 }
			 }
			 }		 
			 
		 if(super.getOperatingSystemNmae().equalsIgnoreCase("Gara"))
		 {
			 if(networkGeneration.equals("3G")) 
			 {
				 if(super.getOperatingSystemVersion().equalsIgnoreCase("EXRT.1") || super.getOperatingSystemVersion().equalsIgnoreCase("EXRT.2") || super.getOperatingSystemVersion().equalsIgnoreCase("EXRU.1"))
				 {
					 return true;
				 }
			 }
		 else  if(networkGeneration.equals("4G")) 
		 {
			 if(  super.getOperatingSystemVersion().equalsIgnoreCase("EXRT.2") || super.getOperatingSystemVersion().equalsIgnoreCase("EXRU.1")) 
			 {
					 return true;
			 }
		  }
	     else if(networkGeneration.equals("5G"))
	     {
			 if(super.getOperatingSystemVersion().equalsIgnoreCase("EXRU.1")) 
			 {
						 return true;
			 }
		  }
		 }
	return false;
	 
		 }
	}
	
public class Interface_mobile {

	public static void main(String[] args) 
	{
		SmartPhone smartPhone1 = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		SmartPhone smartPhone2 = new SmartPhone("FriezA8", "Quasar", "Gara", "EXRT.1", "4G");
		SmartPhone[]Smartphone= {smartPhone1,smartPhone2};
		for(SmartPhone smartPhone:Smartphone)
		{
		if(smartPhone.testCompatibility())
		 System.out.println("The mobile OS is compatible with the network generation!");
		else
		 System.out.println("The mobile OS is not compatible with the network generation!");
		System.out.println();
		}
	}
		

}
