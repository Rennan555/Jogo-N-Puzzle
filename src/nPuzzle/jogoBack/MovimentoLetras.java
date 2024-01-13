package nPuzzle.jogoBack;

import java.util.*;

import javax.swing.JOptionPane;

public class MovimentoLetras implements Tabuleiro {
	
	private int jogadas = 0;
	private boolean vitoria = true; // Faz repetir o tabuleiro e a requisiçao da jogada
	private int tipo; // 1 -> Numeros / 2 -> Letras
	private int modo; // 1 -> Normal / 2 -> Bizonhocrazy
	private int tamanho; // 3 - 4 - 5
	Scanner e = new Scanner(System.in);
	private static Peças pec = new Peças();
	
	public MovimentoLetras(int tamanho, int tipo, int modo) {
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.modo = modo;
	}
	
	public Peças getPeças() {
		return MovimentoLetras.pec;
	}
	
	public void setPeças(Peças pec) throws SetterException {
		if(MovimentoLetras.pec == null) {
			new SetterException("INICIALIZAÇAO INDEVIDA DE PEÇAS");
		}
		MovimentoLetras.pec = pec;
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public void setTipo(int tipo) throws SetterException {
		if(this.tipo <= 0 || this.tipo >= 4) {
			throw new SetterException("INICIALIZAÇAO INDEVIDA DO TIPO");
		}
		this.tipo = tipo;
	}
	
	public int getModo() {
		return this.modo;
	}
	
	public void setModo(int modo) throws SetterException {
		if(this.modo <= 0 || this.modo >= 4) {
			new SetterException("INICIALIZAÇAO INDEVIDA DO MODO");
		}
		this.modo = modo;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(int tamanho) throws SetterException {
		if(this.tamanho <= 0 || this.tamanho >= 6) {
			new SetterException("INICIALIZAÇAO INDEVIDA DA DIFICULDADE");
		}
		this.tamanho = tamanho;
	}

	@Override
	public void menu() throws MenuException {
	}
	
	public boolean getsVitoria() {
		return this.vitoria;
	}
	
	public int getJogadas() {
		return jogadas;
	}
	
	public void aumentarJogadas() {
		jogadas++;
	}
	
	public void moverPeça1(String movimento) { // Metodo que move a peça
		
		if(movimento == null) {
			System.out.println("Movimento(W/A/S/D):\n");
			movimento = e.nextLine();
		}
		
		int posX = pec.getLetras1().indexOf('I'); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		char tempX = pec.getLetras1().get(posX); // Armazena o valor da posiçao de 0
		char tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getLetras1().get(posP);
				pec.getLetras1().set(posP,tempX);
				pec.getLetras1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getLetras1().get(posP);
				pec.getLetras1().set(posP,tempX);
				pec.getLetras1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getLetras1().get(posP);
				pec.getLetras1().set(posP,tempX);
				pec.getLetras1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getLetras1().get(posP);
				pec.getLetras1().set(posP,tempX);
				pec.getLetras1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para a esquerda!");
				this.jogadas--;
			}
		} else {
			System.out.println("Comando invalido!");
			this.jogadas--;
		}
	}
	
	public void moverPeça2(String movimento) { // Metodo que move a peça
		
		if(movimento == null) {
			System.out.println("Movimento(W/A/S/D):\n");
			movimento = e.nextLine();
		}
		
		int posX = pec.getLetras2().indexOf('P'); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		char tempX = pec.getLetras2().get(posX); // Armazena o valor da posiçao de 0
		char tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getLetras2().get(posP);
				pec.getLetras2().set(posP,tempX);
				pec.getLetras2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getLetras2().get(posP);
				pec.getLetras2().set(posP,tempX);
				pec.getLetras2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getLetras2().get(posP);
				pec.getLetras2().set(posP,tempX);
				pec.getLetras2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getLetras2().get(posP);
				pec.getLetras2().set(posP,tempX);
				pec.getLetras2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para a esquerda!");
				this.jogadas--;
			}
		} else {
			System.out.println("Comando invalido!");
			this.jogadas--;
		}
	}
	
	public void moverPeça3(String movimento) { // Metodo que move a peça
		
		if(movimento == null) {
			System.out.println("Movimento(W/A/S/D):\n");
			movimento = e.nextLine();
		}
		
		int posX = pec.getLetras3().indexOf('Y'); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		char tempX = pec.getLetras3().get(posX); // Armazena o valor da posiçao de 0
		char tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getLetras3().get(posP);
				pec.getLetras3().set(posP,tempX);
				pec.getLetras3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getLetras3().get(posP);
				pec.getLetras3().set(posP,tempX);
				pec.getLetras3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getLetras3().get(posP);
				pec.getLetras3().set(posP,tempX);
				pec.getLetras3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getLetras3().get(posP);
				pec.getLetras3().set(posP,tempX);
				pec.getLetras3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para a esquerda!");
				this.jogadas--;
			}
		} else {
			System.out.println("Comando invalido!");
			this.jogadas--;
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void repetiçao1() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		char temp; // Valor de uma dada peça
		char condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getLetras1().indexOf(i+65);
			temp = pec.getLetras1().get(i);
			if(pos == temp - 65) {
				condiçao++;
			}
		}
		if(condiçao == tamanho*tamanho) {
			vitoria = false;
			JOptionPane.showMessageDialog(null, "VOCE VENCEU!!!", "PARABENS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void repetiçao2() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		int temp; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getLetras2().indexOf(i+65);
			temp = pec.getLetras2().get(i - 65);
			if(pos == temp) {
				condiçao++;
			}
		}
		if(condiçao == tamanho*tamanho) {
			vitoria = false;
			JOptionPane.showMessageDialog(null, "VOCE VENCEU!!!", "PARABENS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void repetiçao3() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		int temp; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getLetras3().indexOf(i+65);
			temp = pec.getLetras3().get(i - 65);
			if(pos == temp) {
				condiçao++;
			}
		}
		if(condiçao == tamanho*tamanho) {
			vitoria = false;
			JOptionPane.showMessageDialog(null, "VOCE VENCEU!!!", "PARABENS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@ Override
	public void bizonhar() {
		if(jogadas % 8 == 0 && this.modo == 2) {
			Collections.shuffle(pec.getLetras1());
			Collections.shuffle(pec.getLetras2());
			Collections.shuffle(pec.getLetras3());
		}
	}
	
	@Override
	public void imprimirNumero1() {
	}
	
	@Override
	public void imprimirNumero2() {
	}
	
	@Override
	public void imprimirNumero3() {
	}
	
	@ Override
	public void imprimirLetra1() {
	}
	
	@ Override
	public void imprimirLetra2() {
	}
	
	@ Override
	public void imprimirLetra3() {
	}
	
	@ Override
	public void igualarMenu(MovimentoNumeros mov) {
	}

	@Override
	public void ajuda() {
	}

	@Override
	public void igualarAjuda(MovimentoNumeros mov) {	
	}
}