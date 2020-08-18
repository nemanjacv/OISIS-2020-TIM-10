package prikaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import kontroleri.promenljive;
import paneli.LekoviWin3;

public class TabelaLekova3 extends JPanel
{
	private static final long serialVersionUID = 5096402379870453351L;

	promenljive source = new promenljive();
    public static JTable table;
    public static TableRowSorter<MyTableModel> sorter;
    
	private static FileInputStream fis;
	private static Workbook wb;
	private static Sheet sh;
	static DataFormatter formatter = new DataFormatter();

    
    public TabelaLekova3() {
    	super();
    	
    	MyTableModel model = new MyTableModel();
        sorter = new TableRowSorter<MyTableModel>(model);
        table = new JTable(model);
        table.setRowSorter(sorter);
        table.setPreferredScrollableViewportSize(new Dimension(source.winWidth/2,source.winHeight/3));
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
    
    public static void newFilter() {
        RowFilter<MyTableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
        	rf= RowFilter.regexFilter("(?i)"+LekoviWin3.srch.getText(), 0,1,3);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }
    
	public static String[] SH2()  {
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
		sh=wb.getSheet("lekovi");
		int noRows = sh.getLastRowNum();
		
		String[] data1 = new String[noRows];
		String[] data2 = new String[noRows];
		String[] data = new String[noRows];
		
		for (int i=0; i< noRows; i++)
		{	
			data1[i] = formatter.formatCellValue(sh.getRow(i+1).getCell(0));
			data2[i] = formatter.formatCellValue(sh.getRow(i+1).getCell(1));
			data[i] = data2[i]+" "+data1[i];
		}
		return data;
	}
    
    public static void newFilter2() {
    	RowFilter<MyTableModel, Object> rf = null;
    	List<RowFilter<Object,Object>> rfs = 
    	            new ArrayList<RowFilter<Object,Object>>();

    	try {
    		int odInt= Integer.parseInt(LekoviWin3.od2.getText());
    		int doInt= Integer.parseInt(LekoviWin3.do2.getText());
    	    for (int i =odInt; i <= doInt; i++) {
    	    	String txt = String.valueOf(i);
    	        rfs.add(RowFilter.regexFilter(txt+".0", 4));
    	    }
    	    rf = RowFilter.orFilter(rfs);

    	} catch (java.util.regex.PatternSyntaxException e) {
    	        return;
    	}

    	sorter.setRowFilter(rf);
    }
    
    class MyTableModel extends AbstractTableModel {
    	
		private static final long serialVersionUID = 207439074890172930L;
		
		public Object[][] SH()  {
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
			sh=wb.getSheet("lekovi");
			int noRows = sh.getLastRowNum();
			
			Object[][] data = new Object[noRows][5];
			
			for (int i=0; i< noRows; i++)
			{
				data[i][0] = sh.getRow(i+1).getCell(0);
				data[i][1] = sh.getRow(i+1).getCell(1);
				data[i][2] = sh.getRow(i+1).getCell(2);
				data[i][3] = sh.getRow(i+1).getCell(3);
				data[i][4] = sh.getRow(i+1).getCell(4);
			}
			return data;
		}
		
		private String[] columnNames = {"Naziv",
                "Sifra",
                "Recept",
                "Proizvodjac",
                "Cena"};
		
		private Object[][] data = SH();
		
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
