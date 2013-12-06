
import java.util.Scanner;

public class GetNumbers
{
	public static void main (String[] args) 
	{
		int arrayNum = 0;
		int num = 0;
		int n = 0;
		int zero = 0;
		int newArray = 0;
		int bla = 0;
	
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many number do you wish to enter: ");

		arrayNum = input.nextInt();
		int[] array;

		array = new int[arrayNum];

		System.out.println("Eneter numbers: ");

		for (int j = 0; j < arrayNum; j++, n++) 
		{

			num = input.nextInt();

			array[n] = num;

		}

	for (int d =0; d<arrayNum; d++) 
	{	
		

	for (int c = 0; c<arrayNum; c++) 
	{
		if (array[d] == array[c]) 
		{ 
			if (c!=d) {
			
			for (int nn=c; (nn+1)<arrayNum; nn++) 
			{
			      
				array[nn] = array[nn+1]; 
		 
			}	
			array[arrayNum-1] = 0;
			}
		}
	
	}
	}
		  for (int a=0; a<arrayNum; a++) 
		  {
			  if (array[a]==0) 
			  {
				  zero++;
			  }
		  }
		  
		  int[] finalArray;
		  newArray = arrayNum-zero;
		  finalArray = new int[newArray]; 
		  
		  for(int a = 0; a<newArray; a++ ) 
		  {
			  finalArray[a] = array[bla];
			  bla++;
		  }
	   
	
	  
	 for (int a = 0; a < newArray; a++) 
	   {
		System.out.print(finalArray[a] + " ");
	   }   
	}
	
	
}
