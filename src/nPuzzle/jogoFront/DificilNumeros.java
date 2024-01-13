package nPuzzle.jogoFront;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DificilNumeros extends Dificil implements KeyListener {
	private static final long serialVersionUID = 1L;

	static private TelaInicial telIni = new TelaInicial();
	
	private JFrame frame = new JFrame("NPUZZLE - MODO: DIFÍCIL");
	private JPanel tabuleiro = new JPanel();
	private JPanel controles = new JPanel();;
	private JButton e11 = new JButton();
	private JButton e12 = new JButton();
	private JButton e13 = new JButton();
	private JButton e14 = new JButton();
	private JButton e15 = new JButton();
	private JButton e21 = new JButton();
	private JButton e22 = new JButton();
	private JButton e23 = new JButton();
	private JButton e24 = new JButton();
	private JButton e25 = new JButton();
	private JButton e31 = new JButton();
	private JButton e32 = new JButton();
	private JButton e33 = new JButton();
	private JButton e34 = new JButton();
	private JButton e35 = new JButton();
	private JButton e41 = new JButton();
	private JButton e42 = new JButton();
	private JButton e43 = new JButton();
	private JButton e44 = new JButton();
	private JButton e45 = new JButton();
	private JButton e51 = new JButton();
	private JButton e52 = new JButton();
	private JButton e53 = new JButton();
	private JButton e54 = new JButton();
	private JButton e55 = new JButton();
	private JButton cima = new JButton("^");
	private JButton baixo = new JButton("v");
	private JButton esquerda = new JButton("<");
	private JButton direita = new JButton(">");
	private JButton salvar = new JButton("Salvar");
	private JButton ajuda = new JButton("Ajuda");
	private JLabel jogadas = new JLabel();
	private String user = new String();
	private ImageIcon ajudaImg = new ImageIcon(getClass().getResource("/imagens/ajudaN3.jpg"));
	private Ranking rank = new Ranking(this.user);
	
	@ Override
	public void atualizar() {
		e11.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(0)));
		e12.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(1)));
		e13.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(2)));
		e14.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(3)));
		e15.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(4)));
		e21.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(5)));
		e22.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(6)));
		e23.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(7)));
		e24.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(8)));
		e25.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(9)));
		e31.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(10)));
		e32.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(11)));
		e33.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(12)));
		e34.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(13)));
		e35.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(14)));
		e41.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(15)));
		e42.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(16)));
		e43.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(17)));
		e44.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(18)));
		e45.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(19)));
		e51.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(20)));
		e52.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(21)));
		e53.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(22)));
		e54.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(23)));
		e55.setText(String.valueOf(telIni.getMovN().getPeças().getNumeros3().get(24)));
		
		if(e11.getText().equals("0")) {
			e11.setBackground(Color.GREEN);
		} else {
			e11.setBackground(null);
		}
		
		if(e12.getText().equals("1")) {
			e12.setBackground(Color.GREEN);
		} else {
			e12.setBackground(null);
		}
		
		if(e13.getText().equals("2")) {
			e13.setBackground(Color.GREEN);
		} else {
			e13.setBackground(null);
		}
		
		if(e14.getText().equals("3")) {
			e14.setBackground(Color.GREEN);
		} else {
			e14.setBackground(null);
		}
		
		if(e15.getText().equals("4")) {
			e15.setBackground(Color.GREEN);
		} else {
			e15.setBackground(null);
		}
		
		if(e21.getText().equals("5")) {
			e21.setBackground(Color.GREEN);
		} else {
			e21.setBackground(null);
		}
		
		if(e22.getText().equals("6")) {
			e22.setBackground(Color.GREEN);
		} else {
			e22.setBackground(null);
		}
		
		if(e23.getText().equals("7")) {
			e23.setBackground(Color.GREEN);
		} else {
			e23.setBackground(null);
		}
		
		if(e24.getText().equals("8")) {
			e24.setBackground(Color.GREEN);
		} else {
			e24.setBackground(null);
		}
		
		if(e25.getText().equals("9")) {
			e25.setBackground(Color.GREEN);
		} else {
			e25.setBackground(null);
		}
		
		if(e31.getText().equals("10")) {
			e31.setBackground(Color.GREEN);
		} else {
			e31.setBackground(null);
		}
		
		if(e32.getText().equals("11")) {
			e32.setBackground(Color.GREEN);
		} else {
			e32.setBackground(null);
		}
		
		if(e33.getText().equals("12")) {
			e33.setBackground(Color.GREEN);
		} else {
			e33.setBackground(null);
		}
		
		if(e34.getText().equals("13")) {
			e34.setBackground(Color.GREEN);
		} else {
			e34.setBackground(null);
		}
		
		if(e35.getText().equals("14")) {
			e35.setBackground(Color.GREEN);
		} else {
			e35.setBackground(null);
		}
		
		if(e41.getText().equals("15")) {
			e41.setBackground(Color.GREEN);
		} else {
			e41.setBackground(null);
		}
		
		if(e42.getText().equals("16")) {
			e42.setBackground(Color.GREEN);
		} else {
			e42.setBackground(null);
		}
		
		if(e43.getText().equals("17")) {
			e42.setBackground(Color.GREEN);
		} else {
			e42.setBackground(null);
		}
		
		if(e44.getText().equals("18")) {
			e43.setBackground(Color.GREEN);
		} else {
			e43.setBackground(null);
		}
		
		if(e45.getText().equals("19")) {
			e45.setBackground(Color.GREEN);
		} else {
			e45.setBackground(null);
		}
		
		if(e51.getText().equals("20")) {
			e51.setBackground(Color.GREEN);
		} else {
			e51.setBackground(null);
		}
		
		if(e52.getText().equals("21")) {
			e52.setBackground(Color.GREEN);
		} else {
			e52.setBackground(null);
		}
		
		if(e53.getText().equals("22")) {
			e53.setBackground(Color.GREEN);
		} else {
			e53.setBackground(null);
		}
		
		if(e54.getText().equals("23")) {
			e54.setBackground(Color.GREEN);
		} else {
			e54.setBackground(null);
		}
		
		if(e55.getText().equals("24")) {
			e55.setBackground(Color.GREEN);
		} else {
			e55.setBackground(null);
		}
	}

	public DificilNumeros(String user) {
		
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
		tabuleiro.setBounds(0, 0, 500, 500);
		tabuleiro.setBorder(BorderFactory.createLineBorder(null));
		tabuleiro.add(e11);
		tabuleiro.add(e12);
		tabuleiro.add(e13);
		tabuleiro.add(e14);
		tabuleiro.add(e15);
		tabuleiro.add(e21);
		tabuleiro.add(e22);
		tabuleiro.add(e23);
		tabuleiro.add(e24);
		tabuleiro.add(e25);
		tabuleiro.add(e31);
		tabuleiro.add(e32);
		tabuleiro.add(e33);
		tabuleiro.add(e34);
		tabuleiro.add(e35);
		tabuleiro.add(e41);
		tabuleiro.add(e42);
		tabuleiro.add(e43);
		tabuleiro.add(e44);
		tabuleiro.add(e45);
		tabuleiro.add(e51);
		tabuleiro.add(e52);
		tabuleiro.add(e53);
		tabuleiro.add(e54);
		tabuleiro.add(e55);
		
		controles.setLayout(null);
		controles.setBounds(500, 0, 200, 500);
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
		e14.setBounds(300, 0, 100, 100);
		e15.setBounds(400, 0, 100, 100);
		e21.setBounds(0, 100, 100, 100);
		e22.setBounds(100, 100, 100, 100);
		e23.setBounds(200, 100, 100, 100);
		e24.setBounds(300, 100, 100, 100);
		e25.setBounds(400, 100, 100, 100);
		e31.setBounds(0, 200, 100, 100);
		e32.setBounds(100, 200, 100, 100);
		e33.setBounds(200, 200, 100, 100);
		e34.setBounds(300, 200, 100, 100);
		e35.setBounds(400, 200, 100, 100);
		e41.setBounds(0, 300, 100, 100);
		e42.setBounds(100, 300, 100, 100);
		e43.setBounds(200, 300, 100, 100);
		e44.setBounds(300, 300, 100, 100);
		e45.setBounds(400, 300, 100, 100);
		e51.setBounds(0, 400, 100, 100);
		e52.setBounds(100, 400, 100, 100);
		e53.setBounds(200, 400, 100, 100);
		e54.setBounds(300, 400, 100, 100);
		e55.setBounds(400, 400, 100, 100);
		
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovN().getJogadas()));
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
		
		telIni.getMovN().aumentarJogadas();
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovN().getJogadas()));
		telIni.getMovN().bizonhar();
		telIni.getMovN().repetiçao3();
		
		if(e.getKeyChar() == 'w') {
			telIni.getMovN().moverPeça3("W");
			this.atualizar();
		} else if(e.getKeyChar() == 's') {
			telIni.getMovN().moverPeça3("S");
			this.atualizar();
		} else if(e.getKeyChar() == 'a') {
			telIni.getMovN().moverPeça3("A");
			this.atualizar();
		} else if(e.getKeyChar() == 'd') {
			telIni.getMovN().moverPeça3("D");
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
			telIni.getMovN().aumentarJogadas();
			jogadas.setText("Jogada: " + String.valueOf(telIni.getMovN().getJogadas()));
			telIni.getMovN().bizonhar();
			telIni.getMovN().repetiçao1();
		} else if(e.getSource() == salvar) {
			Save save = new Save(this.user,telIni.getMovN().getJogadas(),telIni.getMovN().getPeças().getNumeros3(),null,null);
			try {
				save.salvar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource() == ajuda) {
			JOptionPane.showMessageDialog(null, ajudaImg, "É ASSIM, Ó", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == cima) {
			telIni.getMovN().moverPeça3("W");
			this.atualizar();
		} else if(e.getSource() == baixo) {
			telIni.getMovN().moverPeça3("S");
			this.atualizar();
		} else if(e.getSource() == esquerda) {
			telIni.getMovN().moverPeça3("A");
			this.atualizar();
		} else if(e.getSource() == direita) {
			telIni.getMovN().moverPeça3("D");
			this.atualizar();
		}
		
		if(telIni.getMovN().getsVitoria() == false) {
			try {
				rank.recordar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
