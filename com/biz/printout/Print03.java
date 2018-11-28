package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.String;
import java.lang.System;

public class Print03 {
	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/my1.txt";
		try {
			PrintWriter pw = new PrintWriter(printFile);
			pw.println("반갑습니다");
			pw.println("여러분");
			pw.close();
			System.out.println("파일저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}