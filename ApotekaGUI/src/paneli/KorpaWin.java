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
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;

public class KorpaWin extends JPanel{
	
	private static final long serialVersionUID = 5711006855021819810L;
	promenljive source = new promenljive();
	
	public static JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Korpa");
	
	JPanel korpa = new JPanel();
	JPanel tabela = new JPanel();
	JPanel dugme = new JPanel();
	JLabel ukupno = new JLabel("Ukupno:");
	JLabel ukupno1 = new JLabel("broj?");
	
	public KorpaWin()
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
		//--------------------------------------------------------------------------------------------------
		//Polje
		
				korpa.setLayout(new BorderLayout());	
				korpa.setOpaque(false);
				korpa.setBorder(new EmptyBorder(100, 0,0, 20));
				
				tabela.setLayout(new FlowLayout());
				dugme.setLayout(new BoxLayout(dugme, BoxLayout.Y_AXIS));
				tabela.setOpaque(false);
				dugme.setOpaque(false);
				
				ukupno.setFont(new Font("Calibri", Font.PLAIN, 20)); 
				ukupno.setForeground(Color.white);
				ukupno.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
				
				ukupno1.setFont(new Font("Calibri", Font.PLAIN, 20)); 
				ukupno1.setForeground(Color.white);
				ukupno1.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
				
				JButton dugme1=new JButton("Kupi");
				dugme1.setPreferredSize(new Dimension(60,40));
				
				dugme.add(ukupno);
				dugme.add(ukupno1);
				dugme.add(dugme1);
				
				korpa.add(tabela,BorderLayout.CENTER);
				korpa.add(dugme,BorderLayout.EAST);
				
				JTable table = new JTable();
				tabela.add(table);
		
		
		panel.add(top, BorderLayout.LINE_START);
		panel.add(korpa, BorderLayout.SOUTH);
		add(panel);
	}
}
