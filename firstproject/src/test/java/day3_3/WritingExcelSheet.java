package day3_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelSheet {

	public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\skotapat\\Downloads\\EMI_Calculator.xls");
		FileInputStream ip = new FileInputStream(file);
// to handle the workbook : XSSFWorkbook
		HSSFWorkbook wb = new HSSFWorkbook(ip);
//to access the specific sheet from the workbook: XSSFSheet
		HSSFSheet sheet=wb.getSheet("EMI Calculator");;

		 //Create a row object to retrieve row at index 1
        HSSFRow row2=sheet.getRow(1);
        
        //Create a cell object to retreive cell at index 5
        HSSFCell cell=row2.getCell(5);
        
        //Get the address in a variable
        String address= cell.getStringCellValue();
        
        //Printing the address
        System.out.println("Address is :"+ address);
		FileOutputStream out = new FileOutputStream("./Demo.xlsx");
		wb.write(out);
		System.out.println("Writing done....!!");
		wb.close();
		out.close();
		ip.close();

	}

}
