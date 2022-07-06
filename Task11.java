package GroupProject01;

public class Task11 {

	public static void main(String[] args) {
		// 11) Write a program to print out duplicate elements from an Array of Strings
		
		int i,j;
		String[]name= {"Puppies", "Kittens", "Puppies", "Kittens"};
		System.out.println("These are my favorite animals");
		for(i=0; i<name.length; i++) 
		{
			for(j=i+1; j<name.length; j++)
			{
				if(name[i].equals(name[j])) 
				{
					System.out.println(name[i]);
					break;
				}
			}
		}
	
	}
}
