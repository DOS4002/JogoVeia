import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class JogoVelha extends JFrame {

    private JTextField nomeJogo1;
    private JTextField nomeJogo2;
    private JLabel nome1;
    private JLabel nome2;
    private JButton game;
    private JButton newGame;

    public JogoVelha() {
        this.setTitle("Jogo da Velha");
        this.setSize(780, 630);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setResizable(false);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel jogador1 = new JPanel();
        jogador1.setLayout(null);

        nome1 = new JLabel("Nome:");
        nome1.setBounds(10, 160, 90, 50);
        nome1.setFont(new Font("Poppins", Font.PLAIN, 20));
        nome1.setForeground(Color.BLACK);
        jogador1.add(nome1);

        nomeJogo1 = new JTextField();
        nomeJogo1.setBounds(70, 170, 170, 30);
        nomeJogo1.setFont(new Font("Poppins", Font.PLAIN, 20));
        jogador1.add(nomeJogo1);
        tabbedPane.addTab("Jogador 1", null, jogador1, "Digite o nome do primeiro jogador");

        JPanel jogador2 = new JPanel();
        jogador2.setLayout(null);
        jogador2.setBackground(new Color(220, 220, 220));
        tabbedPane.addTab("Jogador 2", null, jogador2, "Digite o nome do segundo jogador");

        nome2 = new JLabel("Nome:");
        nome2.setBounds(10, 160, 90, 50);
        nome2.setFont(new Font("Poppins", Font.PLAIN, 20));
        nome2.setForeground(Color.BLACK);
        jogador2.add(nome2);

        nomeJogo2 = new JTextField();
        nomeJogo2.setBounds(140, 170, 170, 30);
        nomeJogo2.setFont(new Font("Poppins", Font.PLAIN, 20));
        jogador2.add(nomeJogo2);

        JPanel gameRun = new JPanel();
        gameRun.setLayout(null);
        tabbedPane.addTab("Jogar", null, gameRun, "Se prepare para jogar!");

        JLabel imgTab = new JLabel();
        imgTab.setBounds(10, 90, 340, 320);
        ImageIcon boardimg = new ImageIcon("tictac.png");
        Image boardRe = boardimg.getImage().getScaledInstance(imgTab.getWidth(), imgTab.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newBoard = new ImageIcon(boardRe);
        imgTab.setIcon(newBoard);
        gameRun.add(imgTab);

        newGame = new JButton("Novo game");
        newGame.setBackground(new Color(255, 255, 255));
        newGame.setBounds(100, 500, 100, 40);
        newGame.setFocusPainted(false);
        gameRun.add(newGame);

        // Botões do jogo da velha
        JButton[][] buttons = new JButton[3][3];
		int buttonSize = 100; // Aumentar o tamanho dos botões
		int xOffset = 20; // Ajustar o espaço à esquerda
		int yOffset = 90; // Ajustar o espaço acima
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				buttons[row][col] = new JButton();
				buttons[row][col].setBounds(xOffset + col * (buttonSize + 10), yOffset + row * (buttonSize + 10), buttonSize, buttonSize); // Adicionar 10 pixels de espaçamento entre os botões
				buttons[row][col].setBackground(new Color(238, 238, 238));
				buttons[row][col].setBorder(null);
				buttons[row][col].setFocusPainted(false);
				gameRun.add(buttons[row][col]);
			}
		}

        add(tabbedPane);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JogoVelha();
        });
    }
}
