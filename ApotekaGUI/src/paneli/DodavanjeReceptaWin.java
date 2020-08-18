package paneli;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import kontroleri.promenljive;
import prikaz.TabelaLekova;

public class DodavanjeReceptaWin extends JPanel{
	
	private static final long serialVersionUID = -1814873711205869180L;
	promenljive source = new promenljive();
	
	JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Kreiranje recepta");
	
	JPanel izmene = new JPanel();
	
	JPanel podaci = new JPanel();
	JLabel Podaci = new JLabel("PODACI O PACIJENTU ");

	JPanel jmbg = new JPanel();
	JLabel JMBG = new JLabel("JMBG                          ");
	JTextField JMBGT = new JTextField();
	
	JPanel podaci2 = new JPanel();
	JLabel Podaci2 = new JLabel("OSTALI PODACI     ");
	
	JPanel datumI = new JPanel();
	JLabel DatumI = new JLabel("Datum izdavanja    ");
	JTextField DatumIT = new JTextField();
	
	JPanel datumK= new JPanel();
	JLabel DatumK = new JLabel("Datum kreiranja     ");
	JTextField DatumKT = new JTextField();
	
	JPanel lekovi = new JPanel(); 
	JLabel Lekovi = new JLabel("LEKOVI           ");
	
	JPanel sifra= new JPanel();
	JLabel Sifra = new JLabel("Sifra                               ");
	JTextField SifraT = new JTextField();
	
	JPanel kolicina= new JPanel();
	JLabel Kolicina = new JLabel("Kolicina                        ");
	JTextField KolicinaT = new JTextField();
	
	JPanel sifraL= new JPanel();
	JLabel SifraL = new JLabel("SIFRA LEKARA      ");
	JTextField SifraLT = new JTextField();
	
	JPanel sifraR= new JPanel();
	JLabel SifraR = new JLabel("SIFRA RECEPTA    ");
	JTextField SifraRT = new JTextField();
	
	
	public DodavanjeReceptaWin()
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
		izmene.setBorder(new EmptyBorder(10, 0,0, 0));
		
		podaci.setLayout(new FlowLayout(FlowLayout.CENTER));
		podaci.setOpaque( false );
		Podaci.setOpaque( false );
		
		jmbg.setLayout(new FlowLayout(FlowLayout.CENTER));
		jmbg.setOpaque( false );
		JMBG.setOpaque( false );
		JMBGT.setPreferredSize(new Dimension(150,20));
		
		
		podaci2.setLayout(new FlowLayout(FlowLayout.CENTER));
		podaci2.setOpaque( false );
		Podaci2.setOpaque( false );
		
		
		datumI.setLayout(new FlowLayout(FlowLayout.CENTER));
		datumI.setOpaque( false );
		DatumI.setOpaque( false );
		DatumIT.setPreferredSize(new Dimension(150,20));
		
		datumK.setLayout(new FlowLayout(FlowLayout.CENTER));
		datumK.setOpaque( false );
		DatumK.setOpaque( false );
		DatumKT.setPreferredSize(new Dimension(150,20));
		
		
		lekovi.setLayout(new FlowLayout(FlowLayout.CENTER));
		lekovi.setOpaque( false );
		Lekovi.setOpaque( false );
		
		sifra.setLayout(new FlowLayout(FlowLayout.CENTER));
		sifra.setOpaque( false );
		Sifra.setOpaque( false );
		SifraT.setPreferredSize(new Dimension(150,20));
		
		kolicina.setLayout(new FlowLayout(FlowLayout.CENTER));
		kolicina.setOpaque( false );
		Kolicina.setOpaque( false );
		KolicinaT.setPreferredSize(new Dimension(150,20));
		
		sifraL.setLayout(new FlowLayout(FlowLayout.CENTER));
		sifraL.setOpaque( false );
		SifraL.setOpaque( false );
		SifraLT.setPreferredSize(new Dimension(150,20));
		
		sifraL.setBorder(new EmptyBorder(40, 0,0, 0));
		
		sifraR.setLayout(new FlowLayout(FlowLayout.CENTER));
		sifraR.setOpaque( false );
		SifraR.setOpaque( false );
		SifraRT.setPreferredSize(new Dimension(150,20));

		
		
//--------------------------------------------------------------------------------------------------

		Podaci.setFont(new Font("Calibri", Font.PLAIN, 20));
		Podaci.setForeground(Color.white);
		podaci.add(Podaci);

		
		
		JMBG.setFont(new Font("Calibri", Font.PLAIN, 15));
		JMBG.setForeground(Color.white);
		jmbg.add(JMBG);
		jmbg.add(JMBGT);
		
		
		Podaci2.setFont(new Font("Calibri", Font.PLAIN, 20));
		Podaci2.setForeground(Color.white);
		podaci2.add(Podaci2);
		
		DatumI.setFont(new Font("Calibri", Font.PLAIN, 15));
		DatumI.setForeground(Color.white);
		datumI.add(DatumI);
		datumI.add(DatumIT);
		
		DatumK.setFont(new Font("Calibri", Font.PLAIN, 15));
		DatumK.setForeground(Color.white);
		datumK.add(DatumK);
		datumK.add(DatumKT);
		
		Lekovi.setFont(new Font("Calibri", Font.PLAIN, 20));
		Lekovi.setForeground(Color.white);
		lekovi.add(Lekovi);
		
		Sifra.setFont(new Font("Calibri", Font.PLAIN, 15));
		Sifra.setForeground(Color.white);
		sifra.add(Sifra);
		sifra.add(SifraT);
	
		
		Kolicina.setFont(new Font("Calibri", Font.PLAIN, 15));
		Kolicina.setForeground(Color.white);
		kolicina.add(Kolicina);
		kolicina.add(KolicinaT);
		
		SifraL.setFont(new Font("Calibri", Font.PLAIN, 20));
		SifraL.setForeground(Color.white);
		sifraL.add(SifraL);
		sifraL.add(SifraLT);
		
		SifraR.setFont(new Font("Calibri", Font.PLAIN, 20));
		SifraR.setForeground(Color.white);
		sifraR.add(SifraR);
		sifraR.add(SifraRT);
		
		
		izmene.add(podaci);
		izmene.add(jmbg);
		izmene.add(podaci2);
		izmene.add(datumI);
		izmene.add(datumK);
		izmene.add(lekovi);
		izmene.add(sifra);
		izmene.add(kolicina);
		izmene.add(sifraL);
		izmene.add(sifraR);

		panel.add(top, BorderLayout.PAGE_START);
		panel.add(izmene, BorderLayout.CENTER);
		
		add(panel);	
	}
}


















