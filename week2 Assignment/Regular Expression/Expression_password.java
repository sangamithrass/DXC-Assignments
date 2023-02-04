package dxc;

public class Expression_password {

	 public static boolean checkPasswordValidity(String password) 
	 {
		
		 boolean flag=false;
		 String regex = "[A-Z](?=.{1,29}$)[A-Za-z]{1,}([ ][A-Z][A-Za-z]{1,})*";
		 if(password.matches(regex))
	      {
	    	  flag=true;
	      }
	      
		return flag;
	 }
	 
	 
		 public static void main(String[] args) {
		 String password = "Roger Federer";
		 System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
		 String password1 = "roger federer";
		 System.out.println("The password is "+ (checkPasswordValidity(password1) ? "valid!" : "invalid!"));
		 }
		 
		}