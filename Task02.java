package GroupProject01;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		/* 2)
		 * Using Scanner create an array of countries. 
		 * When an array is created, retrieve all values from it and while retrieving those values 
		 * print capital for each country. (use 2 different loops).
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many countries do you want to enter?");
		int value=scan.nextInt();
		String capital= null;
		
		String[] countries= new String[value];
		for (int i=0; i < value; i++) {
			System.out.println("Enter country name");
			String country= scan.next();
			if(country.equalsIgnoreCase("USA")) {
				capital= "Washington DC";
			}else if (country.equalsIgnoreCase("Armenia")) {
				capital= "Yerevan";
			}else if (country.equalsIgnoreCase("Italy")) {
				capital="Rome";
			}else if (country.equalsIgnoreCase("Greece")) {
				capital= "Athens";
			}else if (country.equalsIgnoreCase("Germany")) {
				capital= "Berlin";
			}
			System.out.println("You are from "+capital+", "+country);
		}

	}

}
