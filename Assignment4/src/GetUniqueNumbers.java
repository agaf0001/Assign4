import java.util.Scanner;

public class GetUniqueNumbers 
{
	
	private int length;
	private int num;
	private int zero;
	private int length2;
	private int zero2;
	private int n;
	private int controlVariable;
	private int controlVariable2;
	private int[] array;
	
	public GetUniqueNumbers()
	{
		length2 = 0;
	}
	

		public void getNumbers() 
		{
			System.out.println("Enter how many number you will enter: ");
			Scanner input = new Scanner(System.in);
			
			length = input.nextInt();
			///int[] array;
			array = new int[length];
			System.out.println("Enter numbers: ");
			
			for (int i = 0; i<length; i++) 
			{
				
		        num = input.nextInt();
		        if (num == 0) {zero2 = 1;}
				  for (int j =0; j<i; j++) 
				  {
					  if (num == array[j]) 
					  {
						  controlVariable++;
					  }
					  
				  }
				  if (controlVariable==0) {array[i]=num; }
				  else --i;
				  controlVariable = 0;
				  
		        controlVariable2++;
		        if (controlVariable2>=length)
		        	break;
			}
			  for (int a = 0; a<length; a++) 
			  {
				  if (array[a] == 0) 
				  {
					  zero++;
				  }
			  }
			  
			  zero = zero - zero2;
			  length2 = length-zero;
			  System.out.println(length2);

		} 
		public int returnRequierdLength()
		{
		 return length2;
		}
		
		public int[] returnArray()
		{
			return array;
		}
		
		
}
