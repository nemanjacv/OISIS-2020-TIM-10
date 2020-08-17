package paneli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;

public class AddUserWin extends JPanel{
	
	private static final long serialVersionUID = 3084282998787165875L;
	promenljive source = new promenljive();
	
	public static JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Dodaj Korisnika");
	JPanel podaci = new JPanel();
	
	JPanel korisnickoIme = new JPanel();
	JPanel ime = new JPanel();
	JPanel prezime = new JPanel();
	JPanel tipKorisnika = new JPanel();
	JLabel Korisnickoime = new JLabel("Korisnicko Ime: ");
	JTextField KorisnickoimeT = new JTextField();
	JLabel Ime = new JLabel          ("Ime:                   ");
	JTextField imeT = new JTextField();
	JLabel Prezime = new JLabel      ("Prezime:            ");
	JTextField PrezimeT = new JTextField();
	JLabel tipkorisnika = new JLabel ("Tip Korisnika:  ");
	
	public AddUserWin()
	{	
		//Top bar
				panel.setLayout(new BorderLayout());	
				
				korisnici.setFont(new Font("Calibri", Font.PLAIN, 20)); 
				korisnici.setForeground(Color.white);
				EmptyBorder eBorder = new EmptyBorder(5, 10, 0, 0);	
			    korisnici.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
				
				panel.setOpaque(false);
				top.setLayout(new FlowLayout(FlowLayout.LEFT)); 
				top.setOpaque(false);
				top.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.blHeight/2)); 
				top.add(korisnici); 
				
				podaci.setLayout(new BoxLayout(podaci,BoxLayout.Y_AXIS));
				podaci.setOpaque( false );
				podaci.setBorder(new EmptyBorder(70, 0,0, 0));
				korisnickoIme.setLayout(new FlowLayout(FlowLayout.CENTER));
				ime.setLayout(new FlowLayout(FlowLayout.CENTER));
				prezime.setLayout(new FlowLayout(FlowLayout.CENTER));
				tipKorisnika.setLayout(new FlowLayout(FlowLayout.CENTER));
				
		//--------------------------------------------------------------------------------------------------
		//Polje


		podaci.setOpaque(false);
		
		korisnickoIme.setOpaque(false);
		Korisnickoime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Korisnickoime.setForeground(Color.white);
		KorisnickoimeT.setPreferredSize(new Dimension(150,25));
		korisnickoIme.add(Korisnickoime);
		korisnickoIme.add(KorisnickoimeT);
		
		ime.setOpaque(false);
		Ime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Ime.setForeground(Color.white);
		imeT.setPreferredSize(new Dimension(150,25));
		ime.add(Ime);
		ime.add(imeT);
		
		prezime.setOpaque(false);
		Prezime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Prezime.setForeground(Color.white);
		PrezimeT.setPreferredSize(new Dimension(150,25));
		prezime.add(Prezime);
		prezime.add(PrezimeT);
		
		tipKorisnika.setOpaque(false);
		tipkorisnika.setFont(new Font("Calibri", Font.PLAIN, 20));
		tipkorisnika.setForeground(Color.white);
		tipKorisnika.add(tipkorisnika);
		
		podaci.add(korisnickoIme);
		podaci.add(ime);
		podaci.add(prezime);
		podaci.add(tipKorisnika);
	
		panel.add(top, BorderLayout.LINE_START);
		panel.add(podaci, BorderLayout.SOUTH);
		add(panel);
		
	}
}
