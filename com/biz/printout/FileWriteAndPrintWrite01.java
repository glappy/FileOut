package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAndPrintWrite01 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/filePrint01.txt";

		FileWriter fw;
		PrintWriter pw;

		try {
			fw = new FileWriter(printFile, true);
			pw = new PrintWriter(fw);

			for (int i = 0; i < 10; i++) {
				pw.println("대한민국 : " + i);
			}
			pw.close();
			fw.close();
			System.out.println("완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
