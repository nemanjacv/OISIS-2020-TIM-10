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
	JLabel JMBG = new JLabel("Ime:     ");
	JTextField JMBGT = new JTextField();
	
	
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
		izmene.setBorder(new EmptyBorder(70, 0,0, 0));
		
		jmbg.setLayout(new FlowLayout(FlowLayout.CENTER));
		jmbg.setOpaque( false );
		JMBG.setOpaque( false );
		JMBGT.setPreferredSize(new Dimension(150,25));
		
		
		podaci.setLayout(new FlowLayout(FlowLayout.CENTER));
		podaci.setOpaque( false );
		Podaci.setOpaque( false );
		
		
//--------------------------------------------------------------------------------------------------

		Podaci.setFont(new Font("Calibri", Font.PLAIN, 20));
		Podaci.setForeground(Color.white);
		podaci.add(Podaci);

		
		
		JMBG.setFont(new Font("Calibri", Font.PLAIN, 15));
		JMBG.setForeground(Color.white);
		jmbg.add(JMBG);
		jmbg.add(JMBGT);
		
		
	
		
		izmene.add(jmbg);

		panel.add(top, BorderLayout.PAGE_START);
		panel.add(izmene, BorderLayout.CENTER);
		
		add(panel);	
	}
}


















