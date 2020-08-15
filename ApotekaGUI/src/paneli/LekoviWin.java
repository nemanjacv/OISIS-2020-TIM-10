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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import kontroleri.promenljive;
import prikaz.TabelaLekova;



public class LekoviWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Lekovi");
	
	JPanel users = new JPanel();
	JPanel search = new JPanel();
	public static JTextField srch = new JTextField("Polje za pretragu");
	ImageIcon field1 = new ImageIcon("img/field2.png");
	Image image2 = field1.getImage().getScaledInstance( source.fWidth1, source.fHeight1 , Image.SCALE_SMOOTH);
	JLabel srchL = new JLabel( new ImageIcon(image2, field1.getDescription()) );
	
	JPanel tabela = new JPanel();
	JPanel table = new TabelaLekova();
	
	JPanel radio = new JPanel();
	JLabel sort = new JLabel("Sortiraj po:");
	JRadioButton naziv = new JRadioButton("Naziv");
	JRadioButton proizvodjac = new JRadioButton("Proizvodjac");
	ButtonGroup radioB = new ButtonGroup();
	ImageIcon r1 = new ImageIcon("img/r1.png");
	ImageIcon r2 = new ImageIcon("img/r2.png");
	JLabel cena = new JLabel("Cena:");
	JLabel od = new JLabel("Od:");
	
	JPanel rCena1 = new JPanel();
	
	JTextField od2 = new JTextField() {
	  
		private static final long serialVersionUID = 1L;

		@Override public void setBorder(Border border) {
	        // No!
	    }
	};
	ImageIcon field3 = new ImageIcon("img/field3.png");
	Image image3 = field3.getImage().getScaledInstance( source.fWidth1/2, source.fHeight1 , Image.SCALE_SMOOTH);
	JLabel od2L = new JLabel( new ImageIcon(image3, field1.getDescription()) );
	
	JLabel do1 = new JLabel("Do:");
	JPanel rCena2 = new JPanel();
	JTextField do2 = new JTextField() {
		  
		private static final long serialVersionUID = 1L;

		@Override public void setBorder(Border border) {
	        // No!
	    }
		
	};
	
	ImageIcon field5 = new ImageIcon("img/field3.png");
	Image image4 = field5.getImage().getScaledInstance( source.fWidth1/2, source.fHeight1 , Image.SCALE_SMOOTH);
	JLabel do2L = new JLabel( new ImageIcon(image4, field1.getDescription()) );
	
	
	
	
	public LekoviWin()
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
		srch.addMouseListener(new MouseAdapter(){	
            @Override
            public void mouseClicked(MouseEvent e){	
                srch.setText("");
            }
        });
		
        srch.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                        TabelaLekova.newFilter();
                    }
                    public void insertUpdate(DocumentEvent e) {
                    	TabelaLekova.newFilter();
                    }
                    public void removeUpdate(DocumentEvent e) {
                    	TabelaLekova.newFilter();
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
		naziv.setFont(new Font("Calibri", Font.PLAIN, 15));
		naziv.setForeground(Color.white);
		naziv.setOpaque(false);
		naziv.setIcon(r1);	
		naziv.setSelectedIcon(r2);	
		naziv.setFocusPainted(false);
		proizvodjac.setFont(new Font("Calibri", Font.PLAIN, 15));
		proizvodjac.setForeground(Color.white);
		proizvodjac.setOpaque(false);
		proizvodjac.setIcon(r1);
		proizvodjac.setSelectedIcon(r2);
		proizvodjac.setFocusPainted(false);
		
		cena.setFont(new Font("Calibri", Font.PLAIN, 20));
		cena.setForeground(Color.white);
		
		od.setFont(new Font("Calibri", Font.PLAIN, 18));
		od.setForeground(Color.white);
		
		od2.setFont(new Font("Calibri", Font.PLAIN, 15));
		od2.setOpaque( false );
		//od2L.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
		od2L.setLayout( new BorderLayout() );
		od2L.add(od2);
		
		do1.setFont(new Font("Calibri", Font.PLAIN, 18));
		do1.setForeground(Color.white);
		
		do2.setFont(new Font("Calibri", Font.PLAIN, 15));
		do2.setOpaque( false );
		//do2L.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
		do2L.setLayout( new BorderLayout() );
		do2L.add(do2);

	    
	    radio.setLayout(new BoxLayout(radio,BoxLayout.Y_AXIS));
	    radio.setOpaque(false);
	    JPanel SortPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    SortPnl.add(sort);
	    SortPnl.setOpaque(false);
	    radio.add(SortPnl);
	    radioB.add(naziv);
	    radioB.add(proizvodjac);
	    JPanel ProizvodjacPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    ProizvodjacPnl.add(proizvodjac);
	    ProizvodjacPnl.setOpaque(false);
	    radio.add(ProizvodjacPnl);
	    JPanel NazivPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    NazivPnl.add(naziv);
	    NazivPnl.setOpaque(false);
	    radio.add(NazivPnl);
	    JPanel CenaPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    CenaPnl.add(cena);
	    CenaPnl.setOpaque(false);
	    radio.add(CenaPnl);
	    
	    rCena1.setOpaque(false);
	    rCena1.setLayout(new FlowLayout(FlowLayout.LEADING));
	    rCena1.add(od);
	    rCena1.add(od2L);
	    radio.add(rCena1);
	    
	    rCena2.setOpaque(false);
	    rCena2.setLayout(new FlowLayout(FlowLayout.LEADING));
	    rCena2.add(do1);
	    rCena2.add(do2L);
	    radio.add(rCena2);
	    radio.setBorder(new EmptyBorder(0, 0, 100, 100));
	    
	    EmptyBorder eBorder4 = new EmptyBorder(20, 10, 0, 0);
	    tabela.setBorder(BorderFactory.createCompoundBorder(null, eBorder4));
	    tabela.setLayout(new FlowLayout(FlowLayout.LEFT));
	    tabela.setOpaque(false);
	    
	    table.setOpaque(false);
	    tabela.add(table);
	    
	    users.add(search, BorderLayout.PAGE_START);	
	    users.add(radio, BorderLayout.EAST);
	    users.add(tabela, BorderLayout.CENTER);

		panel.add(top, BorderLayout.PAGE_START);
		panel.add(users, BorderLayout.CENTER);
		add(panel);	
	}
}