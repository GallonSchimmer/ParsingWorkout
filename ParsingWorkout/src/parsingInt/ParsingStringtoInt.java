package parsingInt;

public class ParsingStringtoInt {
	
	public static void main(String[] args) {
		
		String simpleString = "Change to LowerCase and try to parse to Integer";
		
		String numberString = "19837";
		String secondNumberString = "9845";
		
		System.out.println(simpleString.toLowerCase());
		
		//int simpleStringParsed = Integer.parseInt(simpleString);
		//System.out.println(simpleStringParsed); 					// NumberFormatException
		
		int numberStringParsed = Integer.parseInt(numberString);
		System.out.println(numberStringParsed);
		int secondNumberStringParsed = Integer.parseInt(secondNumberString);
		System.out.println(secondNumberStringParsed);
		
		System.out.println("This String to numbers dont add in syso, they concat,  wow!!: " + numberStringParsed + secondNumberStringParsed);
		
		int Sum = numberStringParsed + secondNumberStringParsed;
		System.out.println("This the Sum of the two Strings, so zuweissen und funk power Sum: " + Sum);
		
		
		String substringChange = simpleString.substring(0,6);
		System.out.println("This is the substring Change : " + substringChange);
		
		String onlyOneLetter = simpleString.substring(0,1);
		System.out.println("This is the Letter C of Change: " + onlyOneLetter);
		
		//To not get the NumberFormatException use the 29 as parameter
		
		int substringOnlyOneLetterParsed = Integer.parseInt(onlyOneLetter, 29);
		System.out.println("This is the Letter C from substring from Change parsed to Integer : " + substringOnlyOneLetterParsed); //NumberFormatExcetion
		
		
		int substringChangeParsed = Integer.parseInt(substringChange.toLowerCase(), 29);
		System.out.println("This is the substring Change as an Integer parsed : " + substringChangeParsed);			//NumberFormatException
		
		
	}
	
	//https://www.geeksforgeeks.org/how-to-convert-string-to-int-in-java/


	/*
	parseInt("geeks", 29) returns 11670324, 
	Number system with base 29 can have digits 0-9 
	followed by characters a,b,c... upto s

	parseInt("geeksforgeeks", 29) throws a NumberFormatException as the 
	           result is not an integer.

	*/

}

