import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
public class JogoVelha extends JDialog {

	private JTextField nomeJogo1;
	private JTextField nomeJogo2;
	private JLabel nome1;
	private JLabel nome2;
	private JButton game;
	private JButton newGame;
	

	
	public JogoVelha() {
		
		this.setTitle("Jogo da velha");
		this.setSize(780, 630);
		this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setResizable(false);
		
	
	     
		
		JTabbedPane tabbedpane = new JTabbedPane();
	    tabbedpane.setBounds(0,0,500,470); 
	    
	    JPanel jogador1 = new JPanel();
	    jogador1.setLayout(null);
	    
	    
		nome1 = new JLabel("Nome:");
		nome1.setBounds(10,160,90,50);
		nome1.setFont(new Font("Poppins",Font.PLAIN,20));
		nome1.setForeground(Color.BLACK);
		jogador1.add(nome1);

		
		nomeJogo1 = new JTextField();
		nomeJogo1.setBounds(70,170,170,30);
		nomeJogo1.setFont(new Font("Poppins",Font.PLAIN,20));
		jogador1.add(nomeJogo1);
		tabbedpane.addTab("Jogador 1",null,jogador1,"Digite o nome do primeiro jogador");
		
		
		
		JPanel Jogador2 = new JPanel();
		Jogador2.setLayout(null);
		Jogador2.setBackground(new Color(220, 220, 220));
		tabbedpane.addTab("Jogador 2",null,Jogador2,"Digite o nome do segundo jogador");

		nome2 = new JLabel("Nome:");
		nome2.setBounds(10,160,90,50);
		nome2.setFont(new Font("Poppins",Font.PLAIN,20));
		nome2.setForeground(Color.BLACK);
		Jogador2.add(nome2);

		
		nomeJogo2 = new JTextField();
		nomeJogo2.setBounds(140,170,170,30);
		nomeJogo2.setFont(new Font("Poppins",Font.PLAIN,20));
		Jogador2.add(nomeJogo2);
		
		
		JPanel gameRun = new JPanel();
		gameRun.setLayout(null);
		tabbedpane.addTab("Jogar",null,gameRun,"Se prepare para jogar!");
		

		JLabel imgTab = new JLabel();
		imgTab.setBounds(10, 80, 340, 320);
		ImageIcon boardimg = new ImageIcon("src/gameImg/tabuleiro.png");
		Image boardRe = boardimg.getImage().getScaledInstance(imgTab.getWidth(), imgTab.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newBoard = new ImageIcon(boardRe);
		imgTab.setIcon(newBoard);
		gameRun.add(imgTab);
	
		
		 newGame = new JButton("Novo game");
		 newGame.setBackground(new Color(255, 255, 255));
		 newGame.setBounds(100, 500, 100, 40);
		 newGame.setFocusPainted(false);
		 gameRun.add(newGame);
		 
		
		 //botão dp canto superior da direita
		 JButton btX = new JButton();
		 btX.setBounds(260, 110, 80, 80);
			ImageIcon x = new ImageIcon("src/gameImg/x.png");
			Image redimencionarX = x.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			ImageIcon newX = new ImageIcon(redimencionarX);
			btX.setBackground(new Color(238, 238, 238));
			btX.setBorder(null);
			btX.setFocusPainted(false);
			gameRun.add(btX);
		
			//botão no meio(canto superior)
			JButton btC = new JButton();
			btC.setBounds(120, 110, 118, 80);
//			ImageIcon c = new ImageIcon("src/gameImg/x.png"); // Carrega a imagem usando o nome 'c'
//			Image redimensionarC = c.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Usa 'c' para redimensionar a imagem
//			ImageIcon newC = new ImageIcon(redimensionarC); // Cria um novo ImageIcon com a imagem redimensionada
//			btC.setIcon(newC); // Define o ícone do botão usando o novo ImageIcon
			btC.setBackground(new Color(238, 238, 238));
			btC.setBorder(null);
			btC.setFocusPainted(false);
			gameRun.add(btC);
			
			
			//botão do centro	
			JButton bt1 = new JButton();
			bt1.setBounds(18, 110, 80, 80);
			bt1.setBackground(new Color(238, 238, 238));
			bt1.setBorder(null);
			bt1.setFocusPainted(false);
			gameRun.add(bt1);
			
			//botão do canto superior da esquerda
			JButton bt2 = new JButton();
			 bt2.setBounds(120, 211, 118, 80);
			 bt2.setBackground(new Color(238, 238, 238));
			 bt2.setBorder(null);
			 bt2.setFocusPainted(false);
			 gameRun.add(bt2);
			 
			 //botão no centro(esquerda)
			 JButton bt3 = new JButton();
			 bt3.setBounds(18, 211, 80, 80);
			 bt3.setBackground(new Color(238, 238, 238));
			 bt3.setBorder(null);
			 bt3.setFocusPainted(false);
			 gameRun.add(bt3);

			 //botão no canto inferior da esquerda
			 JButton bt4 = new JButton();
			 bt4.setBounds(18, 310, 80, 80);
			 bt4.setBackground(new Color(238, 238, 238));
			 bt4.setBorder(null);
			 bt4.setFocusPainted(false);
			 gameRun.add(bt4);
			 
			 //botão no centro direito
			 JButton bt5 = new JButton();
			 bt2.setBounds(260, 211, 80, 80);
			 bt2.setBackground(new Color(238, 238, 238));
			 bt2.setBorder(null);
			 bt2.setFocusPainted(false);
			 gameRun.add(bt2);
			 
			 //botão no centro
			 JButton bt6 = new JButton();
			 bt6.setBounds(120, 213, 118, 80);
			 bt6.setBackground(new Color(238, 238, 238));
			 bt6.setBorder(null);
			 bt6.setFocusPainted(false);
			 gameRun.add(bt6);
			 
			 //botão do meio inferior
			 JButton bt7 = new JButton();
			 bt7.setBounds(120, 315, 118, 80);
			 bt7.setBackground(new Color(238, 238, 238));
			 bt7.setBorder(null);
			 bt7.setFocusPainted(false);
			 gameRun.add(bt7);
			 
			 //botão inferior na esquerda
			 JButton bt8 = new JButton();
			 bt8.setBounds(260, 315, 80, 80);
			 bt8.setBackground(new Color(238, 238, 238));
			 bt8.setBorder(null);
			 bt8.setFocusPainted(false);
			 gameRun.add(bt8);
			 
		add(tabbedpane);

		this.setVisible(true);
		this.setLayout(null);
	}
}