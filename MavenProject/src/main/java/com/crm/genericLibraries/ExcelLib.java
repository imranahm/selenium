package com.crm.genericLibraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String path="./src/test/resources/testData.xlsx";
	public String getExcelData(String sheetname,int rownum,int column) throws Throwable
	{
		FileInputStream fis= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		String data=row.getCell(column).getStringCellValue();
		wb.close();
		return data;
	}
	
	public void setExcelData(String sheetname,int rownum,int column,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cel=row.createCell(column);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
