package nPuzzle.jogoBack;

import java.util.Collections;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MovimentoBolas implements Tabuleiro {

	
	private int jogadas = 0;
	private boolean vitoria = true; // Faz repetir o tabuleiro e a requisiçao da jogada
	private int tipo; // 1 -> Numeros / 2 -> Letras
	private int modo; // 1 -> Normal / 2 -> Bizonhocrazy
	private int tamanho; // 3 - 4 - 5
	Scanner e = new Scanner(System.in);
	private static Peças pec = new Peças();
	
	public MovimentoBolas(int tamanho, int tipo, int modo) {
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.modo = modo;
	}
	
	public Peças getPeças() {
		return MovimentoBolas.pec;
	}
	
	public void setPeças(Peças pec) throws SetterException {
		if(MovimentoBolas.pec == null) {
			new SetterException("INICIALIZAÇAO INDEVIDA DE PEÇAS");
		}
		MovimentoBolas.pec = pec;
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
		
		int posX = pec.getBolas1().indexOf(null); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		ImageIcon tempX = (ImageIcon) pec.getBolas1().toArray()[posX]; // Armazena o valor da posiçao de 0
		ImageIcon tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = (ImageIcon) pec.getBolas1().toArray()[posP];
				pec.getBolas1().set(posP,tempX);
				pec.getBolas1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP =  (ImageIcon) pec.getBolas1().toArray()[posP];
				pec.getBolas1().set(posP,tempX);
				pec.getBolas1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP =  (ImageIcon) pec.getBolas1().toArray()[posP];
				pec.getBolas1().set(posP,tempX);
				pec.getBolas1().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP =  (ImageIcon) pec.getBolas1().toArray()[posP];
				pec.getBolas1().set(posP,tempX);
				pec.getBolas1().set(posX,tempP);
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
		
		int posX = pec.getBolas2().indexOf(null); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		ImageIcon tempX = (ImageIcon) pec.getBolas2().toArray()[posX]; // Armazena o valor da posiçao de 0
		ImageIcon tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = (ImageIcon) pec.getBolas2().toArray()[posP];
				pec.getBolas2().set(posP,tempX);
				pec.getBolas2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = (ImageIcon) pec.getBolas2().toArray()[posP];
				pec.getBolas2().set(posP,tempX);
				pec.getBolas2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = (ImageIcon) pec.getBolas2().toArray()[posP];
				pec.getBolas2().set(posP,tempX);
				pec.getBolas2().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = (ImageIcon) pec.getBolas2().toArray()[posP];
				pec.getBolas2().set(posP,tempX);
				pec.getBolas2().set(posX,tempP);
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
		
		int posX = pec.getBolas3().indexOf(null); // Posiçao do vazio
		int posP; // Posiçao da peça a se mover
		ImageIcon tempX = (ImageIcon) pec.getBolas3().toArray()[posX]; // Armazena o valor da posiçao de 0
		ImageIcon tempP; // Armazena o valor da posiçao da peça a se mover
		
		if(movimento.equalsIgnoreCase("W")) {
			if(posX >= tamanho) {
				posP = posX - tamanho;
				tempP = (ImageIcon) pec.getBolas3().toArray()[posP];
				pec.getBolas3().set(posP,tempX);
				pec.getBolas3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para cima!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("A")) {
			if(posX > 0 && posX % tamanho != 0) {
				posP = posX - 1;
				tempP = (ImageIcon) pec.getBolas3().toArray()[posP];
				pec.getBolas3().set(posP,tempX);
				pec.getBolas3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para esquerda!");
				this.jogadas--;
			}
		} else if(movimento.equalsIgnoreCase("S")) {
			if(posX < tamanho*tamanho-tamanho) {
				posP = posX + tamanho;
				tempP = (ImageIcon) pec.getBolas3().toArray()[posP];
				pec.getBolas3().set(posP,tempX);
				pec.getBolas3().set(posX,tempP);
			} else {
				System.out.println("Nao ha como mover a peça para baixo!");
				this.jogadas--;
			}	
		} else if(movimento.equalsIgnoreCase("D")) {
			if(posX % tamanho != tamanho - 1) {
				posP = posX + 1;
				tempP = (ImageIcon) pec.getBolas3().toArray()[posP];
				pec.getBolas3().set(posP,tempX);
				pec.getBolas3().set(posX,tempP);
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
		ImageIcon temp1; // Posição de uma dada peça
		ImageIcon[] temp2 = new ImageIcon[9]; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho-1;i++) {
			temp1 = pec.getBolas1().get(i);
			temp2[i] = new ImageIcon(getClass().getResource("/imagens/facil" + i + ".jpg"));
			if(temp1.equals(temp2[i])) {
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
		ImageIcon temp1; // Posição de uma dada peça
		ImageIcon[] temp2 = new ImageIcon[16]; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho-1;i++) {
			temp1 = pec.getBolas2().get(i);
			temp2[i] = new ImageIcon(getClass().getResource("/imagens/medio" + i + ".jpg"));
			if(temp1.equals(temp2[i])) {
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
		ImageIcon temp1; // Posição de uma dada peça
		ImageIcon[] temp2 = new ImageIcon[25]; // Valor de uma dada peça
		int condiçao = 0;
		
		for(;i>tamanho*tamanho-1;i++) {
			temp1 = pec.getBolas3().get(i);
			temp2[i] = new ImageIcon(getClass().getResource("/imagens/dificil" + i + ".jpg"));
			if(temp1.equals(temp2[i])) {
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
			Collections.shuffle(pec.getBolas1());
			Collections.shuffle(pec.getBolas2());
			Collections.shuffle(pec.getBolas3());
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
