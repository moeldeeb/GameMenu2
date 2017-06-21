import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GameMenu extends JFrame {

	private JFrame frame;
	private int difficulty = 0;
	private int mode = 0;

	/**
	 * Launch the application.
	 */
	public void startGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenu window = new GameMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.PINK);
		frame.setTitle("                     ");
		frame.setBounds(100, 100, 527, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEasy = new JButton("Easy");
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				difficulty = 2;
				}
		});
		btnEasy.setBackground(Color.ORANGE);
		btnEasy.setBounds(31, 67, 117, 25);
		frame.getContentPane().add(btnEasy);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				difficulty = 4;
			}
		});
		btnMedium.setBackground(Color.ORANGE);
		btnMedium.setBounds(198, 67, 117, 25);
		frame.getContentPane().add(btnMedium);
		
		JButton btnHard = new JButton("Hard");
		btnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				difficulty = 6;
			}
		});
		btnHard.setBackground(Color.ORANGE);
		btnHard.setBounds(376, 67, 117, 25);
		frame.getContentPane().add(btnHard);
		
		JButton btnPracticeMode = new JButton("Practice Mode");
		btnPracticeMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode = 1;
				if(difficulty != 0){
				System.exit(0);
				}
			}
		});
		btnPracticeMode.setBackground(Color.GREEN);
		btnPracticeMode.setBounds(198, 193, 155, 25);
		frame.getContentPane().add(btnPracticeMode);
		
		JButton btn1VsCom = new JButton("1 Vs Computer");
		btn1VsCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode = 2;
				System.exit(0);
				if(difficulty != 0){
					System.exit(0);
					}
			}
		});
		btn1VsCom.setBackground(Color.GREEN);
		btn1VsCom.setBounds(12, 193, 174, 25);
		frame.getContentPane().add(btn1VsCom);
		
		JButton btnVs = new JButton("1 Vs 1");
		btnVs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode = 3;
				System.exit(0);
				if(difficulty != 0){
					System.exit(0);
					}
			}
		});
		btnVs.setBackground(Color.GREEN);
		btnVs.setBounds(376, 193, 117, 25);
		frame.getContentPane().add(btnVs);
		
		JLabel lblPleaseSelectYour = new JLabel("Please Select Your Difficulty");
		lblPleaseSelectYour.setBackground(Color.ORANGE);
		lblPleaseSelectYour.setBounds(155, 28, 248, 9);
		frame.getContentPane().add(lblPleaseSelectYour);
		
		JLabel lblPleaseSelectMode = new JLabel("Please Select Mode");
		lblPleaseSelectMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectMode.setBounds(155, 152, 190, 15);
		frame.getContentPane().add(lblPleaseSelectMode);
	}
	
	public int getMode(){
		return mode;
	}
	
	public int getDiff(){
		return difficulty;
	}
}
