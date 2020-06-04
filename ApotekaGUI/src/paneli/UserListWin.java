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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kontroleri.promenljive;

public class UserListWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Korisnici");
	
	JPanel users = new JPanel();
	JPanel search = new JPanel();
	JTextField srch = new JTextField("Polje za pretragu");
	ImageIcon field1 = new ImageIcon("img/field.png");
	Image image2 = field1.getImage().getScaledInstance( source.fWidth1, source.fHeight1 , Image.SCALE_SMOOTH);
	JLabel srchL = new JLabel( new ImageIcon(image2, field1.getDescription()) );
	
	JPanel tabela = new JPanel();
	
	JPanel radio = new JPanel();
	JLabel sort = new JLabel("Sortiraj po:");
	JRadioButton ime = new JRadioButton("Ime");
	JRadioButton prezime = new JRadioButton("Prezime");
	JRadioButton tip = new JRadioButton("Tip korisnika");
	
	
	public UserListWin()
	{	
		//Top bar
		panel.setLayout(new BorderLayout());
		
		korisnici.setFont(new Font("Calibri", Font.PLAIN, 20));
		korisnici.setForeground(Color.white);
		EmptyBorder eBorder = new EmptyBorder(5, 10, 0, 0);
	    korisnici.setBorder(BorderFactory.createCompoundBorder(null, eBorder));
		
		//panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		top.setLayout(new FlowLayout(FlowLayout.LEFT));
		top.setOpaque(false);
		top.setPreferredSize(new Dimension(source.winWidth-source.blWidth,source.blHeight/2));
		top.add(korisnici);
//--------------------------------------------------------------------------------------------------
		//Polje
		srch.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                srch.setText("");
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
		prezime.setFont(new Font("Calibri", Font.PLAIN, 15));
		prezime.setForeground(Color.white);
		prezime.setOpaque(false);
		tip.setFont(new Font("Calibri", Font.PLAIN, 15));
		tip.setForeground(Color.white);
		tip.setOpaque(false);
	    
	    radio.setLayout(new BoxLayout(radio,BoxLayout.Y_AXIS));
	    radio.setOpaque(false);
	    radio.setPreferredSize(new Dimension(source.winWidth/4,source.winHeight/3));
	    radio.add(sort);
	    radio.add(ime);
	    radio.add(prezime);
	    radio.add(tip);
	    
	    users.add(search, BorderLayout.PAGE_START);
	    users.add(radio, BorderLayout.EAST);

		panel.add(top, BorderLayout.PAGE_START);
		panel.add(users, BorderLayout.CENTER);
		add(panel);
	}
}
