package project;

// 1.	Create an interface named Logger
public interface Logger {
/* 2.	Add two void methods to the Logger interface, each should take a String as an argument
	a.	Log
	b.	Error
*/
	
	public void Log(String log);
	public void Error(String error);
}
/*	3.	Create two classes that implement the Logger interface
a.	AsteriskLogger
b.	SpacedLogger
*/
