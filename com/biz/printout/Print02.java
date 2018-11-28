package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print02 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/my.txt";
		printFile = "D:/bizwork/workspace/ExFiles/my.txt";

		PrintWriter pw;

		try {
			pw = new PrintWriter(printFile);

			for (int i = 0; i < 100; i++) {
				int intNum = (int) (Math.random() * 100) + 1;
				pw.println(intNum);
			}
			pw.close();
			System.out.println("파일저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}