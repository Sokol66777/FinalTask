package by.tc.task01.service.validation;

public class NoHaveValitationException extends Exception {

	public NoHaveValitationException(String massage) {
		super(massage);
	}

	public NoHaveValitationException(Exception e) {
		super(e);
	}

	public NoHaveValitationException() {
		super();
	}

	public NoHaveValitationException(String massage, Exception e) {
		super(massage, e);
	}

}
