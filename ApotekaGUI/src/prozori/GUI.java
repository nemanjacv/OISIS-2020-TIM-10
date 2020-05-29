package prozori;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI {
		
	GUI()
	{
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				int screenHeight = screenSize.height;
				int screenWidth = screenSize.width;
				
				//velicina prozora
				int winHeight = (int) (Math.round(screenHeight * 0.50));
				int winWidth = (int) (Math.round(screenWidth * 0.50));
						
				//velicina dugmeta
				int bHeight1 = (int) (Math.round(winHeight * 0.10));
				int bWidth1 = (int) (Math.round(winWidth * 0.25));
				
				//velicina polja
				int fHeight1 = (int) (Math.round(winHeight * 0.08));
				int fWidth1 = (int) (Math.round(winWidth * 0.20));
				
				//velicina logoa
				int lHeight1 = (int) (Math.round(winHeight * 0.32));
				int lWidth1 = (int) (Math.round(winHeight * 0.36));
		
		JFrame frame = new JFrame();
		
		JPanel dugme = new JPanel();
		dugme.setLayout(new FlowLayout());
		dugme.setBackground( Color.white );
		
		JPanel form = new JPanel();
		form.setBackground( Color.white );
		form.setLayout(new FlowLayout());
		
		JLabel prijava= new JLabel("Prijava korisnika");
		prijava.setFont(new Font("Calibri", Font.PLAIN, 25));
		prijava.setForeground(new Color(0x080808));
		
		ImageIcon field1 = new ImageIcon("img/field.png");
		Image image2 = field1.getImage().getScaledInstance( fWidth1, fHeight1 , Image.SCALE_SMOOTH);
		
		JTextField imetxt = new JTextField("Ime");
		 imetxt.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseClicked(MouseEvent e){
	                imetxt.setText("");
	            }
	        });
		imetxt.setOpaque( false );
		imetxt.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JLabel ime = new JLabel( new ImageIcon(image2, field1.getDescription()) );
		ime.setLayout( new BorderLayout() );
		ime.add( imetxt );
		
		JTextField passtxt = new JTextField("Lozinka");
		 passtxt.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseClicked(MouseEvent e){
	                passtxt.setText("");
	            }
	        });
		passtxt.setOpaque( false );
		passtxt.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		JLabel pass = new JLabel( new ImageIcon(image2, field1.getDescription()) );
		pass.setLayout( new BorderLayout() );
		pass.add( passtxt );
		
		JLabel empty1= new JLabel("");
		empty1.setPreferredSize(new Dimension(bWidth1,20));
		
		form.add(prijava);
		form.add(empty1);
		form.add(ime);
		form.add(pass);
		
		JLabel empty2= new JLabel();
		JLabel empty4= new JLabel();
		JLabel empty6= new JLabel();
		JLabel empty7= new JLabel();
		JLabel empty9= new JLabel();  
	    JButton b3=new JButton("3");
	    
	    JButton login = new JButton ("");
	    login.setPreferredSize(new Dimension(bWidth1, bHeight1));
	    ImageIcon btn1 = new ImageIcon("img/btn1.png");
		Image image = btn1.getImage().getScaledInstance( bWidth1, bHeight1 , Image.SCALE_SMOOTH);
		btn1 = new ImageIcon(image, btn1.getDescription());

		dugme.add(login);
		
		login.setIcon(btn1);
		login.setBorder(null);
		login.setFocusable(false);
		login.setContentAreaFilled(false);
	    
		JPanel logo = new JPanel();
		logo.setBackground( Color.white );
		ImageIcon logoico = new ImageIcon("img/logo.png");
		Image image3 = logoico.getImage().getScaledInstance( lWidth1, lHeight1 , Image.SCALE_SMOOTH);
		JLabel logoI = new JLabel( new ImageIcon(image3, logoico.getDescription()) );
		logo.add(logoI);
		
	    frame.add(logo);frame.add(empty2);frame.add(b3);frame.add(empty4);frame.add(form);  
	    frame.add(empty6);frame.add(empty7);frame.add(dugme);frame.add(empty9);
	    
	    frame.setLayout(new GridLayout(3,3));
	    frame.getContentPane().setBackground( Color.white );
	    frame.setUndecorated(true);
	    frame.setPreferredSize(new Dimension(winWidth, winHeight));
	    frame.pack();
		frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
	new GUI();
	}
	
}