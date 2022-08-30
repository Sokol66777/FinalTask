package by.tc.task01.dao.impl;

public class NoSuchAppliacneException extends Exception{

	public	NoSuchAppliacneException (){
		super();
	}
	
	public NoSuchAppliacneException (String message) {
		super(message);
	}
	
	public NoSuchAppliacneException (Exception e) {
		super (e);
	}
	
	public NoSuchAppliacneException (String message, Exception e) {
		super(message,e);
	}
}
