package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAndPrintWrite02 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/filePrint02.txt";
		FileWriter fw;
		PrintWriter pw;

		try {
			fw = new FileWriter(printFile);
			pw = new PrintWriter(fw);
			pw.println("-----------------------------------------------------");
			pw.println("학번    국어    영어    수학    총점    평균");
			pw.println("-----------------------------------------------------");
			for (int i = 0; i < 100; i++) {
				int intNum = i + 1;
				int intKor = (int) (Math.random() * (100 - 50 + 1)) + 50;
				int intEng = (int) (Math.random() * (100 - 50 + 1)) + 50;
				int intMat = (int) (Math.random() * (100 - 50 + 1)) + 50;
				pw.printf("%05d %5d   %5d   %5d\r\n", intNum, intKor, intEng, intMat);
			}
			pw.close();
			fw.close();
			System.out.println("저장완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
