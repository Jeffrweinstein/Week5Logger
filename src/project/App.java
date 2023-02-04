package project;

public class App {
/*
 * 10.	In this class instantiate an instance of each of your logger classes that 
 * 		implement the Logger interface.
 * 11.	Test both methods on both instances, passing in Strings of your choice.
 */
	
	
	public static void main(String[] args) {
		Logger loggerAsterisk = new AsteriskLogger();
		 loggerAsterisk.Log("Wood");	
		 loggerAsterisk.Error("Your wood will burn");
		
		
		 Logger loggerSpaced = new SpacedLogger();
		 System.out.println();
		loggerSpaced.Log("Maple");
		System.out.println(); 
		loggerSpaced.Error("Maple is no Hickory");
		
		

	}

}
