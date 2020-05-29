package prozori;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI() {
		
		JFrame frame = new JFrame();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		//velicina prozora
		int winHeight = (int) (Math.round(screenHeight * 0.50));
		int winWidth = (int) (Math.round(screenWidth * 0.50));
		
		frame.setLayout(new GridLayout(3, 3));
		frame.setUndecorated(true);
		frame.getContentPane().setBackground( Color.white );
		frame.setPreferredSize(new Dimension(winWidth, winHeight));
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setBackground(Color.black);
		panel.setPreferredSize(new Dimension(100, 100));
		frame.setVisible(true);
		/*
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground( Color.white );
		
		JPanel panel = new JPanel();
		JButton b = new JButton ("Ulogujte se");
		
		frame.add(panel, BorderLayout.CENTER);

		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		panel.setLayout(new GridLayout(0, 1));
		panel.setBackground(Color.black);
		panel.setBounds(20, 20, 200, 200);
		
		frame.add(b);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		//velicina prozora
		int winHeight = (int) (Math.round(screenHeight * 0.50));
		int winWidth = (int) (Math.round(screenWidth * 0.50));
		
		//centrianje dugmeta
		int bHeight = (int) (Math.round(winHeight * 0.7));
		int bWidth = (int) (Math.round(winWidth * 0.39));
		
		//velicina dugmeta
		int bHeight1 = (int) (Math.round(winHeight * 0.10));
		int bWidth1 = (int) (Math.round(winWidth * 0.25));
		
		ImageIcon btn1 = new ImageIcon("img/btn1.png");
		Image image = btn1.getImage().getScaledInstance( bWidth1, bHeight1 , Image.SCALE_SMOOTH);
		btn1 = new ImageIcon(image, btn1.getDescription());

		b.setIcon(btn1);
		b.setBorder(null);

		b.setFocusable(false);
		b.setContentAreaFilled(false);
		b.setBounds(bWidth,bHeight, bWidth1, bHeight1);
		
		frame.setUndecorated(true);
	    frame.setPreferredSize(new Dimension(winWidth, winHeight));
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our Gui");

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		*/
	}
	
	public static void main(String[] args) {
	new GUI();
	}
	
}