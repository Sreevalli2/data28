package day3_2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		//to read the data from excel sheet
		//1.to connect to the excel file :file input stream
		//File file=new File("C:\\Users\\skotapat\\eclipse-workspace2\\firstproject\\test3.xlsx");
        FileInputStream ip=new FileInputStream("./test3.xlsx");
        //to handle the workbook:xssfworkbook
        XSSFWorkbook wb=new XSSFWorkbook(ip);
        //to refer or access a specific sheet from the workbook
        XSSFSheet sh=wb.getSheet("data");//index starts from 1//by name
        System.out.print(sh.getRow(0).getCell(0));
        System.out.print(sh.getRow(0).getCell(1));
        System.out.print(sh.getRow(0).getCell(2));
        int rowcount=sh.getPhysicalNumberOfRows();
        int columncount=sh.getRow(0).getPhysicalNumberOfCells();
        int totalcells=rowcount*columncount;
        System.out.println("rows:"+rowcount+"Coulnms:"+columncount+"Totalcells:"+totalcells);
        for (int i=0;i<rowcount;i++) {
        	for(int j=0;j<columncount;j++)
        	{
        		System.out.println(sh.getRow(i).getCell(j)+" ");
        	}
        	System.out.println();
        }
        }
        
        
	}


