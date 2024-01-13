package nPuzzle.jogoFront;

import nPuzzle.jogoBack.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TelaInicial extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	public ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/Icone.jpg"));
	
	private static MovimentoNumeros movN = new MovimentoNumeros(0,0,0);
	private static MovimentoLetras movL = new MovimentoLetras(0,0,0);
	private static MovimentoBolas movB = new MovimentoBolas(0,0,0);
	
	public MovimentoNumeros getMovN() {
		return TelaInicial.movN;
	}
	
	public MovimentoLetras getMovL() {
		return TelaInicial.movL;
	}
	
	public MovimentoBolas getMovB() {
		return TelaInicial.movB;
	}
	
	public String getNome() {
		return this.nome.getText();
	}
	
	private JFrame frame = new JFrame("---Menu Inicial---");
	private JPanel panelTitulo = new JPanel();
	private JLabel labelTitulo = new JLabel();
	private JPanel panelOpçoes = new JPanel();
	private JButton iniciar = new JButton("Iniciar!");
	private JTextField nome = new JTextField("Nome");
	private JCheckBox bizonho = new JCheckBox("Bizonhocrazy");
	private JRadioButton tamanho1 = new JRadioButton("Fácil");
	private JRadioButton tamanho2 = new JRadioButton("Médio");
	private JRadioButton tamanho3 = new JRadioButton("Difícil");
	private JRadioButton tipo1 = new JRadioButton("Números");
	private JRadioButton tipo2 = new JRadioButton("Letras");
	private JRadioButton tipo3 = new JRadioButton("Bolas");
	private ImageIcon image = new ImageIcon(getClass().getResource("/imagens/TelaInicial.jpg"));
	
	public TelaInicial() {
		
		this.addKeyListener(this);
		
		frame.getContentPane().setLayout(null);
		frame.add(panelTitulo);
		frame.add(panelOpçoes);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600,650));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setFocusable(true);
		frame.addKeyListener(this);
		frame.setIconImage(icone.getImage());
		
		panelTitulo.setLayout(null);
		panelTitulo.setBorder(BorderFactory.createLineBorder(null));
		panelTitulo.setBounds(0, 0, 600, 500);
		panelTitulo.add(labelTitulo);
		
		panelOpçoes.setLayout(null);
		panelOpçoes.setBorder(BorderFactory.createLineBorder(null));
		panelOpçoes.setBounds(0, 500, 600, 150);
		panelOpçoes.add(iniciar);
		panelOpçoes.add(nome);
		panelOpçoes.add(bizonho);
		panelOpçoes.add(tamanho1);
		panelOpçoes.add(tamanho2);
		panelOpçoes.add(tamanho3);
		panelOpçoes.add(tipo1);
		panelOpçoes.add(tipo2);
		panelOpçoes.add(tipo3);
		
		labelTitulo.setIcon(image);
		labelTitulo.setBounds(0, 0, 600, 500);
		
		iniciar.setBounds(50, 10, 100, 20);
		iniciar.addActionListener(this);
		nome.setBounds(200,10,100,20);
		
		bizonho.setBounds(50, 30, 150, 20);
		tamanho1.setBounds(50, 50, 100, 20);
		tamanho2.setBounds(170, 50, 100, 20);
		tamanho3.setBounds(300, 50, 100, 20);
		tipo1.setBounds(50, 70, 100, 20);
		tipo2.setBounds(170, 70, 100, 20);
		tipo3.setBounds(300, 70, 100, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.dispose();
		frame.setFocusable(false);
		
		try {
			movN.setTamanho(3);
		} catch (SetterException e2) {
			e2.printStackTrace();
		}
		try {
			movL.setTamanho(3);
		} catch (SetterException e2) {
			e2.printStackTrace();
		}
		try {
			movB.setTamanho(3);
		} catch (SetterException e2) {
			e2.printStackTrace();
		}
		
		if(bizonho.isSelected()) {
			try {
				movN.setModo(2);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
			try {
				movL.setModo(2);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
			try {
				movB.setModo(2);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
		} else {
			try {
				movN.setModo(1);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
			try {
				movL.setModo(1);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
			try {
				movB.setModo(1);
			} catch (SetterException e1) {
				e1.printStackTrace();
			}
		}
		
		if(tipo1.isSelected()) {
			if(tamanho1.isSelected()) {
				try {
					movN.setTamanho(3);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilNumeros(nome.getText());
			} else if(tamanho2.isSelected()) {
				try {
					movN.setTamanho(4);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new MedioNumeros(nome.getText());
			} else if(tamanho3.isSelected()) {
				try {
					movN.setTamanho(5);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new DificilNumeros(nome.getText());
			} else {
				try {
					movN.setTamanho(3);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilNumeros(nome.getText());
			}
		} else if(tipo2.isSelected()) {
			if(tamanho1.isSelected()) {
				try {
					movL.setTamanho(3);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilLetras(nome.getText());
			} else if(tamanho2.isSelected()) {
				try {
					movL.setTamanho(4);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new MedioLetras(nome.getText());
			} else if(tamanho3.isSelected()) {
				try {
					movL.setTamanho(5);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new DificilLetras(nome.getText());
			} else {
				try {
					movL.setTamanho(3);
					JOptionPane.showMessageDialog(null, "Tamanho definido para: " + movL.getTamanho(), "AVISO AVISO", JOptionPane.WARNING_MESSAGE);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilLetras(nome.getText());
			}
		} else if(tipo3.isSelected()) {
			if(tamanho1.isSelected()) {
				try {
					movB.setTamanho(3);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilBolas(nome.getText());
			} else if(tamanho2.isSelected()) {
				try {
					movB.setTamanho(4);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new MedioBolas(nome.getText());
			} else if(tamanho3.isSelected()) {
				try {
					movB.setTamanho(5);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new DificilBolas(nome.getText());
			} else {
				try {
					movB.setTamanho(3);
					JOptionPane.showMessageDialog(null, "Tamanho definido para: " + movB.getTamanho(), "AVISO AVISO", JOptionPane.WARNING_MESSAGE);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilBolas(nome.getText());
			}
		} else {	
			if(tamanho2.isSelected()) {
				try {
					movN.setTamanho(4);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new MedioNumeros(nome.getText());
			} else if(tamanho3.isSelected()) {
				try {
					movN.setTamanho(5);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new DificilNumeros(nome.getText());
			} else {
				try {
					movN.setTamanho(3);
					JOptionPane.showMessageDialog(null, "Tamanho definido para: " + movN.getTamanho(), "AVISO AVISO", JOptionPane.WARNING_MESSAGE);
				} catch (SetterException e1) {
					e1.printStackTrace();
				}
				
				new FacilNumeros(nome.getText());
			}
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				new TelaInicial();
				
			}
		});
	}
}