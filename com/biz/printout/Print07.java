package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print07 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(printFile);
			pw.println("============");
			pw.println("구구단 5단");
			pw.println("============");
			for (int i = 0; i < 9; i++) {
				pw.printf("%d * %d = %2d \r\n", 5, (i + 1), (i + 1) * 5);

			}
			pw.println("============");
			pw.close();
			System.out.println("구구단 작성 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}