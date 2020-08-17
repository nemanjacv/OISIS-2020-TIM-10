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

public class AddUserWin extends JPanel{
	
	private static final long serialVersionUID = 3084282998787165875L;
	promenljive source = new promenljive();
	
	public static JPanel panel = new JPanel();
	JPanel top = new JPanel();
	JLabel korisnici = new JLabel("Dodaj Korisnika");
	JPanel podaci = new JPanel();
	
	JPanel korisnickoIme = new JPanel();
	JPanel ime = new JPanel();
	JPanel pass = new JPanel();
	JPanel prezime = new JPanel();
	JPanel tipKorisnika = new JPanel();
	JLabel Korisnickoime = new JLabel("Korisnicko Ime: ");
	JTextField KorisnickoimeT = new JTextField();
	JLabel Ime = new JLabel          ("Ime:                   ");
	JTextField imeT = new JTextField();
	JLabel Pass = new JLabel          ("Lozinka:             ");
	JTextField passT = new JTextField();
	JLabel Prezime = new JLabel      ("Prezime:            ");
	JTextField PrezimeT = new JTextField();
	JLabel tipkorisnika = new JLabel ("Tip Korisnika:  ");
	JRadioButton lek = new JRadioButton("Lekar");
	JRadioButton apt = new JRadioButton("Apotekar");
	ButtonGroup radioB = new ButtonGroup();
	ImageIcon r1 = new ImageIcon("img/r1.png");
	ImageIcon r2 = new ImageIcon("img/r2.png");
	
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Workbook wb;
	private static Sheet sh;
	private static Row row;
	private static Cell cell;
	private static Cell cell1;
	private static Cell cell2;
	private static Cell cell3;
	private static Cell cell4;
	
	public AddUserWin()
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
				
				podaci.setLayout(new BoxLayout(podaci,BoxLayout.Y_AXIS));
				podaci.setOpaque( false );
				podaci.setBorder(new EmptyBorder(70, 0,0, 0));
				korisnickoIme.setLayout(new FlowLayout(FlowLayout.CENTER));
				ime.setLayout(new FlowLayout(FlowLayout.CENTER));
				prezime.setLayout(new FlowLayout(FlowLayout.CENTER));
				tipKorisnika.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				lek.setFont(new Font("Calibri", Font.PLAIN, 17));
				lek.setForeground(Color.white);
				lek.setOpaque(false);
				lek.setIcon(r1);	
				lek.setSelectedIcon(r2);	
				lek.setFocusPainted(false);
				apt.setFont(new Font("Calibri", Font.PLAIN, 17));
				apt.setForeground(Color.white);
				apt.setOpaque(false);
				apt.setIcon(r1);
				apt.setSelectedIcon(r2);
				apt.setFocusPainted(false);
				radioB.add(lek);
			    radioB.add(apt);
				
		//--------------------------------------------------------------------------------------------------
		//Polje


		podaci.setOpaque(false);
		
		korisnickoIme.setOpaque(false);
		Korisnickoime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Korisnickoime.setForeground(Color.white);
		KorisnickoimeT.setPreferredSize(new Dimension(150,25));
		korisnickoIme.add(Korisnickoime);
		korisnickoIme.add(KorisnickoimeT);
		
		ime.setOpaque(false);
		Ime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Ime.setForeground(Color.white);
		imeT.setPreferredSize(new Dimension(150,25));
		ime.add(Ime);
		ime.add(imeT);
		
		pass.setOpaque(false);
		Pass.setFont(new Font("Calibri", Font.PLAIN, 20));
		Pass.setForeground(Color.white);
		passT.setPreferredSize(new Dimension(150,25));
		pass.add(Pass);
		pass.add(passT);
		
		prezime.setOpaque(false);
		Prezime.setFont(new Font("Calibri", Font.PLAIN, 20));
		Prezime.setForeground(Color.white);
		PrezimeT.setPreferredSize(new Dimension(150,25));
		prezime.add(Prezime);
		prezime.add(PrezimeT);
		
		tipKorisnika.setOpaque(false);
		tipkorisnika.setFont(new Font("Calibri", Font.PLAIN, 20));
		tipkorisnika.setForeground(Color.white);
		tipKorisnika.add(tipkorisnika);
		tipKorisnika.add(lek);
		tipKorisnika.add(apt);
		
		JPanel dugme = new JPanel();
		dugme.setLayout(new FlowLayout(FlowLayout.CENTER));
		dugme.setOpaque(false);
		JButton primeni = new JButton("Dodaj Korisnika");
		primeni.setFont(new Font("Calibri", Font.PLAIN, 15));
		dugme.add(primeni);
		
		primeni.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					fis = new FileInputStream("./podaci.xlsx");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					wb = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				sh = wb.getSheet("korisnici");
				int noRow= sh.getLastRowNum();
				row= sh.createRow(noRow+1);
				cell= row.createCell(0);
				cell1= row.createCell(1);
				cell2= row.createCell(2);
				cell3= row.createCell(3);
				cell4= row.createCell(4);
				
				cell.setCellValue(KorisnickoimeT.getText());
				cell1.setCellValue(passT.getText());
				if (apt.isSelected()) {
					cell4.setCellValue("apotekar");
				}
				else if (lek.isSelected()) {
					cell4.setCellValue("lekar");
				}
				cell2.setCellValue(imeT.getText());
				cell3.setCellValue(PrezimeT.getText());
				try {
					fos= new FileOutputStream("./podaci.xlsx");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					wb.write(fos);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		podaci.add(korisnickoIme);
		podaci.add(ime);
		podaci.add(prezime);
		podaci.add(pass);
		podaci.add(tipKorisnika);
		podaci.add(dugme);
	
		panel.add(top, BorderLayout.LINE_START);
		panel.add(podaci, BorderLayout.SOUTH);
		add(panel);
		
	}
}
