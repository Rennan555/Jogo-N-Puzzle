package nPuzzle.jogoBack;

import java.util.*;

public class Principal {
	
	static Impressao imp = new Impressao();
	static Menu menu = new Menu();
	static Scanner scan = new Scanner(System.in);
	static MovimentoNumeros movN = new MovimentoNumeros(0,0,0);
	static MovimentoLetras movL = new MovimentoLetras(0,0,0);
	
	public static void main(String[] args) throws MenuException, SetterException {
		menu.menu();
		menu.igualarMenu(movN, movL);
		imp.igualarAjuda(movN, movL);
		imp.ajuda();
		
		if(movN.getTipo() == 1) {
			if(movN.getTamanho() == 3) {
				imp.imprimirNumero1();
				while(movN.getsVitoria()) {
					System.out.println("Jogadas: " + movN.getJogadas());
					movN.aumentarJogadas();
					movN.moverPeça1(null);
					movN.bizonhar();
					movN.repetiçao1();
					imp.imprimirNumero1();
				}
			} else if(movN.getTamanho() == 4) {
				imp.imprimirNumero2();
				while(movN.getsVitoria()) {
					System.out.println("Jogadas: " + movN.getJogadas());
					movN.aumentarJogadas();
					movN.moverPeça2(null);
					movN.bizonhar();
					movN.repetiçao2();
					imp.imprimirNumero2();
				}
			} else if(movN.getTamanho() == 5) {
				imp.imprimirNumero3();
				while(movN.getsVitoria()) {
					System.out.println("Jogadas: " + movN.getJogadas());
					movN.aumentarJogadas();
					movN.moverPeça3(null);
					movN.bizonhar();
					movN.repetiçao3();
					imp.imprimirNumero3();
				}
			}
		} else if(movL.getTipo() == 2) {
			if(movL.getTamanho() == 3) {
				imp.imprimirLetra1();
				while(movL.getsVitoria()) {
					System.out.println("Jogadas: " + movL.getJogadas());
					movL.aumentarJogadas();
					movL.moverPeça1(null);
					movL.bizonhar();
					movL.repetiçao1();
					imp.imprimirLetra1();
				}
			} else if(movL.getTamanho() == 4) {
				imp.imprimirLetra2();
				while(movL.getsVitoria()) {
					System.out.println("Jogadas: " + movL.getJogadas());
					movL.aumentarJogadas();
					movL.moverPeça2(null);
					movL.bizonhar();
					movL.repetiçao2();
					imp.imprimirLetra2();
				}
			} else if(movL.getTamanho() == 5) {
				imp.imprimirLetra3();
				while(movL.getsVitoria()) {
					System.out.println("Jogadas: " + movL.getJogadas());
					movL.aumentarJogadas();
					movL.moverPeça3(null);
					movL.bizonhar();
					movL.repetiçao3();
					imp.imprimirLetra3();
				}
			}
		}
	}
}

