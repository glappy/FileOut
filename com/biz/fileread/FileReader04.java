package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader04 {
	public static void main(String[] args) {
		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";

		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);

			while (true) {
				String strWord = buffer.readLine();
				if (strWord == null)
					break;
				strWord.split(":");
				String[] words = strWord.split(":");
				System.out.println(words[0]);
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