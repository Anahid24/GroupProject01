package GroupProject01;

public class Task09 {

	public static void main(String[] args) {
		// 9) Maximum and minimum number in the array
		
		int[] numbers= {4,8,10,3,80,100,89,77,40,12};
		int max= numbers[0];
		int min= numbers[0];
		
		for(int number:numbers) {
			if(max<number)max=number;
			if(max>number)min=number;
		}
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+min);

	}

}
