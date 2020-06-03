package prozori;

import prikaz.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kontroleri.promenljive;

public class Admin {

	JFrame prozor = new JFrame();
	promenljive source = new promenljive();
	JLabel korisnik = new JLabel("Admin");
	
	JButton prazan1 = new JButton("123");
	JButton prazan2 = new JButton("2");
	JButton prazan3 = new JButton("3");
	JButton prazan4 = new JButton("4");
	JButton prazan5 = new JButton("5");
	JButton prazan6 = new JButton("6");
	JButton prazan7 = new JButton("7");
	JButton prazan8 = new JButton("8");
	JButton prazan9 = new JButton("9");
	JButton prazan10 = new JButton("10");
	JButton prazan11 = new JButton("11");
	
	JPanel logo = new Logo();
	JPanel ulist = new UserList();
	JPanel lek = new lekovi();
	JPanel izv = new Izvestaj();
	JButton praznoP1 = new JButton("prazno");
	JButton praznoP2 = new JButton("buduce dugme");
	JPanel sam = new JPanel();
	
	ImageIcon slika1 = new ImageIcon("img/bckgrnd.png");
	Image pozadina = slika1.getImage().getScaledInstance( source.winWidth, source.winHeight, Image.SCALE_SMOOTH);
	JLabel bckgrnd = new JLabel( new ImageIcon(pozadina, slika1.getDescription()) );
	
	public Admin()
	{
		prozor.setUndecorated(true);
		prozor.setPreferredSize(new Dimension(source.winWidth, source.winHeight));
		bckgrnd.setLayout(new GridBagLayout());
		prozor.setContentPane(bckgrnd);
		
		korisnik.setFont(new Font("Calibri", Font.PLAIN, 40));
		korisnik.setForeground( Color.white);
		
		prazan1.setContentAreaFilled(false);
		prazan2.setContentAreaFilled(false);
		
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.fill= GridBagConstraints.BOTH;
		//gbc.weightx = 1.0;
		//gbc.weighty = 0.1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		logo.setLayout(new GridLayout(1,1));
		logo.setBackground(Color.white);
		logo.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(logo, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		ulist.setLayout(new GridLayout(1,1));
		ulist.setBackground(Color.white);
		ulist.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(ulist, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		lek.setLayout(new GridLayout(1,1));
		lek.setBackground(Color.white);
		lek.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(lek, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		izv.setLayout(new GridLayout(1,1));
		izv.setBackground(Color.white);
		izv.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(izv, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		praznoP1.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(praznoP1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		praznoP2.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(praznoP2, gbc);
		

		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		bckgrnd.add(prazan1, gbc);
		//prazan1.setPreferredSize(new Dimension(500, source.blHeight));
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		//gbc.gridwidth = 1;
		bckgrnd.add(prazan2, gbc);
		prazan2.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 3;
		gbc.gridy = 5;
		sam.setLayout(new GridLayout(1,1));
		sam.setBackground(Color.white);
		sam.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		bckgrnd.add(sam, gbc);
		prazan3.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 4;
		gbc.gridy = 5;
		bckgrnd.add(prazan4, gbc);
		prazan4.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 5;
		gbc.gridy = 5;
		bckgrnd.add(prazan5, gbc);
		prazan5.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 6;
		gbc.gridy = 5;
		bckgrnd.add(prazan6, gbc);
		prazan6.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 7;
		gbc.gridy = 5;
		bckgrnd.add(prazan7, gbc);
		prazan7.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 8;
		gbc.gridy = 5;
		bckgrnd.add(prazan8, gbc);
		prazan8.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 9;
		gbc.gridy = 5;
		bckgrnd.add(prazan9, gbc);
		prazan9.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 10;
		gbc.gridy = 5;
		bckgrnd.add(prazan10, gbc);
		prazan10.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		prozor.pack();
		prozor.setLocationRelativeTo(null);
	    prozor.setVisible(true);
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

