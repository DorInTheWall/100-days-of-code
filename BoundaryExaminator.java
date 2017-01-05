/*
This is a small program which is intended to test the users knowledge of the /b and /B metacharacters.

The user is shown a random String of 8 characters and must type in where /b or /B occur.

This program is written because I have a massive blind spot about /b and /B and would really like to not fail my OCP exam because of it.

*/


public class BoundaryExaminator{

	private char[] charArray; //ArrayList?
	private String testString;
	
	
	public static void main(String[] args){
	
	BoundaryExaminator obj = new BoundaryExaminator();
	
	obj.generateArray(); //generates an array of characters from which a random String will be formed
	obj.generateString(); //Randomly selects from char[] to form String to present to user
	
	
	
	} //main
	
	
	//Generate an array of characters by adding ints into a char[]
	private void generateArray(){
		
		charArray = new char[94];
		
		for(int i=33, j=0; i <= 126; i++, j++){
			charArray[j] = (char)i;
		}
		
	}
	
	
	
	//Select from charArray at random to create a String of 8 characters. Weight it to select non-char?
	private void generateString(){
		
	}
	
	


} //class
