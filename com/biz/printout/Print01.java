package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Print01 {

	public static void main(String[] args) {

		int intNum = 30;
		System.out.println(intNum);

		for (int i = 0; i < 100; i++) {
			intNum = (int) (Math.random() * 100) + 1;
			System.out.println(intNum);
		}
		InputStream in = System.in;
		Scanner scan = new Scanner(in);

	}
}