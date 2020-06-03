package prozori;

import prikaz.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
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

	public JFrame prozor = new JFrame();
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
	JPanel ctrl = new JPanel();
	
	JPanel top = new JPanel();
	JPanel topIco = new JPanel();
	JPanel topLft = new JPanel();
	JPanel ikone = new JPanel();
	
	JButton praznoP1 = new JButton("prazno");
	JButton praznoP2 = new JButton("buduce dugme");
	
	ImageIcon slika1 = new ImageIcon("img/bckgrnd.png");
	Image pozadina = slika1.getImage().getScaledInstance( source.winWidth, source.winHeight, Image.SCALE_SMOOTH);
	JLabel bckgrnd = new JLabel( new ImageIcon(pozadina, slika1.getDescription()) );
	
	JButton b1=new JButton("");
	JButton b2=new JButton("");
	
	public Admin()
	{
		
		prozor.setUndecorated(true);
		prozor.setPreferredSize(new Dimension(source.winWidth, source.winHeight));
		bckgrnd.setLayout(new BorderLayout());
		prozor.setContentPane(bckgrnd);
		
		//top.setPreferredSize(new Dimension(source.winWidth,source.blHeight));
		topLft.setLayout(new FlowLayout(FlowLayout.LEFT));
		topLft.setOpaque(false);
		top.setOpaque(false);
		top.setLayout(new BorderLayout());
		top.setPreferredSize(new Dimension(source.winWidth,source.blHeight));
		topIco.setOpaque(false);
		topIco.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				prozor.setState(Frame.ICONIFIED);
				
			}
		});
		
		b1.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn1 = new ImageIcon("img/2.png");
		Image butn1 = btnn1.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn1 = new ImageIcon(butn1, btnn1.getDescription());
		
		b1.setIcon(btnn1);
		b1.setBorder(null);
		b1.setFocusable(false);
		b1.setContentAreaFilled(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		b2.setPreferredSize(new Dimension(30, 30));
	    ImageIcon btnn2 = new ImageIcon("img/1.png");
		Image butn2 = btnn2.getImage().getScaledInstance( 30, 30 , Image.SCALE_SMOOTH);
		btnn2 = new ImageIcon(butn2, btnn2.getDescription());
		
		b2.setIcon(btnn2);
		b2.setBorder(null);
		b2.setFocusable(false);
		b2.setContentAreaFilled(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		logout.setFont(new Font("Calibri", Font.PLAIN, 15));
		logout.setForeground(new Color(0x008000));
		logout.setBorderPainted(false);
		logout.setFocusable(false);
		logout.setContentAreaFilled(false);
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginWin login = new LoginWin();
				login.setVisible(true);
				prozor.setVisible(false);
				
			}
		});
		
		korisnik.setFont(new Font("Calibri", Font.PLAIN, 40));
		korisnik.setForeground( Color.white);
		EmptyBorder eBorder = new EmptyBorder(0, 20, 0, 0);
	    korisnik.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
		
		logo.setLayout(new GridLayout(1,1));
		logo.setBackground(Color.white);
		logo.setPreferredSize(new Dimension(source.blWidth1, source.blHeight1));
		topLft.add(logo);
		topLft.add(korisnik);
		topIco.add(b2);
		topIco.add(b1);
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
		ctrl.add(prazan5);
		ctrl.add(logout);
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

