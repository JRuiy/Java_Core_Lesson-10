package ua.lviv.lgs;

public class WrongInputConsoleParametersException extends Exception {
	

	String error;
	
	public WrongInputConsoleParametersException(String error) {
		super(error);
		this.error = error;
	}

	public String getError() {
		return error;
	}

}
