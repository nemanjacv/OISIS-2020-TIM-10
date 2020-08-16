package paneli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.BorderFactory;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;




public class IzmenaLekovaWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Izmena Lekova");
	
	JPanel izmene = new JPanel();
		
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
//--------------------------------------------------------------------------------------------------
		
		panel.add(top, BorderLayout.PAGE_START);
		panel.add(izmene, BorderLayout.CENTER);
		add(panel);	
	}
}