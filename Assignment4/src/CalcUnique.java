import java.util.Scanner;
public class CalcUnique 
{

	public static void main (String[] args) 
	{
		int length = 0;
		int num = 0;
		int zero = 0;
		int length2 = 0;
		int zero2 = 0;
		int n = 0;
		int control = 0;
		int aaa = 0;
		System.out.println("Enter how many number you will enter: ");
		Scanner input = new Scanner(System.in);
		
		length = input.nextInt();
		int[] array;
		array = new int[length];
		System.out.println("Enter numbers: ");
		
		for (int a = 0; a<length; a++) 
		{
			
	        num = input.nextInt();
	        if (num == 0) {zero2 = 1;}
			  for (int b =0; b<a; b++) 
			  {
				  if (num == array[b]) 
				  {
					  control++;
				  }
				  
			  }
			  if (control==0) {array[a]=num; }
			  else --a;
			  control = 0;
			  
	        aaa++;
	        if (aaa>=length)
	        	break;
		}
		  for (int a = 0; a<length; a++) 
		  {
			  if (array[a] == 0) 
			  {
				  zero++;
			  }
		  }
//////////////////////////////////////////////////////////////////////////////////
		  zero = zero - zero2;
		  length2 = length-zero;
		//  if (zero2==1) {length2+=1;}
//////////////////////////////////////////////////////////////////////////////////
		int [] array2;
		array2 = new int[length2];
		for (int a =0; a<length2; a++) 
		{
		  array2[a] = array[a];
		  
		}
	
	
		for (int a =0; a<length2; a++) 
		{
			System.out.print(array2[a]+" ");
		}
	}
	
}
