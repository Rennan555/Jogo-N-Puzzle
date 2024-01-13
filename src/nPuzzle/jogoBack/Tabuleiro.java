package nPuzzle.jogoBack;

public interface Tabuleiro {
	
	public void menu() throws MenuException;
	
	public void ajuda();
	
	public void igualarAjuda(MovimentoNumeros mov);
	
	public void bizonhar();
	
	public void igualarMenu(MovimentoNumeros mov);
	
	public void imprimirNumero1();
	
	public void imprimirNumero2();
	
	public void imprimirNumero3();
	
	public void imprimirLetra1();
	
	public void imprimirLetra2();
	
	public void imprimirLetra3();
	
	public void repetiçao1();
	
	public void repetiçao2();
	
	public void repetiçao3();
}
