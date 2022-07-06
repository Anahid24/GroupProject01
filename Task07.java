package GroupProject01;

public class Task07 {

	public static void main(String[] args) {
		// 7) Write a java program to check whether a given number is prime or not?
		
		int number= 10;
		boolean isPrime= true;
		
		if(number>1) {
			if(number%2==0) {
				isPrime=true;
			}else {
				isPrime=false;
			}
		System.out.println("Is the given number "+number+" is prime: "+isPrime);
	}

  }
}