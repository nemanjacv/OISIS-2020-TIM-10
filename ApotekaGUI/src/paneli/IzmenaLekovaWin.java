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
	JLabel Sifra = new JLabel("Sifra Leka:    ");
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
		
		String[] sifre = TabelaLekova.SH2();
		JComboBox<?> ids = new JComboBox<Object>(sifre);
		ids.setPreferredSize(new Dimension(150,25));
		sifra.add(Sifra);
		sifra.add(ids);
		
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
		
		JPanel dugme = new JPanel();
		dugme.setLayout(new FlowLayout(FlowLayout.CENTER));
		dugme.setOpaque(false);
		JButton primeni = new JButton("Primeni Izmenu");
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
				sh = wb.getSheet("lekovi");
				row= sh.createRow(ids.getSelectedIndex()+1);
				cell= row.createCell(0);
				cell1= row.createCell(1);
				cell2= row.createCell(2);
				cell3= row.createCell(3);
				cell4= row.createCell(4);
				cell.setCellValue(ImeT.getText());
				cell1.setCellValue(sifre[ids.getSelectedIndex()+1].substring(0,6)+".0");
				if (da.isSelected()) {
					cell2.setCellValue("DA");
				}
				else if (ne.isSelected()) {
					cell2.setCellValue("NE");
				}
				cell3.setCellValue(ProizvodjacT.getText());
				cell4.setCellValue(CenaT.getText()+".0");
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
		
		izmene.add(sifra);
		izmene.add(ime);
		izmene.add(proizvodjac);
		izmene.add(recept);
		izmene.add(cena);
		izmene.add(dugme);
		panel.add(top, BorderLayout.PAGE_START);
		panel.add(izmene, BorderLayout.CENTER);
		
		add(panel);	
	}
}


















