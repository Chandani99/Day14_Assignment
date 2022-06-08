package Question_2;

import java.util.Scanner;

public class UserRegistration {
	
    public void registerUser(String name, String country) throws InvalidCountryException{
    	
    	if(country.equalsIgnoreCase("India")) {
    		System.out.println("User is registerd successfully");
    	}
    	else {
    		InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
    		throw ice;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserRegistration ur=new UserRegistration();
		try {
			System.out.println("Enter user name");
			String name=sc.next();
			
			System.out.println("Enter Country name");
			String country=sc.next();
			
			ur.registerUser(name, country);
			
		}
		catch(InvalidCountryException ice) {
			System.out.println(ice.getMessage());
		}

		
		// TODO Auto-generated method stub

	}

}
