package nPuzzle.jogoBack;

public class SetterException extends Exception {
	private static final long serialVersionUID = 1L;

	public SetterException(String message) {
		super();
	}
	
	@ Override
	public String toString() {
		return this.getMessage();
	}
}
