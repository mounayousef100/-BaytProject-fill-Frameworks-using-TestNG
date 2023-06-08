package com.Bayt.Dataprovider;
import org.testng.annotations.DataProvider;
import com.Bayt.Utility.ExcelUtils;


public class ExcelDataProvider {
	ExcelUtils eat = null ;
	ExcelUtils obj = new ExcelUtils();
	
	@DataProvider(name = "ApplyPage")
	public Object[][] ApplyPage() {
		int rows = obj.getRowCount("ApplyPage");
		int column = obj.getColumnCount("ApplyPage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("ApplyPage", j, i + 2);
			}
		}
		return data;
	}
	
	
}
