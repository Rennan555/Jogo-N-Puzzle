package nPuzzle.jogoFront;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ranking implements ActionListener {
	
	Path rankP = Paths.get("C:\\Users\\pc\\Desktop\\Rank.txt");
	File rankF = new File("C:\\Users\\pc\\Desktop\\Rank.txt");
	String nome;
	int tempo = 0;
	
	public Ranking(String nome) {
		this.nome = nome;
	}
	
	public void start() {
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tempo++;
			}
			
		});
		
		timer.start();
	}
	
	public void recordar() throws IOException {
		
		FileWriter w = new FileWriter("C:\\Users\\pc\\Desktop\\Rank.txt");
		List<String> temp = Files.readAllLines(rankP);
		
		w.write(temp + "\n" + this.nome + " - Tempo em segundos:" + this.tempo);
		w.close();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}