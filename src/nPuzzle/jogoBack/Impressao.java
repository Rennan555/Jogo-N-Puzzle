package nPuzzle.jogoBack;

public class Impressao {
	
	private int i, j, k=0;
	private MovimentoNumeros movi = new MovimentoNumeros(0,0,0);
	private MovimentoLetras moviL = new MovimentoLetras(0,0,0);
	
	public void igualarAjuda(MovimentoNumeros movN, MovimentoLetras movL) throws SetterException {
		movi.setModo(movN.getModo());
		movi.setTipo(movN.getTipo());
		movi.setTamanho(movN.getTamanho());
		
		moviL.setModo(movL.getModo());
		moviL.setTipo(movL.getTipo());
		moviL.setTamanho(movL.getTamanho());
	}
	
	public void ajuda() {
		
		System.out.println("ASSIM EH COMO DEVE FICAR O TABULEIRO:");
		
		if(movi.getTipo() == 1) {
			if(movi.getTamanho() == 3) {
				System.out.println("1 2 3\n4 5 6\n7 8 X\n");
			} else if(movi.getTamanho() == 4) {
				System.out.println("1 2 3 4\n5 6 7 8\n9 10 11 12\n13 14 15 X\n");
			} else if(movi.getTamanho() == 5) {
				System.out.println("1 2 3 4 5\n6 7 8 9 10\n11 12 13 14 15\n16 17 18 19 20\n21 22 23 24 X\n");
			}
		} else if(movi.getTipo() == 2) {
			if(movi.getTamanho() == 3) {
				System.out.println("A B C\nD E F\nG H -\n");
			} else if(movi.getTamanho() == 4) {
				System.out.println("A B C D\nE F G H\nI J K L\nM N O -\n");
			} else if(movi.getTamanho() == 5) {
				System.out.println("A B C D E\nF G H I J\nK L M N O\nP Q R S T\nU V W X -\n");
			}
		}
	}
	
	public void imprimirNumero1() {
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(movi.getPeças().getNumeros1().get(k) == 0) {
					System.out.print("X ");
				} else {
					System.out.print(movi.getPeças().getNumeros1().get(k) + " ");
				}
				++k;
			}
			System.out.println("");
		}
		k=0;
	}
	
	public void imprimirNumero2() {
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(movi.getPeças().getNumeros2().get(k) == 0) {
					System.out.print("X ");
				} else {
					System.out.print(movi.getPeças().getNumeros2().get(k) + " ");
				}
				++k;
			}
			System.out.println("");
		}
		k=0;
	}
	
	public void imprimirNumero3() {
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(movi.getPeças().getNumeros3().get(k) == 0) {
					System.out.print("X ");
				} else {
					System.out.print(movi.getPeças().getNumeros3().get(k) + " ");
				}
				++k;
			}
			System.out.println("");
		}
		k=0;
	}
	
	public void imprimirLetra1() {
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(moviL.getPeças().getLetras1().get(k) == 'I') {
					System.out.print("- ");
				} else {
					System.out.print(moviL.getPeças().getLetras1().get(k) + " ");
				}
				k++;
			}
			System.out.println("");
		}
		k=0;
	}
	
	public void imprimirLetra2() {
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				if(moviL.getPeças().getLetras2().get(k) == 'P') {
					System.out.print("- ");
				} else {
					System.out.print(moviL.getPeças().getLetras2().get(k) + " ");
				}
				k++;				}
			System.out.println("");
		}
		k=0;
	}
	
	public void imprimirLetra3() {
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(moviL.getPeças().getLetras3().get(k) == 'Y') {
					System.out.print("- ");
				} else {
					System.out.print(moviL.getPeças().getLetras3().get(k) + " ");
				}
				k++;
			}
			System.out.println("");
		}
		k=0;
	}
}
