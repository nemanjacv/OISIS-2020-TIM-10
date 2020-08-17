package paneli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;


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




public class IzmenaLekovaWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Izmena Lekova");
	
	JPanel izmene = new JPanel();
	
	JPanel sifra = new JPanel();
	JPanel ime = new JPanel();
	JPanel proizvodjac = new JPanel();
	JPanel recept = new JPanel();
	JPanel cena = new JPanel();
	JLabel Ime = new JLabel("Ime:             ");
	JTextField ImeT = new JTextField();
	JLabel Sifra = new JLabel("Sifra Leka: ");
	JLabel Proizvodjac = new JLabel("Proizvodjac:");
	JTextField ProizvodjacT = new JTextField();
	JLabel Recept = new JLabel("Recept:                 ");
	JLabel Cena = new JLabel("Cena:          ");
	JTextField CenaT = new JTextField();
	JRadioButton da = new JRadioButton("Da");
	JRadioButton ne = new JRadioButton("Ne");
	ButtonGroup radioB = new ButtonGroup();
	ImageIcon r1 = new ImageIcon("img/r1.png");
	ImageIcon r2 = new ImageIcon("img/r2.png");
	public IzmenaLekovaWin()
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
		
		izmene.setLayout(new BoxLayout(izmene,BoxLayout.Y_AXIS));
		izmene.setOpaque( false );
		izmene.setBorder(new EmptyBorder(70, 0,0, 0));
		sifra.setLayout(new FlowLayout(FlowLayout.CENTER));
		ime.setLayout(new FlowLayout(FlowLayout.CENTER));
		proizvodjac.setLayout(new FlowLayout(FlowLayout.CENTER));
		recept.setLayout(new FlowLayout(FlowLayout.CENTER));
		cena.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		sifra.setOpaque( false );
		Sifra.setOpaque( false );
		
		ime.setOpaque( false );
		Ime.setOpaque( false );
		ImeT.setPreferredSize(new Dimension(150,25));
		
		proizvodjac.setOpaque( false );
		Proizvodjac.setOpaque( false );
		ProizvodjacT.setPreferredSize(new Dimension(150,25));
		
		recept.setOpaque( false );
		Recept.setOpaque(false);
		
		da.setFont(new Font("Calibri", Font.PLAIN, 20));
		da.setForeground(Color.white);
		da.setOpaque(false);
		da.setIcon(r1);	
		da.setSelectedIcon(r2);	
		da.setFocusPainted(false);
		ne.setFont(new Font("Calibri", Font.PLAIN, 20));
		ne.setForeground(Color.white);
		ne.setOpaque(false);
		ne.setIcon(r1);
		ne.setSelectedIcon(r2);
		ne.setFocusPainted(false);

		cena.setOpaque( false );
		Cena.setOpaque( false );
		CenaT.setPreferredSize(new Dimension(150,25));
		
		radioB.add(da);
	    radioB.add(ne);
		
//--------------------------------------------------------------------------------------------------
		Sifra.setFont(new Font("Calibri", Font.PLAIN, 20));
		Sifra.setForeground(Color.white);
		sifra.add(Sifra);
		
		Ime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Ime.setForeground(Color.white);
		ime.add(Ime);
		ime.add(ImeT);
		
		Proizvodjac.setFont(new Font("Calibri", Font.PLAIN, 20));
		Proizvodjac.setForeground(Color.white);
		proizvodjac.add(Proizvodjac);
		proizvodjac.add(ProizvodjacT);
		
		Recept.setFont(new Font("Calibri", Font.PLAIN, 20));
		Recept.setForeground(Color.white);
		recept.add(Recept);
		recept.add(da);
		recept.add(ne);
		
		Cena.setFont(new Font("Calibri", Font.PLAIN, 20));
		Cena.setForeground(Color.white);
		cena.add(Cena);
		cena.add(CenaT);
		
		
		izmene.add(sifra);
		izmene.add(ime);
		izmene.add(proizvodjac);
		izmene.add(recept);
		izmene.add(cena);
		panel.add(top, BorderLayout.PAGE_START);
		panel.add(izmene, BorderLayout.CENTER);
		
		add(panel);	
	}
}


















