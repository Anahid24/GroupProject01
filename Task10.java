package GroupProject01;

public class Task10 {

	public static void main(String[] args) {
		// 10) Write a java program to find the second largest number in the array
		
		int[] numbers= {2, 8, 10, 17, 20, 16, 35};
		int max= 0;
		int sLargest= 0;
		int min= 0;
		
		for(int i=0; i<numbers.length; i++) {
			int number=numbers[i];
			if(number>max) {
				sLargest=max;
				max=number;
			}else if(number>sLargest && number!=max) {
				sLargest=number;
			}
			System.out.println("The maximum number is: "+max);
			System.out.println("The second largest number is: "+sLargest);
		}

 }
}
