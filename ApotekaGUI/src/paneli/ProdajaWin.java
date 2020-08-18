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

public class ProdajaWin extends JPanel{
	
	private static final long serialVersionUID = 3084282998787165875L;
	promenljive source = new promenljive();
	
	public static JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel naslov = new JLabel("Prodaja");
	JPanel podaci = new JPanel();
	
	JPanel prodajalekova = new JPanel();
	JPanel lek = new JPanel();
	JPanel recept = new JPanel();
	JPanel sifra = new JPanel();
	JPanel korpa = new JPanel();
	
	JLabel Prodaja = new JLabel("Lekovi bez recepta ");
	
	JTextField SifraL = new JTextField();
	JTextField Kolicina = new JTextField();
	
	JLabel Ime = new JLabel("Sifra recepta   ");
	
	JTextField SifraR = new JTextField();

	

	public ProdajaWin()
	{	
		//Top bar
				panel.setLayout(new BorderLayout());	
				
				naslov.setFont(new Font("Calibri", Font.PLAIN, 20)); 
				naslov.setForeground(Color.white);
				EmptyBorder eBorder = new EmptyBorder(5, 10, 0, 0);	
				naslov.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
				
				panel.setOpaque(false);
				top.setLayout(new FlowLayout(FlowLayout.LEFT)); 
				top.setOpaque(false);
				top.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.blHeight/2)); 
				top.add(naslov); 
				
				podaci.setLayout(new BoxLayout(podaci,BoxLayout.Y_AXIS));
				podaci.setOpaque( false );
				podaci.setBorder(new EmptyBorder(70, 30,0, 0));
				prodajalekova.setLayout(new FlowLayout(FlowLayout.LEFT));
				lek.setLayout(new FlowLayout(FlowLayout.LEFT));
				recept.setLayout(new FlowLayout(FlowLayout.LEFT));
				sifra.setLayout(new FlowLayout(FlowLayout.LEFT));
				
				prodajalekova.setOpaque(false);
				lek.setOpaque(false);
				recept.setOpaque(false);
				sifra.setOpaque(false);
				korpa.setOpaque(false);

				
		//--------------------------------------------------------------------------------------------------
		//Polje


		Prodaja.setFont(new Font("Calibri", Font.PLAIN, 20));
		Prodaja.setForeground(Color.white);

		prodajalekova.add(Prodaja);
		
		SifraL.setPreferredSize(new Dimension(100,25));
		Kolicina.setPreferredSize(new Dimension(100,25));
		
		JButton dugme1=new JButton("Dodaj");
		dugme1.setPreferredSize(new Dimension(50,25));
		lek.add(SifraL);
		lek.add(Kolicina);
        lek.add(dugme1);
        
        Ime.setFont(new Font("Calibri", Font.PLAIN, 20));
        Ime.setForeground(Color.white);

		recept.add(Ime);
		
		
		SifraR.setPreferredSize(new Dimension(100,25));
		JButton dugme2=new JButton("Dodaj");
		dugme2.setPreferredSize(new Dimension(50,25));
		sifra.add(SifraR);
        sifra.add(dugme2);
        
        
        
        JButton dugme3=new JButton("Korpa");
		dugme3.setPreferredSize(new Dimension(50,25));

        korpa.add(dugme3);
        

		
		podaci.add(prodajalekova);
		podaci.add(lek);
		podaci.add(recept);
		podaci.add(sifra);
		podaci.add(korpa);
	
		panel.add(top, BorderLayout.LINE_START);
		panel.add(podaci, BorderLayout.SOUTH);
		add(panel);
		
	}
}
