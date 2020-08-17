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
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;
import prikaz.TabelaIzvestaja;

public class IzvestajWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	public static JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Izvestaj");
	JPanel izvestaj = new JPanel();
	JPanel dugmad = new JPanel();
	JPanel tabela = new JPanel();
	JPanel dugme = new JPanel();
	JPanel table = new TabelaIzvestaja();
	
	public IzvestajWin()
	{	
		//Top bar
				panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));	
				
				korisnici.setFont(new Font("Calibri", Font.PLAIN, 20)); 
				korisnici.setForeground(Color.white);
				EmptyBorder eBorder = new EmptyBorder(5, 10, 0, 0);	
			    korisnici.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
				
				panel.setOpaque(false);
				top.setLayout(new FlowLayout(FlowLayout.LEFT)); 
				top.setOpaque(false);
				top.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.blHeight/2)); 
				top.add(korisnici); 
				
		//--------------------------------------------------------------------------------------------------
		//Polje
		izvestaj.setLayout(new BorderLayout());	
		izvestaj.setOpaque(false);
		izvestaj.setBorder(new EmptyBorder(30, 0,0, 0));

		
		
		dugmad.setLayout(new FlowLayout());
		tabela.setLayout(new FlowLayout());
		dugme.setLayout(new FlowLayout());	
		
		dugmad.setOpaque(false);
		tabela.setOpaque(false);
		dugme.setOpaque(false);
		
		
		JButton dugme1=new JButton("<html><center>Izvestaj o ukupnoj prodaji<br />svih lekova</html>");
		JButton dugme2=new JButton("<html><center>Izvestaj o ukupnoj prodaji<br />svih lekova odabranog proizvodjaca</html>");
		JButton dugme3=new JButton("<html><center>Izvestaj o ukupnoj prodaji<br />svih lekova odabranog apotekara</html>");
		
		JButton dugme4=new JButton("Sacuvaj");
		
		dugme1.setPreferredSize(new Dimension(250,40));
		dugme2.setPreferredSize(new Dimension(250,40));
		dugme3.setPreferredSize(new Dimension(250,40));
		
		dugmad.add(dugme1);
		dugmad.add(dugme2);
		dugmad.add(dugme3);
		
		dugme.add(dugme4,BorderLayout.CENTER);
		dugme.setBorder(new EmptyBorder(50, 0,0, 50));

		tabela.add(table);
		table.setOpaque(false);
		
		izvestaj.add(dugmad,BorderLayout.NORTH);
		izvestaj.add(tabela,BorderLayout.CENTER);
		izvestaj.add(dugme,BorderLayout.EAST);
		
		
		panel.add(top, BorderLayout.LINE_START);
		panel.add(izvestaj, BorderLayout.LINE_START);
		add(panel);
	}
}
