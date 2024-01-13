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

public class DificilBolas extends Dificil implements KeyListener {
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
	private ImageIcon ajudaImg = new ImageIcon(getClass().getResource("/imagens/ajudaB3.jpg"));
	private Ranking rank = new Ranking(this.user);
	
	@ Override
	public void atualizar() {
		e11.setIcon(telIni.getMovB().getPeças().getBolas3().get(0));
		e12.setIcon(telIni.getMovB().getPeças().getBolas3().get(1));
		e13.setIcon(telIni.getMovB().getPeças().getBolas3().get(2));
		e14.setIcon(telIni.getMovB().getPeças().getBolas3().get(3));
		e15.setIcon(telIni.getMovB().getPeças().getBolas3().get(4));
		e21.setIcon(telIni.getMovB().getPeças().getBolas3().get(5));
		e22.setIcon(telIni.getMovB().getPeças().getBolas3().get(6));
		e23.setIcon(telIni.getMovB().getPeças().getBolas3().get(7));
		e24.setIcon(telIni.getMovB().getPeças().getBolas3().get(8));
		e25.setIcon(telIni.getMovB().getPeças().getBolas3().get(9));
		e31.setIcon(telIni.getMovB().getPeças().getBolas3().get(10));
		e32.setIcon(telIni.getMovB().getPeças().getBolas3().get(11));
		e33.setIcon(telIni.getMovB().getPeças().getBolas3().get(12));
		e34.setIcon(telIni.getMovB().getPeças().getBolas3().get(13));
		e35.setIcon(telIni.getMovB().getPeças().getBolas3().get(14));
		e41.setIcon(telIni.getMovB().getPeças().getBolas3().get(15));
		e42.setIcon(telIni.getMovB().getPeças().getBolas3().get(16));
		e43.setIcon(telIni.getMovB().getPeças().getBolas3().get(17));
		e44.setIcon(telIni.getMovB().getPeças().getBolas3().get(18));
		e45.setIcon(telIni.getMovB().getPeças().getBolas3().get(19));
		e51.setIcon(telIni.getMovB().getPeças().getBolas3().get(20));
		e52.setIcon(telIni.getMovB().getPeças().getBolas3().get(21));
		e53.setIcon(telIni.getMovB().getPeças().getBolas3().get(22));
		e54.setIcon(telIni.getMovB().getPeças().getBolas3().get(23));
		e55.setIcon(telIni.getMovB().getPeças().getBolas3().get(24));
		
		if(e55.getIcon() == null) {
			e55.setBackground(Color.GREEN);
		} else {
			e55.setBackground(null);
		}
	}

	public DificilBolas(String user) {
		
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
		tabuleiro.setBounds(0, 0, 405, 405);
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
		controles.setBounds(405, 0, 200, 405);
		controles.setBorder(BorderFactory.createLineBorder(null));
		controles.add(cima);
		controles.add(baixo);
		controles.add(esquerda);
		controles.add(direita);
		controles.add(jogadas);
		controles.add(salvar);
		controles.add(ajuda);
		
		e11.setBounds(0, 0, 81, 81);
		e12.setBounds(81, 0, 81, 81);
		e13.setBounds(162, 0, 81, 81);
		e14.setBounds(243, 0, 81, 81);
		e15.setBounds(324, 0, 81, 81);
		e21.setBounds(0, 81, 81, 81);
		e22.setBounds(81, 81, 81, 81);
		e23.setBounds(162, 81, 81, 81);
		e24.setBounds(243, 81, 81, 81);
		e25.setBounds(324, 81, 81, 81);
		e31.setBounds(0, 162, 81, 81);
		e32.setBounds(81, 162, 81, 81);
		e33.setBounds(162, 162, 81, 81);
		e34.setBounds(243, 162, 81, 81);
		e35.setBounds(324, 162, 81, 81);
		e41.setBounds(0, 243, 81, 81);
		e42.setBounds(81, 243, 81, 81);
		e43.setBounds(162, 243, 81, 81);
		e44.setBounds(243, 243, 81, 81);
		e45.setBounds(324, 243, 81, 81);
		e51.setBounds(0, 324, 81, 81);
		e52.setBounds(81, 324, 81, 81);
		e53.setBounds(162, 324, 81, 81);
		e54.setBounds(243, 324, 81, 81);
		e55.setBounds(324, 324, 81, 81);
		
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovB().getJogadas()));
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
		
		telIni.getMovB().aumentarJogadas();
		jogadas.setText("Jogada: " + String.valueOf(telIni.getMovB().getJogadas()));
		telIni.getMovB().bizonhar();
		telIni.getMovB().repetiçao3();
		
		if(e.getKeyChar() == 'w') {
			telIni.getMovB().moverPeça3("W");
			this.atualizar();
		} else if(e.getKeyChar() == 's') {
			telIni.getMovB().moverPeça3("S");
			this.atualizar();
		} else if(e.getKeyChar() == 'a') {
			telIni.getMovB().moverPeça3("A");
			this.atualizar();
		} else if(e.getKeyChar() == 'd') {
			telIni.getMovB().moverPeça3("D");
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
			telIni.getMovB().aumentarJogadas();
			jogadas.setText("Jogada: " + String.valueOf(telIni.getMovB().getJogadas()));
			telIni.getMovB().bizonhar();
			telIni.getMovB().repetiçao3();
		} else if(e.getSource() == salvar) {
			Save save = new Save(this.user,telIni.getMovB().getJogadas(),null,null,telIni.getMovB().getPeças().getBolas3());
			try {
				save.salvar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource() == ajuda) {
			JOptionPane.showMessageDialog(null, ajudaImg, "É ASSIM, Ó", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == cima) {
			telIni.getMovB().moverPeça3("W");
			this.atualizar();
		} else if(e.getSource() == baixo) {
			telIni.getMovB().moverPeça3("S");
			this.atualizar();
		} else if(e.getSource() == esquerda) {
			telIni.getMovB().moverPeça3("A");
			this.atualizar();
		} else if(e.getSource() == direita) {
			telIni.getMovB().moverPeça3("D");
			this.atualizar();
		}
		
		if(telIni.getMovB().getsVitoria() == false) {
			try {
				rank.recordar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
