//Class UniqueNumbers
/*This class prompts user to enter any numbers and then displays unique one   */

//Author: Olexandr Agafonov
//CST8110 Introduction to Computer Programming   
//Lab section - 402. Lab teacher - Howard Rosenblum 
import java.util.Scanner;

public class UniqueNumbers {

	private int iArrayLength;
	private int iSecondArrayLength;
	private int[] iEnteredUniqueNumbers;
	private int[] iDisplayedUniqueNumbers;
	private int iArrayIndexValue;
	private int iNumberOfZeros;
	private int iZeroControlVariable;
	private int controlVariable;
	private int controlVariable2;
	
	public UniqueNumbers(){
		
		iArrayLength = 0;
		iArrayLength = 0;
		iArrayIndexValue = 0;
		iNumberOfZeros = 0;
		iZeroControlVariable = 0;
		controlVariable = 0;
		controlVariable2 = 0;
		
		
	}

	public void getNumbers() {   
		System.out.println("Please enter the quantity of numbers you would like to enter: ");
		Scanner input = new Scanner(System.in);

		iArrayLength = input.nextInt();
		while (iArrayLength <=0 ) {
			System.out.println("Error: must be positive number greater than 0. Please reenter:  ");
			iArrayLength = input.nextInt();
			
		}

		iEnteredUniqueNumbers = new int[iArrayLength];
		System.out.println("Please enter the numbers: ");

		for (int i = 0; i < iArrayLength; i++) {    

			iArrayIndexValue = input.nextInt();
			if (iArrayIndexValue == 0) {   //If zero is entered by user, value of iZeroControlVariable will change to 1.
				iZeroControlVariable = 1;  // 
			}
			for (int j = 0; j < i; j++) {    //Checks if entered number already exists in an array. If yes, adds one to the controlVariable
				if (iArrayIndexValue == iEnteredUniqueNumbers[j]) {
					controlVariable++;
				}

			}
			if (controlVariable == 0) {   //If controlVariable is zero, it adds entered number to an array
				iEnteredUniqueNumbers[i] = iArrayIndexValue;
			} else
				--i;  // Subtract 1 from the index of array if entered number already exist there, so next entered   
			controlVariable = 0;  //number will be added to right index

			controlVariable2++;   //Adds one to controlVariable every time is order to exit loop when array is full. 
			if (controlVariable2 >= iArrayLength) // When controlVariable reaches length of the array, loop ends. 
				break;
		}  //end of for
		for (int i = 0; i < iArrayLength; i++) {  //Counts the number of zeros in an array
			if (iEnteredUniqueNumbers[i] == 0) {
				iNumberOfZeros++;
			}
		}

		iNumberOfZeros = iNumberOfZeros - iZeroControlVariable; 
		iSecondArrayLength = iArrayLength - iNumberOfZeros; //Length of second array will be equal to the length of first array
		                                                     // minus number of zeros. If user has entered zero initially, 
		                                                     // 1 will be added to the length of second array
		
	}

	public void createNewArray() {  //Creates new array, which will have length equal to the quantity of unique numbers

		
		iDisplayedUniqueNumbers = new int[iSecondArrayLength];
		for (int i = 0; i < iSecondArrayLength; i++) {
			iDisplayedUniqueNumbers[i] = iEnteredUniqueNumbers[i];

		}

	}

	public void displayArray() { //Displays unique numbers
		System.out.println("Unique numbers are:  ");

		for (int i = 0; i < iSecondArrayLength; i++) {
			System.out.print(iDisplayedUniqueNumbers[i] + " ");
		}
	}
}
