package nPuzzle.jogoBack;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Peças {
	
	int i;
	
	private ArrayList<Integer> numeros1 = new ArrayList<Integer>(); {
		for(i=0;i<9;i++) {
			numeros1.add(i);
		}
		Collections.shuffle(numeros1);
	}
	
	private ArrayList<Integer> numeros2 = new ArrayList<Integer>(); {
		for(i=0;i<16;i++) {
			numeros2.add(i);
		}
		Collections.shuffle(numeros2);
	}
	
	private ArrayList<Integer> numeros3 = new ArrayList<Integer>(); {
		for(i=0;i<25;i++) {
			numeros3.add(i);
		}
		Collections.shuffle(numeros3);
	}
	
	private ArrayList<Character> letras1 = new ArrayList<Character>(); {
		for(i=65;i<74;i++) {
			char c = (char) i;
			letras1.add(c);
		}
		Collections.shuffle(letras1);
	}
	
	private ArrayList<Character> letras2 = new ArrayList<Character>(); {
		for(i=65;i<81;i++) {
			char c = (char) i;
			letras2.add(c);
		}
		Collections.shuffle(letras2);
	}
	
	private ArrayList<Character> letras3 = new ArrayList<Character>(); {
		for(i=65;i<90;i++) {
			char c = (char) i;
			letras3.add(c);
		}
		Collections.shuffle(letras3);
	}
	
	private ArrayList<ImageIcon> bolas1 = new ArrayList<ImageIcon>(); {
		for(i=0;i<9;i++) {
			if(i==8) {
				bolas1.add(null);
			} else {
				bolas1.add(new ImageIcon(getClass().getResource("/imagens/facil" + i + ".jpg")));
			}
		}
		Collections.shuffle(bolas1);
	}
	
	private ArrayList<ImageIcon> bolas2 = new ArrayList<ImageIcon>(); {
		for(i=0;i<16;i++) {
			if(i==15) {
				bolas2.add(null);
			} else {
				bolas2.add(new ImageIcon(getClass().getResource("/imagens/medio" + i + ".jpg")));
			}
		}
		Collections.shuffle(bolas2);
	}
	
	private ArrayList<ImageIcon> bolas3 = new ArrayList<ImageIcon>(); {
		for(i=0;i<25;i++) {
			if(i==24) {
				bolas3.add(null);
			} else {
				bolas3.add(new ImageIcon(getClass().getResource("/imagens/dificil" + i + ".jpg")));
			}
		}
		Collections.shuffle(bolas3);
	}
	
	public ArrayList<Integer> getNumeros1(){
		return this.numeros1;
	}
	
	public ArrayList<Integer> getNumeros2(){
		return this.numeros2;
	}
	
	public ArrayList<Integer> getNumeros3(){
		return this.numeros3;
	}
	
	public ArrayList<Character> getLetras1(){
		return this.letras1;
	}
	
	public ArrayList<Character> getLetras2(){
		return this.letras2;
	}
	
	public ArrayList<Character> getLetras3(){
		return this.letras3;
	}
	
	public ArrayList<ImageIcon> getBolas1() {
		return this.bolas1;
	}
	
	public ArrayList<ImageIcon> getBolas2() {
		return this.bolas2;
	}
	
	public ArrayList<ImageIcon> getBolas3() {
		return this.bolas3;
	}
}