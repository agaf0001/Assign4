
public class DisplayUniqueNumbers 
{
	private int[] array2;
	private int length2;
	private int[] array;

	
	public void createNewArray()  
	{
		
		
		GetUniqueNumbers value = new GetUniqueNumbers(); 
		
		value.getNumbers();
		length2 = value.returnRequierdLength();
		
		System.out.println(length2);
		
		array = value.returnArray();
		array2 = new int[length2];
		for (int a =0; a<length2; a++) 
		{
		  array2[a] = array[a];
		  
		}
		
		
	
	}
	public void displayArray()
	{
		
		for (int a =0; a<length2; a++) 
		{
			System.out.print(array2[a]+" ");
		}
	}

}
