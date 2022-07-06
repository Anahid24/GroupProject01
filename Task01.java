package GroupProject01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		//1) Using Scanner create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
		
		Scanner scan=new Scanner(System.in);
		int[]value=new int [5];
		System.out.println("Please print the numbers you want to enter below:");
		
		value[0]= scan.nextInt();
		value[1]= scan.nextInt();
		value[2]= scan.nextInt();
		value[3]= scan.nextInt();
		value[4]= scan.nextInt();
		
		int sum= 0;
		
		int length= value.length;
		
		for (int i= 0; i < length; i++) {
			
			sum=sum+value[i];
		}
		System.out.println(sum);
		

	}

}
