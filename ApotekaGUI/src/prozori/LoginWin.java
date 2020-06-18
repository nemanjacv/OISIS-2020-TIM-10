package prozori;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWin implements ActionListener{
	int i =1;
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
	
public	LoginWin()
	{      
		frame.setPreferredSize(new Dimension(winWidth, winHeight));
		
		JPanel dugme = new JPanel();
		dugme.setLayout(new FlowLayout());
		dugme.setBackground( Color.white );
		
		JPanel form = new JPanel();
		form.setBackground( Color.white );
		form.setLayout(new FlowLayout(FlowLayout.CENTER));
		
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
		
		JPasswordField passtxt = new JPasswordField("Lozinka");
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
		JButton b1=new JButton("");
		JButton b2=new JButton("");
		JButton b3=new JButton("");
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		
		

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 frame.setState(Frame.ICONIFIED);
				
			}
		});
		
	    JPanel dugmad = new JPanel();
	    dugmad.setBackground( Color.white );
	    dugmad.setLayout( new FlowLayout(FlowLayout.RIGHT) );
	    dugmad.add(b1);
	    //dugmad.add(b2);
	    dugmad.add(b3);
	    
	    b1.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn1 = new ImageIcon("img/1.png");
		Image butn1 = btnn1.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn1 = new ImageIcon(butn1, btnn1.getDescription());
		
		b1.setIcon(btnn1);
		b1.setBorder(null);
		//b1.setFocusable(false);
		b1.setContentAreaFilled(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		b2.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn2 = new ImageIcon("img/2.png");
		Image butn2 = btnn2.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn2 = new ImageIcon(butn2, btnn2.getDescription());
		
		b2.setIcon(btnn2);
		b2.setBorder(null);
		b2.setFocusable(false);
		b2.setContentAreaFilled(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		b3.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn3 = new ImageIcon("img/2.png");
		Image butn3 = btnn3.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn3 = new ImageIcon(butn3, btnn3.getDescription());
		
		b3.setIcon(btnn3);
		b3.setBorder(null);
		b3.setFocusable(false);
		b3.setContentAreaFilled(false);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    
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
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
	    login.addActionListener(new ActionListener() {
	    	int k=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				File fileL = new File("users/lekar.txt");
				File fileA = new File("users/apotekar.txt");
				String user = imetxt.getText();
				@SuppressWarnings("deprecation")
				String pass = passtxt.getText();
				
				if (user.contains("admin") && pass.contains("admin"))
				{
					//Admin.prozor.setVisible(true);
					//frame.setVisible(false);
					Admin adminProz = new Admin();
					adminProz.setVisible(true);
					frame.setVisible(false);
				}
				
				else
				{
					try {
					    @SuppressWarnings("resource")
						Scanner scannerL = new Scanner(fileL);
					    //now read the file line by line...
					    while (scannerL.hasNextLine()) {
					    	String line = scannerL.nextLine();
					    	String line2 = scannerL.nextLine();
					    	if (user.contains(line) && pass.contains(line2))
							{
					    		//Lekar.prozor.setVisible(true);
					    		//frame.setVisible(false);
					    		Lekar lekProz = new Lekar();
								lekProz.setVisible(true);
								frame.setVisible(false);
							}
					    	
					    }
					} catch(FileNotFoundException r) { 
					    //handle this
					}
					
					try {
					    @SuppressWarnings("resource")
						Scanner scannerA = new Scanner(fileA);
					    //now read the file line by line...
					    while (scannerA.hasNextLine()) {
					    	String line = scannerA.nextLine();
					    	String line2 = scannerA.nextLine();
					    	if (user.contains(line) && pass.contains(line2))
							{
					    		//Apotekar.prozor.setVisible(true);
					    		//frame.setVisible(false);
					    		Apotekar apoteProz = new Apotekar();
								apoteProz.setVisible(true);
								frame.setVisible(false);
							}
					    	
					    }
					} catch(FileNotFoundException r) { 
					    //handle this
					}
					k++;
					if (k==3 && frame.isVisible()==true)
					{ System.exit(0); }
					} 
			}
		});
		
		JPanel logo = new JPanel();
		logo.setLayout( new FlowLayout(FlowLayout.LEFT) );
		logo.setBackground( Color.white );
		ImageIcon logoico = new ImageIcon("img/logo.png");
		Image image3 = logoico.getImage().getScaledInstance( lWidth1, lHeight1 , Image.SCALE_SMOOTH);
		JLabel logoI = new JLabel( new ImageIcon(image3, logoico.getDescription()) );
		logo.add(logoI);
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				if (i % 2 == 0) {
					 frame.setPreferredSize(new Dimension(screenWidth, screenHeight));
					 
					   }
				 else {
					 frame.setPreferredSize(new Dimension(winWidth, winHeight));
					 	 
				 }
				
				
				frame.pack();
				frame.setLocationRelativeTo(null);
			    frame.setVisible(true);
				
			}
		});
		
		
	    frame.add(logo);frame.add(empty2);frame.add(dugmad);frame.add(empty4);frame.add(form);  
	    frame.add(empty6);frame.add(empty7);frame.add(dugme);frame.add(empty9);
	    
	    frame.setLayout(new GridLayout(3,3));
	    frame.getContentPane().setBackground( Color.white );
	    frame.setUndecorated(true);
	    
	    frame.pack();
		frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    
	}
	   
		

	//public static void main(String[] args) 
	//{
	//new LoginWin();
	//}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}