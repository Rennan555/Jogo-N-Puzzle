package nPuzzle.jogoBack;

import java.util.*;

import javax.swing.JOptionPane;

public class MovimentoNumeros implements Tabuleiro {
	
	private int jogadas = 0;
	private boolean vitoria = true; // Faz repetir o tabuleiro e a requisiçao da jogada
	private int tipo; // 1 -> Numeros / 2 -> Letras
	private int modo; // 1 -> Normal / 2 -> Bizonhocrazy
	private int tamanho; // 3 - 4 - 5
	Scanner e = new Scanner(System.in);
	private static Peças pec = new Peças();
	
	public MovimentoNumeros(int tamanho, int tipo, int modo) {
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.modo = modo;
	}
	
	public Peças getPeças() {
		return MovimentoNumeros.pec;
	}
	
	public void setPeças(Peças pec) throws SetterException {
		if(MovimentoNumeros.pec == null) {
			throw new SetterException("INICIALIZAÇAO INDEVIDA DE PEÇAS");
		}
		MovimentoNumeros.pec = pec;
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
		
		int posX = pec.getNumeros1().indexOf(0); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		int tempX = pec.getNumeros1().get(posX); // Armazena o valor da posiçao de 0
		int tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getNumeros1().get(posP);
				pec.getNumeros1().set(posP,tempX);
				pec.getNumeros1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getNumeros1().get(posP);
				pec.getNumeros1().set(posP,tempX);
				pec.getNumeros1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getNumeros1().get(posP);
				pec.getNumeros1().set(posP,tempX);
				pec.getNumeros1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getNumeros1().get(posP);
				pec.getNumeros1().set(posP,tempX);
				pec.getNumeros1().set(posX,tempP);
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
		
		int posX = pec.getNumeros2().indexOf(0); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		int tempX = pec.getNumeros2().get(posX); // Armazena o valor da posiçao de 0
		int tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getNumeros2().get(posP);
				pec.getNumeros2().set(posP,tempX);
				pec.getNumeros2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getNumeros2().get(posP);
				pec.getNumeros2().set(posP,tempX);
				pec.getNumeros2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getNumeros2().get(posP);
				pec.getNumeros2().set(posP,tempX);
				pec.getNumeros2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getNumeros2().get(posP);
				pec.getNumeros2().set(posP,tempX);
				pec.getNumeros2().set(posX,tempP);
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
		
		int posX = pec.getNumeros3().indexOf(0); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		int tempX = pec.getNumeros3().get(posX); // Armazena o valor da posiçao de 0
		int tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = pec.getNumeros3().get(posP);
				pec.getNumeros3().set(posP,tempX);
				pec.getNumeros3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = pec.getNumeros3().get(posP);
				pec.getNumeros3().set(posP,tempX);
				pec.getNumeros3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = pec.getNumeros3().get(posP);
				pec.getNumeros3().set(posP,tempX);
				pec.getNumeros3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = pec.getNumeros3().get(posP);
				pec.getNumeros3().set(posP,tempX);
				pec.getNumeros3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para a esquerda!");
				this.jogadas--;
			}
		} else {
			System.out.println("Comando invalido!");
			this.jogadas--;
		}
	}

	@Override
	public void repetiçao1() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		int temp; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getNumeros1().indexOf(i);
			temp = pec.getNumeros1().get(i);
			if(pos == temp) {
				condiçao++;
			}
		}
		if(condiçao == tamanho*tamanho) {
			vitoria = false;
			JOptionPane.showMessageDialog(null, "VOCE VENCEU!!!", "PARABENS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@Override
	public void repetiçao2() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		int temp; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getNumeros2().indexOf(i);
			temp = pec.getNumeros2().get(i);
			if(pos == temp) {
				condiçao++;
			}
		}
		if(condiçao == tamanho*tamanho) {
			vitoria = false;
			JOptionPane.showMessageDialog(null, "VOCE VENCEU!!!", "PARABENS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@Override
	public void repetiçao3() { // Verifica se o jogo ja acabou
		int i = 0;
		int pos; // Posição de uma dada peça
		int temp; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho;i++) {
			pos = pec.getNumeros3().indexOf(i);
			temp = pec.getNumeros3().get(i);
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
			Collections.shuffle(pec.getNumeros1());
			Collections.shuffle(pec.getNumeros2());
			Collections.shuffle(pec.getNumeros3());
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