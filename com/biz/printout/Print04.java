package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print04 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/my2.txt";

		PrintWriter pw;
		try {
			pw = new PrintWriter(printFile);
			pw.println("반가워요");
			pw.println("날씨가 좋지요?");

			for (int i = 0; i < 10; i++) {
				int rndNum1 = (int) (Math.random() * 100) + 1;
				int rndNum2 = (int) (Math.random() * 100) + 1;
				pw.print(rndNum1);
				pw.print(" + ");
				pw.print(rndNum2);
				pw.print(" = ");
				pw.print(rndNum1 + rndNum2);
			}
			pw.close();
			System.out.println("파일작성완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}