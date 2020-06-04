package prozori;

import prikaz.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;

public class Admin {

	public static JFrame prozor = new JFrame();
	promenljive source = new promenljive();
	
	JLabel korisnik = new JLabel("Admin");
	JButton logout = new JButton("Izloguj se");
	
	JButton prazan1 = new JButton("1");
	JButton prazan2 = new JButton("2");
	JButton prazan3 = new JButton("3");
	JButton prazan4 = new JButton("4");
	JButton prazan5 = new JButton("5");
	JButton prazan6 = new JButton("Izloguj se");
	JButton prazan7 = new JButton("7");
	JButton prazan8 = new JButton("8");
	JButton prazan9 = new JButton("9");
	JButton prazan10 = new JButton("10");
	JButton prazan11 = new JButton("11");
	
	JPanel logo = new Logo();
	JPanel ulist = new UserList();
	JPanel lek = new lekovi();
	JPanel izv = new Izvestaj();
	JPanel dno = new JPanel();
	JPanel ctrl = new prikaz.logout();
	
	JPanel top = new JPanel();
	JPanel topIco = new dugmad();
	JPanel topLft = new JPanel();
	JPanel ikone = new JPanel();
	
	JButton praznoP1 = new JButton("prazno");
	JButton praznoP2 = new JButton("buduce dugme");
	
	ImageIcon slika1 = new ImageIcon("img/bckgrnd.png");
	Image pozadina = slika1.getImage().getScaledInstance( source.winWidth, source.winHeight, Image.SCALE_SMOOTH);
	JLabel bckgrnd = new JLabel( new ImageIcon(pozadina, slika1.getDescription()) );
	
	public Admin()
	{
		prozor.setUndecorated(true);
		prozor.setPreferredSize(new Dimension(source.winWidth, source.winHeight));
		bckgrnd.setLayout(new BorderLayout());
		prozor.setContentPane(bckgrnd);

		topLft.setLayout(new FlowLayout(FlowLayout.LEFT));
		topLft.setOpaque(false);
		top.setOpaque(false);
		top.setLayout(new BorderLayout());
		top.setPreferredSize(new Dimension(source.winWidth,source.blHeight));
		topIco.setOpaque(false);
		topIco.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		korisnik.setFont(new Font("Calibri", Font.PLAIN, 40));
		korisnik.setForeground( Color.white);
		EmptyBorder eBorder = new EmptyBorder(0, 20, 0, 0);
	    korisnik.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
		logo.setBackground(Color.white);
		logo.setPreferredSize(new Dimension(source.blWidth1, source.blHeight1));
		topLft.add(logo);
		topLft.add(korisnik);
		top.add(topLft, BorderLayout.LINE_START);
		top.add(topIco, BorderLayout.LINE_END);
		prozor.add(top, BorderLayout.PAGE_START);
		
		ikone.setPreferredSize(new Dimension(source.blWidth, source.winHeight));
		ikone.setLayout(new BoxLayout(ikone, BoxLayout.Y_AXIS));
		ikone.setOpaque(false);
		ulist.setOpaque(false);
		lek.setOpaque(false);
		izv.setOpaque(false);
		dno.setPreferredSize(new Dimension(source.blWidth, source.blHeight*2));
		dno.setOpaque(false);
		dno.setLayout(new BorderLayout());
		ctrl.setOpaque(false);
		ctrl.setLayout(new BoxLayout(ctrl, BoxLayout.Y_AXIS));

		dno.add(ctrl, BorderLayout.PAGE_END);
		ikone.add(ulist);
		ikone.add(lek);
		ikone.add(izv);
		ikone.add(dno);
		prozor.add(ikone,BorderLayout.LINE_START);
		
		prozor.pack();
		prozor.setLocationRelativeTo(null);
	    prozor.setVisible(true);
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

