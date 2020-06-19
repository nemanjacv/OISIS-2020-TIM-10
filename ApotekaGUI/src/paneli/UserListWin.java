package paneli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;
import prikaz.KorisnickaTabela;

public class UserListWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Korisnici");
	
	JPanel users = new JPanel();
	JPanel search = new JPanel();
	JTextField srch = new JTextField("Polje za pretragu");
	ImageIcon field1 = new ImageIcon("img/field2.png");
	Image image2 = field1.getImage().getScaledInstance( source.fWidth1, source.fHeight1 , Image.SCALE_SMOOTH);
	JLabel srchL = new JLabel( new ImageIcon(image2, field1.getDescription()) );
	
	JPanel tabela = new JPanel();
	JPanel table = new KorisnickaTabela();
	
	JPanel radio = new JPanel();
	JLabel sort = new JLabel("Sortiraj po:");
	JRadioButton ime = new JRadioButton("Ime");
	JRadioButton prezime = new JRadioButton("Prezime");
	JRadioButton tip = new JRadioButton("Tip korisnika");
	ButtonGroup radioB = new ButtonGroup();
	ImageIcon r1 = new ImageIcon("img/r1.png");
	ImageIcon r2 = new ImageIcon("img/r2.png");
	
	public UserListWin()			//ovde pocinje kod
	{	
		//Top bar
		panel.setLayout(new BorderLayout());	//podesen layout za panel da bude borderlayout guglajte kako radi
		
		korisnici.setFont(new Font("Calibri", Font.PLAIN, 20));	//ovko se postavlja font za bilo sta u ovom slucaju za jlabel 
		korisnici.setForeground(Color.white);	//menja se boja teksta na belo
		EmptyBorder eBorder = new EmptyBorder(5, 10, 0, 0);	//praavi se prazan border ovo se stavlja oko necega cemu ga pripojimo, u ovom slucaju 5 piksela s leve str i 10 odozgo
	    korisnici.setBorder(BorderFactory.createCompoundBorder(null, eBorder));	//dodak\je se border koji sam gore napravio na objekat
		
		//panel.setLayout(new BorderLayout());
		panel.setOpaque(false);	//pomocu ove funkcije se stavlja da pozadina objekta bilo kog label dugme ne postoji tj bude prozirna
		top.setLayout(new FlowLayout(FlowLayout.LEFT));	//za jpanel da se ispisuje s leve na desnu stranu koriscen flowlayout guglajte kako radi 
		top.setOpaque(false);
		top.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.blHeight/2)); //ovako se definise staticna velicina za dosta toga 
		top.add(korisnici); //kad napravim npr panel ovako u njega dodajem dugmad npr(objekte)
//--------------------------------------------------------------------------------------------------
		//Polje
		srch.addMouseListener(new MouseAdapter(){	//ovo je funkcija koja prati desavanja u ovom slucaju akciju misa
            @Override
            public void mouseClicked(MouseEvent e){	//akcija je definisana ovde, klik misa
                srch.setText("");	//kada je mis kliknut za objekat srch se postavlja tekst da bude prazan tj kad kliknem u programu na "pretraga" samo ce nestati taj tekst
            }
        });
		
		users.setOpaque(false);
		users.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.winHeight-source.blHeight));
		users.setLayout(new BorderLayout());
		
		srch.setFont(new Font("Calibri", Font.PLAIN, 15));
		srch.setOpaque( false );
		srch.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		srchL.setLayout( new BorderLayout() );
		srchL.add(srch);
		EmptyBorder eBorder2 = new EmptyBorder(30, 10, 0, 0);
	    search.setBorder(BorderFactory.createCompoundBorder(null, eBorder2));
	    search.setLayout(new FlowLayout(FlowLayout.LEFT));
	    search.add(srchL);
	    search.setOpaque(false);
		
	    sort.setFont(new Font("Calibri", Font.PLAIN, 20));
		sort.setForeground(Color.white);
	    ime.setFont(new Font("Calibri", Font.PLAIN, 15));
		ime.setForeground(Color.white);
		ime.setOpaque(false);
		ime.setIcon(r1);	//ovako se za radio dugme menja ikona pogledajte kako se konkretno za dugme menja negde drugde u principu ucitava se slika prebacuje u ikonu rez\size se radi i vraca u image 
		ime.setSelectedIcon(r2);	//ovako se za radio dugme menja ikona kad je selektovan 
		ime.setFocusPainted(false);	//kada je kliknuto ima kao neke tackice oko njega okvir e to ovo krije
		prezime.setFont(new Font("Calibri", Font.PLAIN, 15));
		prezime.setForeground(Color.white);
		prezime.setOpaque(false);
		prezime.setIcon(r1);
		prezime.setSelectedIcon(r2);
		prezime.setFocusPainted(false);
		tip.setFont(new Font("Calibri", Font.PLAIN, 15));
		tip.setForeground(Color.white);
		tip.setOpaque(false);
		tip.setIcon(r1);
		tip.setSelectedIcon(r2);
		tip.setFocusPainted(false);
	    
	    radio.setLayout(new BoxLayout(radio,BoxLayout.Y_AXIS));
	    radio.setOpaque(false);
	    radio.setPreferredSize(new Dimension(source.winWidth/4,source.winHeight/3));
	    radio.add(sort);
	    radioB.add(ime);
	    radioB.add(prezime);
	    radioB.add(tip);
	    radio.add(ime);
	    radio.add(prezime);
	    radio.add(tip);
	    
	    EmptyBorder eBorder3 = new EmptyBorder(30, 10, 0, 0);
	    tabela.setBorder(BorderFactory.createCompoundBorder(null, eBorder3));
	    tabela.setLayout(new FlowLayout(FlowLayout.LEFT));
	    tabela.setOpaque(false);
	    
	    table.setOpaque(false);
	    tabela.add(table);
	    
	    users.add(search, BorderLayout.PAGE_START);	//kod border layouta imamo strane prozora u koje mozemo da dodajemo objekte ovako se definise gde sta ide al morate da procitate kako rade layouti da skontate postavicu link gde ima ok objasnjeno skontajte primere 
	    users.add(radio, BorderLayout.EAST);
	    users.add(tabela, BorderLayout.CENTER);

		panel.add(top, BorderLayout.PAGE_START);
		panel.add(users, BorderLayout.CENTER);
		add(panel);	//ovo stavljam na kraj kako bi se panel u kojem je sve ovo dodalo dodao negde gde se zove ova klasa (zove se u admin prozoru bacite pogled kako tacno)
	}
}
