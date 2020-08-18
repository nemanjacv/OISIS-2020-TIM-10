package prozori;

import prikaz.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;

public class Apotekar {

	public static JFrame prozor = new JFrame();
	promenljive source = new promenljive();
	
	JLabel korisnik = new JLabel("Apotekar");
	public JLabel wlcm1 = new JLabel("Dobrodosli");
	public static JPanel wlcm = new JPanel();
	
	JPanel logo = new Logo();
	JPanel lek = new Lekovi3();
	JPanel korpa = new Korpa();
	//JPanel recept = new Recept();
	JPanel dno = new JPanel();
	JPanel ctrl = new prikaz.Logout();
	
	JPanel top = new JPanel();
	JPanel topIco = new Dugmad();
	JPanel topLft = new JPanel();
	JPanel ikone = new JPanel();
	
	ImageIcon slika1 = new ImageIcon("img/bckgrnd.png");
	Image pozadina = slika1.getImage().getScaledInstance( source.winWidth, source.winHeight, Image.SCALE_SMOOTH);
	JLabel bckgrnd = new JLabel( new ImageIcon(pozadina, slika1.getDescription()) );
	
	public Apotekar()
	{
		prozor.setUndecorated(true);
		prozor.setPreferredSize(new Dimension(source.winWidth, source.winHeight));
		bckgrnd.setLayout(new BorderLayout());
		prozor.setContentPane(bckgrnd);
		
		wlcm.setLayout(new FlowLayout(FlowLayout.CENTER));
		wlcm.setOpaque(false);
		wlcm1.setFont(new Font("Calibri", Font.PLAIN, 40));
		wlcm1.setForeground( Color.white);
		EmptyBorder eBorder2 = new EmptyBorder(source.winHeight/3, 0, 0, 0);
	    wlcm1.setBorder(BorderFactory.createCompoundBorder(null, eBorder2));
		wlcm.add(wlcm1);
		
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
		korpa.setOpaque(false);
		//recept.setOpaque(false);
		lek.setOpaque(false);
		dno.setPreferredSize(new Dimension(source.blWidth, source.blHeight*2));
		dno.setOpaque(false);
		dno.setLayout(new BorderLayout());
		ctrl.setOpaque(false);
		ctrl.setLayout(new BoxLayout(ctrl, BoxLayout.Y_AXIS));

		dno.add(ctrl, BorderLayout.PAGE_END);
		ikone.add(lek);
		ikone.add(korpa);
		//ikone.add(recept);
		ikone.add(dno);
		prozor.add(ikone,BorderLayout.LINE_START);
		
		prozor.add(wlcm, BorderLayout.CENTER);
		
		prozor.pack();
		prozor.setLocationRelativeTo(null);
	    prozor.setVisible(true);
	    
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

