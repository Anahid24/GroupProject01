package GroupProject01;

public class Task08 {

	public static void main(String[] args) {
		// 8) Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int a= 2;
		int b= 4;
		int c;
		
		for(int i=0; i<=10; i++) {
			c= a+b;//6
			a=b;
			b=c;
			System.out.print(a+" ");
		}
		

	}

}
