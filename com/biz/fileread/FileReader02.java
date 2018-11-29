package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {
	/*
	 * 파일을 저장할 때는 몇개를 저장하는지 알지만 불러올때는 대개 그 개수를 알 수 없다 읽는 방법에 대해 생각해볼 필요가 있다
	 */
	public static void main(String[] args) {

		String readFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		FileReader fr;

		// TextFile을 읽을 때는 FileReader를 다른 Reader에 연결해서 읽는 것이 편리하다
		BufferedReader buffer;

		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);

			while (true) {
				String strLine = buffer.readLine();
				if (strLine == null) {
					break;
				}
				System.out.println(strLine);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
