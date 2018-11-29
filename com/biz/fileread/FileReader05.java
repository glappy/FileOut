package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader05 {
	public static void main(String[] args) {
		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";

		List<String> wordList = new ArrayList();

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

				wordList.add(words[0]);
			}
			buffer.close();
			fr.close();
			// 읽기용으로 사용한 buffer, FileReader는 닫지 않아도 큰 문제는 없으나 파일을 읽은 후 다른 연산을 수행해야 한다면 닫아주는 것이 좋다
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}