package excelread;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelCode.getStringData(1,0));
		System.out.println(ExcelCode.getIntegerData(1,1));
		System.out.println(ExcelCode.getStringData(2,0));
		System.out.println(ExcelCode.getIntegerData(2,1));
		System.out.println(ExcelCode.getStringData(3,0));
		System.out.println(ExcelCode.getIntegerData(3,1));
		System.out.println(ExcelCode.getStringData(4,0));
		System.out.println(ExcelCode.getIntegerData(4, 1));
		

}
}