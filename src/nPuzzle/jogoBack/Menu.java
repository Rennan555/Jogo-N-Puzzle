package nPuzzle.jogoBack;

import java.util.*;

public class Menu {
	
	Scanner e = new Scanner(System.in);
	MenuException error = new MenuException(null);
	
	private int tipo = 1;
	private int modo = 1;
	private int tamanho = 4;
	
	private MovimentoNumeros movN = new MovimentoNumeros(0,0,0);
	private MovimentoLetras movL = new MovimentoLetras(0,0,0);
	
	public MovimentoNumeros getMovN() {
		return this.movN;
	}
	
	public MovimentoLetras getMovL() {
		return this.movL;
	}
	
	public void setMovN(MovimentoNumeros movN) {
		this.movN = movN;
	}
	
	public void setMovL(MovimentoLetras movL) {
		this.movL = movL;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void setModo(int modo) {
		this.modo = modo;
	}
	
	public void igualarMenu(MovimentoNumeros movN, MovimentoLetras movL) throws SetterException {
		movN.setTamanho(this.tamanho);
		movN.setModo(this.modo);
		movN.setTipo(this.tipo);
		
		movL.setTamanho(this.tamanho);
		movL.setModo(this.modo);
		movL.setTipo(this.tipo);
	}
	
	public void menu() throws MenuException {
		int tamanhoTemp;
		int tipoTemp;
		int modoTemp;
		
		System.out.println("---Bem-vindo ao N-Puzzle!---\n");
		System.out.println("Selecione o tamanho do tabuleiro (NxN)");
		System.out.println("1 - Facil\n2 - Medio\n3 - Dificil");
		tamanhoTemp = e.nextInt();
		if(tamanhoTemp == 1) {
			this.tamanho = 3;
		} else if(tamanhoTemp == 2) {
			this.tamanho = 4;
		} else if(tamanhoTemp == 3) {
			this.tamanho = 5;
		} else {
			throw new MenuException("Dificuldade de jogo invalido!");
		}
		
		System.out.println("Selecione o tipo do tabuleiro\n1 - Numeros\n2 - Letras");
		tipoTemp = e.nextInt();
		if(tipoTemp == 1) {
			this.tipo = 1;
		} else if(tipoTemp == 2) {
			this.tipo = 2;
		} else {
			throw new MenuException("Tipo de jogo invalido!");
		}
		
		System.out.println("Selecione o modo do tabuleiro\n1 - Normal\n2 - Bizonho");
		modoTemp = e.nextInt();
		if(modoTemp == 1) {
			this.modo = 1;
		} else if(modoTemp == 2) {
			this.modo = 2;
		} else {
			throw new MenuException("Modo de jogo invalido!");
		}
	}
}
