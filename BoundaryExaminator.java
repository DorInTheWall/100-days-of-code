/*
This is a small program which is intended to test the users knowledge of the /b and /B metacharacters.

The user is shown a random String of 8 characters and must type in where /b or /B occur.

This program is written because I have a massive blind spot about /b and /B and would really like to not fail my OCP exam because of it.

Pointers, suggestions, better ways of doing things all welcomed.

*/
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

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
		
		charArray = new char[114];
		
		for(int i=33, j=0; i <= 126; i++, j++){
			charArray[j] = (char)i;
		}
		
		for(int i = 126; i < charArray.length; i++){
			charArray[i] = ' ';
		}
		
	}	
	
	//Select from charArray at random to create a String of 8 characters. Weight it to select non-char?
	private void generateString(){
	
		Random random = new Random();
		
		char[] generated = new char[8];
		
		for(int i = 0; i < generated.length; i++){
			generated[i] = charArray[random.nextInt(114)];			
		}
		
		
		//Checks if first or last characters are spaces and changes them. Simply for user readability
		boolean notSpace = false;
		
		do {
			
			if(generated[0] == 0){
				generated[0] = charArray[random.nextInt(114)];	
				
			} else if (generated[generated.length - 1] == 0){
				generated[generated.length-1] = charArray[random.nextInt(114)];	
				
			} else {
				notSpace = true;
			}
		} while(!notSpace);
		
		//Set the generated string to testString
		testString = new String(generated);
	
	}
	
	


} //class
