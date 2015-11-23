/*Joshua Cheseman 
 * David Casarrubias
 * 10/25/15
 * 
 * This program gets a string filled with different types of parenthesis and brackets 
 * given by the user and then the program runs and checks to see 
 * if there is an equal number of open and closed parenthesis 
 * the program returns true to let the user know the string is balanced.
 * If not the program returns false. 
 * 
 */
import java.util.*;

/*The main method prompts the user for a string, this string in then
 * passed into the character method for balance checking
 * once that is complete the main method prints whether
 * or not the  string is balanced. 
 * 
 */
public class BalancedSymbolChecker {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter in your values");
		
		String line =scan.nextLine();

		char[] pushSymbols = { '[', '(', '{' }; //Has the open characters that the program needs to compare with 
		//the string received by the user.
		
		char[] pushSymbolsLeft = { ']', ')', '}' }; //Has the close characters that the program needs to compare with the string received by the user. 
	
		BalancedSymbolChecker balancechecker=new BalancedSymbolChecker(); //Makes an object out of class so the method that checks if string is balanced can be triggered. 
		balancechecker.character(line);//takes in the string given by user to check for balancing. 
		System.out.println(balancechecker.character(line)); //prints out whether or not the string is balanced. 

		

	}


/*
 * This method reads in the values from the user and then compares them with the characters from the two arrays and adds them into the stack if there is a match. 
 * It also checks to see if there is an equal number of open and closed characters and deletes the ones that match.
 * If the stack is empty at the very end then method will return true, if the stack isn't empty it will return false. 
 */
	public boolean character(String chars){
		Stack<Character> s=new Stack<Character>(); //creates a stack to store the values entered in by the user. 
		for(int i=0; i<chars.length();i++){ //goes through the entire string entered by user
		if(chars.charAt(i) == '[' || chars.charAt(i)=='(' || chars.charAt(i)=='{'){ //checks to see if there are any open characters and adds them into the stack. 
			s.push(chars.charAt(i));
	
	}
	
	
	
		
}
		for(int x=0; x<chars.length();x++){ //goes through the string given by the user. 
			if(chars.charAt(x)==']'|| chars.charAt(x)== ')'|| chars.charAt(x)=='}'){ //checks to see if there are any closed characters in the string
				
				//this switch will check for any matches of open and closed characters and delete any match it finds from the stack. 
				switch(chars.charAt(x)){
				case ']': if(s.peek().equals('[')){
				s.pop();
				}
				break;
				case')':if(s.peek().equals('(')){
					s.pop();
				}
				break;
				case'}': if(s.peek().equals('{')){
					s.pop();
				}
				
					
				}
				
			}
		}
		/*this if statement checks to see if all the values in the stack are now gone, if they are then it means the string given by user is balanced and will return true
		 * . If not it means the statement wasn't balanced and it will return false. 
		 */
		if(s.isEmpty()){
			return true;	
		}else
			return false;
		
	}
}
