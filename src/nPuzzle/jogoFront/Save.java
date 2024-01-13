package nPuzzle.jogoFront;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Save {
	
	File save = new File("C:\\Users\\pc\\Desktop\\Save.txt");
	String nome;
	int jogadas;
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	private ArrayList<Character> letras = new ArrayList<Character>();
	private ArrayList<ImageIcon> bolas = new ArrayList<ImageIcon>();
	
	
	public Save(String nome, int jogadas,ArrayList<Integer> numeros,ArrayList<Character> letras,ArrayList<ImageIcon> bolas) {
		this.nome = nome;
		this.jogadas = jogadas;
		this.numeros = numeros;
		this.letras = letras;
		this.bolas = bolas;
	}
	
	public void salvar() throws IOException {
		FileWriter w = new FileWriter("C:\\Users\\pc\\Desktop\\Save.txt");
		
		w.write(this.nome + "\n" + this.jogadas + "\n\n");
		
		if(numeros != null && letras == null && bolas == null) {
			for(int i=0;i<numeros.size();i++) {
				w.write(numeros.get(i) + "\n");
			}
		} else if(letras != null && numeros == null && bolas == null) {
			for(int i=0;i<letras.size();i++) {
				w.write(letras.get(i) + "\n");
			}
		} else if(bolas != null && letras == null && numeros == null) {
			for(int i=0;i<bolas.size();i++) {
				w.write(bolas.get(i) + "\n");
			}
		}
		w.close();
	}
}
