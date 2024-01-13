package nPuzzle.jogoBack;

public class MenuException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MenuException(String message) {
		super();
	}
	
	@ Override
	public String toString() {
		return this.getMessage();
	}
}
