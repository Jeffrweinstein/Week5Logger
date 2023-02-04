package project;

public class SpacedLogger implements Logger {
/*6.	The SpacedLogger should add spaces between each character of the String argument
 *  passed into its methods.
 */
	@Override
	public void Log(String log) {
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
//	7.	If the log method received “Hello” as an argument, it should print H e l l o			
		}
		System.out.println();
		}
		
	
/* 8.	The error method should do the same, but with “ERROR:” preceding the spaced out 
 * 		input (i.e. ERROR: H e l l o)
 */
	@Override
	public void Error(String error) {for (int i = 0; i < error.length(); i++) {
		System.err.print(error.charAt(i) + " ");
		
		
	}
	
	System.out.println();
	}
	}
//9.	Create a class named App that has a main method.