package prikaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import kontroleri.promenljive;

public class TabelaIzvestaja extends JPanel
{
	private static final long serialVersionUID = 5096402379870453351L;

	promenljive source = new promenljive();
    public static JTable table;
    public static TableRowSorter<MyTableModel> sorter;
    
	private static FileInputStream fis;
	private static Workbook wb;
	private static Sheet sh;
	static DataFormatter formatter = new DataFormatter();

    
    public TabelaIzvestaja() {
    	super();
    	
    	MyTableModel model = new MyTableModel();
        sorter = new TableRowSorter<MyTableModel>(model);
        table = new JTable(model);
        table.setRowSorter(sorter);
        table.setPreferredScrollableViewportSize(new Dimension(620,300));
        table.setFillsViewportHeight(true);
        table.setOpaque(false);
        table.setFont(new Font("Calibri", Font.PLAIN, 15));
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        LineBorder lb = new LineBorder(new Color(0,0,0,0)); // transparent border
        scrollPane.setBorder(lb);
        
        add(scrollPane);
    }
    
    static class MyTableModel extends AbstractTableModel {
    	
		private static final long serialVersionUID = 207439074890172930L;
		
		public static Object[][] SH()  {
			try {
				fis= new FileInputStream("./podaci.xlsx");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				wb= WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sh=wb.getSheet("korisnici");
			int noRows = sh.getLastRowNum();
			
			Object[][] data = new Object[noRows][6];
			
			for (int i=0; i< noRows; i++)
			{
				data[i][0] = sh.getRow(i+1).getCell(0);
				data[i][1] = sh.getRow(i+1).getCell(1);
				data[i][2] = sh.getRow(i+1).getCell(2);
				data[i][3] = sh.getRow(i+1).getCell(3);
				data[i][4] = sh.getRow(i+1).getCell(4);
				data[i][5] = sh.getRow(i+1).getCell(4);
			}
			return data;
		}
		
		private String[] columnNames = {"Naziv", "Sifra", "Kolicina", "Proizvodjac", "Prodavac", "Uk. Zarada"};
		
		public static Object[][] data = SH();
		
		public int getColumnCount() {
		return columnNames.length;
		}
		
		public int getRowCount() {
		return data.length;
		}
		
		public String getColumnName(int col) {
		return columnNames[col];
		}
		
		public Object getValueAt(int row, int col) {
		return data[row][col];
		}
    }
}
