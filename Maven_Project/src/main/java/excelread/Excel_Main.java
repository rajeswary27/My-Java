package excelread;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelCode.getStringData(1,0));
		System.out.println(ExcelCode.getIntegerData(1, 1));
		

}
}