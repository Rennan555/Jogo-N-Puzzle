package nPuzzle.jogoFront;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FacilLetras extends Facil implements KeyListener {
	private static final long serialVersionUID = 1L;

	static private TelaInicial telIni = new TelaInicial();
	
	private JFrame frame = new JFrame("NPUZZLE - MODO: FÁCIL");
	private JPanel tabuleiro = new JPanel();
	private JPanel controles = new JPanel();;
	private JButton e11 = new JButton();
	private JButton e12 = new JButton();
	private JButton e13 = new JButton();
	private JButton e21 = new JButton();
	private JButton e22 = new JButton();
	private JButton e23 = new JButton();
	private JButton e31 = new JButton();
	private JButton e32 = new JButton();
	private JButton e33 = new JButton();
	private JButton cima = new JButton("^");
	private JButton baixo = new JButton("v");
	private JButton esquerda = new JButton("<");
	private JButton direita = new JButton(">");
	private JButton salvar = new JButton("Salvar");
	private JButton ajuda = new JButton("Ajuda");
	private JLabel jogadas = new JLabel();
	private String user = new String();
	private ImageIcon ajudaImg = new ImageIcon(getClass().getResource("/imagens/ajudaL1.jpg"));
	private Ranking rank = new Ranking(this.user);
	
	@ Override
	public void atualizar() {
		e11.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(0)));
		e12.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(1)));
		e13.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(2)));
		e21.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(3)));
		e22.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(4)));
		e23.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(5)));
		e31.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(6)));
		e32.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(7)));
		e33.setText(String.valueOf(telIni.getMovL().getPeças().getLetras1().get(8)));
		
		if(e11.getText().equals("A")) {
			e11.setBackground(Color.GREEN);
		} else {
			e11.setBackground(null);
		}
		
		if(e12.getText().equals("B")) {
			e12.setBackground(Color.GREEN);
		} else {
			e12.setBackground(null);
		}
		
		if(e13.getText().equals("C")) {
			e13.setBackground(Color.GREEN);
		} else {
			e13.setBackground(null);
		}
		
		if(e21.getText().equals("D")) {
			e21.setBackground(Color.GREEN);
		} else {
			e21.setBackground(null);
		}
		
		if(e22.getText().equals("E")) {
			e22.setBackground(Color.GREEN);
		} else {
			e22.setBackground(null);
		}
		
		if(e23.getText().equals("F")) {
			e23.setBackground(Color.GREEN);
		} else {
			e23.setBackground(null);
		}
		
		if(e31.getText().equals("G")) {
			e31.setBackground(Color.GREEN);
		} else {
			e31.setBackground(null);
		}
		
		if(e32.getText().equals("H")) {
			e32.setBackground(Color.GREEN);
		} else {
			e32.setBackground(null);
		}
		
		if(e33.getText().equals("I")) {
			e33.setBackground(Color.GREEN);
		} else {
			e33.setBackground(null);
		}
	}

	public FacilLetras(String user) {
		
		this.user = user;
		rank.start();
		
		frame.getContentPane().setLayout(null);
		frame.add(tabuleiro);
		frame.add(controles);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(700,700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setFocusable(true);
		frame.addKeyListener(this);
		frame.setIconImage(icone.getImage());
		this.addKeyListener(this);
		
		this.atualizar();
		
		tabuleiro.setLayout(null);
		tabuleiro.setBounds(0, 0, 300, 300);
		tabuleiro.setBorder(BorderFactory.createLineBorder(null));
		tabuleiro.add(e11);
		tabuleiro.add(e12);
		tabuleiro.add(e13);
		tabuleiro.add(e21);
		tabuleiro.add(e22);
		tabuleiro.add(e23);
		tabuleiro.add(e31);
		tabuleiro.add(e32);
		tabuleiro.add(e33);
		
		controles.setLayout(null);
		controles.setBounds(300, 0, 200, 300);
		controles.setBorder(BorderFactory.createLineBorder(null));
		controles.add(cima);
		controles.add(baixo);
		controles.add(esquerda);
		controles.add(direita);
		controles.add(jogadas);
		controles.add(salvar);
		controles.add(ajuda);
		
		e11.setBounds(0, 0, 100, 100);
		e12.setBounds(100, 0, 100, 100);
		e13.setBounds(200, 0, 100, 100);
		e21.setBounds(0, 100, 100, 100);
		e22.setBounds(100, 100, 100, 100);
		e23.setBounds(200, 100, 100, 100);
		e31.setBounds(0, 200, 100, 100);
		e32.setBounds(100, 200, 100, 100);
		e33.setBounds(200, 200, 100, 100);
		
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovL().getJogadas()));
		jogadas.setBounds(0, 195, 150, 50);
			
		cima.setBounds(0, 0, 50, 50);
		cima.addActionListener(this);
		baixo.setBounds(0, 50, 50, 50);
		baixo.addActionListener(this);
		esquerda.setBounds(0, 100, 50, 50);
		esquerda.addActionListener(this);
		direita.setBounds(0, 150, 50, 50);
		direita.addActionListener(this);
		salvar.setBounds(0, 235, 120, 30);
		salvar.addActionListener(this);
		ajuda.setBounds(50, 0, 80, 30);
		ajuda.addActionListener(this);
		
		ajuda.setFocusable(false);
		salvar.setFocusable(false);
		cima.setFocusable(false);
		baixo.setFocusable(false);
		esquerda.setFocusable(false);
		direita.setFocusable(false);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		telIni.getMovL().aumentarJogadas();
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovL().getJogadas()));
		telIni.getMovL().bizonhar();
		telIni.getMovL().repetiçao1();
		
		if(e.getKeyChar() == 'w') {
			telIni.getMovL().moverPeça1("W");
			this.atualizar();
		} else if(e.getKeyChar() == 's') {
			telIni.getMovL().moverPeça1("S");
			this.atualizar();
		} else if(e.getKeyChar() == 'a') {
			telIni.getMovL().moverPeça1("A");
			this.atualizar();
		} else if(e.getKeyChar() == 'd') {
			telIni.getMovL().moverPeça1("D");
			this.atualizar();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	@ Override
	public void actionPerformed(ActionEvent e) { // botar movimento aki
		
		if(e.getSource() != salvar && e.getSource() != ajuda) {
			telIni.getMovL().aumentarJogadas();
			jogadas.setText("Jogada: " + String.valueOf(telIni.getMovL().getJogadas()));
			telIni.getMovL().bizonhar();
			telIni.getMovL().repetiçao1();
		} else if(e.getSource() == salvar) {
			Save save = new Save(this.user,telIni.getMovL().getJogadas(),null,telIni.getMovL().getPeças().getLetras1(),null);
			try {
				save.salvar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource() == ajuda) {
			JOptionPane.showMessageDialog(null, ajudaImg, "É ASSIM, Ó", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == cima) {
			telIni.getMovL().moverPeça1("W");
			this.atualizar();
		} else if(e.getSource() == baixo) {
			telIni.getMovL().moverPeça1("S");
			this.atualizar();
		} else if(e.getSource() == esquerda) {
			telIni.getMovL().moverPeça1("A");
			this.atualizar();
		} else if(e.getSource() == direita) {
			telIni.getMovL().moverPeça1("D");
			this.atualizar();
		}
		
		if(telIni.getMovL().getsVitoria() == false) {
			try {
				rank.recordar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
