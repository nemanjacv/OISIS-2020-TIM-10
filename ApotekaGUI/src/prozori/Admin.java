package prozori;

import prikaz.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

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
	
	JButton prazan1 = new JButton("1");
	JButton prazan2 = new JButton("2");
	JButton prazan22 = new JButton("2");
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
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		bckgrnd.add(prazan1, gbc);
		prazan1.setPreferredSize(new Dimension(source.blnWidth, source.blHeight));
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		bckgrnd.add(prazan22, gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 2;
		bckgrnd.add(prazan3, gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 3;
		bckgrnd.add(prazan4, gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 4;
		bckgrnd.add(prazan5, gbc);
		
		gbc.gridx = 6;
		gbc.gridy = 5;
		bckgrnd.add(prazan6, gbc);
		
		gbc.gridx = 7;
		gbc.gridy = 5;
		bckgrnd.add(prazan7, gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 5;
		bckgrnd.add(prazan8, gbc);
		
		gbc.gridx = 9;
		gbc.gridy = 5;
		bckgrnd.add(prazan9, gbc);
		
		gbc.gridx = 10;
		gbc.gridy = 5;
		bckgrnd.add(prazan10, gbc);	
		
		prozor.pack();
		prozor.setLocationRelativeTo(null);
	    prozor.setVisible(true);
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

