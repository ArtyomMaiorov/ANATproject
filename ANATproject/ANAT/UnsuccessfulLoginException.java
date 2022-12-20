package ANAT;

@SuppressWarnings("serial")
public class UnsuccessfulLoginException extends Exception{
	public UnsuccessfulLoginException(String errorMessage) {
		super(errorMessage);
	}
}
