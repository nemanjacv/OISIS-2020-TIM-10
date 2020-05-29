package prozori;

import java.awt.*;  
import javax.swing.*;  

public class MyGridLayout{  
JFrame f;  
MyGridLayout(){  
    f=new JFrame();  
      
    JLabel lbl= new JLabel();
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  
          
    f.add(lbl);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9);  
  
    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(400,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyGridLayout();  
}}  

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
		
	}
		*/