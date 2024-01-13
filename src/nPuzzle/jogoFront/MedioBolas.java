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

public class MedioBolas extends Medio implements KeyListener {
	private static final long serialVersionUID = 1L;

	static private TelaInicial telIni = new TelaInicial();
	
	private JFrame frame = new JFrame("NPUZZLE - MODO: MÉDIO");
	private JPanel tabuleiro = new JPanel();
	private JPanel controles = new JPanel();;
	private JButton e11 = new JButton();
	private JButton e12 = new JButton();
	private JButton e13 = new JButton();
	private JButton e14 = new JButton();
	private JButton e21 = new JButton();
	private JButton e22 = new JButton();
	private JButton e23 = new JButton();
	private JButton e24 = new JButton();
	private JButton e31 = new JButton();
	private JButton e32 = new JButton();
	private JButton e33 = new JButton();
	private JButton e34 = new JButton();
	private JButton e41 = new JButton();
	private JButton e42 = new JButton();
	private JButton e43 = new JButton();
	private JButton e44 = new JButton();
	private JButton cima = new JButton("^");
	private JButton baixo = new JButton("v");
	private JButton esquerda = new JButton("<");
	private JButton direita = new JButton(">");
	private JButton salvar = new JButton("Salvar");
	private JButton ajuda = new JButton("Ajuda");
	private JLabel jogadas = new JLabel();
	private String user = new String();
	private ImageIcon ajudaImg = new ImageIcon(getClass().getResource("/imagens/ajudaB2.jpg"));
	private Ranking rank = new Ranking(this.user);
	
	@ Override
	public void atualizar() {
		e11.setIcon(telIni.getMovB().getPeças().getBolas2().get(0));
		e12.setIcon(telIni.getMovB().getPeças().getBolas2().get(1));
		e13.setIcon(telIni.getMovB().getPeças().getBolas2().get(2));
		e14.setIcon(telIni.getMovB().getPeças().getBolas2().get(3));
		e21.setIcon(telIni.getMovB().getPeças().getBolas2().get(4));
		e22.setIcon(telIni.getMovB().getPeças().getBolas2().get(5));
		e23.setIcon(telIni.getMovB().getPeças().getBolas2().get(6));
		e24.setIcon(telIni.getMovB().getPeças().getBolas2().get(7));
		e31.setIcon(telIni.getMovB().getPeças().getBolas2().get(8));
		e32.setIcon(telIni.getMovB().getPeças().getBolas2().get(9));
		e33.setIcon(telIni.getMovB().getPeças().getBolas2().get(10));
		e34.setIcon(telIni.getMovB().getPeças().getBolas2().get(11));
		e41.setIcon(telIni.getMovB().getPeças().getBolas2().get(12));
		e42.setIcon(telIni.getMovB().getPeças().getBolas2().get(13));
		e43.setIcon(telIni.getMovB().getPeças().getBolas2().get(14));
		e44.setIcon(telIni.getMovB().getPeças().getBolas2().get(15));
		
		if(e44.getIcon() == null) {
			e44.setBackground(Color.GREEN);
		} else {
			e44.setBackground(null);
		}
	}

	public MedioBolas(String user) {
		
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
		tabuleiro.setBounds(0, 0, 304, 304);
		tabuleiro.setBorder(BorderFactory.createLineBorder(null));
		tabuleiro.add(e11);
		tabuleiro.add(e12);
		tabuleiro.add(e13);
		tabuleiro.add(e14);
		tabuleiro.add(e21);
		tabuleiro.add(e22);
		tabuleiro.add(e23);
		tabuleiro.add(e24);
		tabuleiro.add(e31);
		tabuleiro.add(e32);
		tabuleiro.add(e33);
		tabuleiro.add(e34);
		tabuleiro.add(e41);
		tabuleiro.add(e42);
		tabuleiro.add(e43);
		tabuleiro.add(e44);
		
		controles.setLayout(null);
		controles.setBounds(304, 0, 200, 304);
		controles.setBorder(BorderFactory.createLineBorder(null));
		controles.add(cima);
		controles.add(baixo);
		controles.add(esquerda);
		controles.add(direita);
		controles.add(jogadas);
		controles.add(salvar);
		controles.add(ajuda);
		
		e11.setBounds(0, 0, 76, 76);
		e12.setBounds(76, 0, 76, 76);
		e13.setBounds(152, 0, 76, 76);
		e14.setBounds(228, 0, 76, 76);
		e21.setBounds(0, 76, 76, 76);
		e22.setBounds(76, 76, 76, 76);
		e23.setBounds(152, 76, 76, 76);
		e24.setBounds(228, 76, 76, 76);
		e31.setBounds(0, 152, 76, 76);
		e32.setBounds(76, 152, 76, 76);
		e33.setBounds(152, 152, 76, 76);
		e34.setBounds(228, 152, 76, 76);
		e41.setBounds(0, 228, 76, 76);
		e42.setBounds(76, 228, 76, 76);
		e43.setBounds(152, 228, 76, 76);
		e44.setBounds(228, 228, 76, 76);
		
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
		telIni.getMovB().repetiçao2();
		
		if(e.getKeyChar() == 'w') {
			telIni.getMovB().moverPeça2("W");
			this.atualizar();
		} else if(e.getKeyChar() == 's') {
			telIni.getMovB().moverPeça2("S");
			this.atualizar();
		} else if(e.getKeyChar() == 'a') {
			telIni.getMovB().moverPeça2("A");
			this.atualizar();
		} else if(e.getKeyChar() == 'd') {
			telIni.getMovB().moverPeça2("D");
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
			telIni.getMovB().repetiçao2();
		} else if(e.getSource() == salvar) {
			Save save = new Save(this.user,telIni.getMovB().getJogadas(),null,null,telIni.getMovB().getPeças().getBolas2());
			try {
				save.salvar();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(e.getSource() == ajuda) {
			JOptionPane.showMessageDialog(null, ajudaImg, "É ASSIM, Ó", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == cima) {
			telIni.getMovB().moverPeça2("W");
			this.atualizar();
		} else if(e.getSource() == baixo) {
			telIni.getMovB().moverPeça2("S");
			this.atualizar();
		} else if(e.getSource() == esquerda) {
			telIni.getMovB().moverPeça2("A");
			this.atualizar();
		} else if(e.getSource() == direita) {
			telIni.getMovB().moverPeça2("D");
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
