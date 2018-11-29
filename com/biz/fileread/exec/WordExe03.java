package com.biz.fileread.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.fileread.vo.WordVO;

public class WordExe03 {

	public static void main(String[] args) {

		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";

		List<WordVO> wordList = new ArrayList();
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);

			while (true) {
				String strWord = buffer.readLine();

				if (strWord == null)
					break;
				String[] strWords = strWord.split(":");

				WordVO vo = new WordVO();
				vo.setStrEng(strWords[0]);
				vo.setStrKor(strWords[1]);
				wordList.add(vo);
			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// try가 끝난 부분에서 사용할 수 있는 변수는 String, List.
		// buffer와 fr은 close돼서 사용할 수 없음.

		// scanner처럼 장치와 관련된 class는 한 code에서 여러번 생성하는 것은 좋지 않다
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Collections.shuffle(wordList);
			WordVO vo = wordList.get(0);

			int wordCount = wordList.size();
			int intIndex = (int) (Math.random() * wordCount);
			vo = wordList.get(intIndex);

			System.out.println("다음 풀이에 맞는 영단어를 입력하세요");
			System.out.println(vo.getStrKor());
			System.out.print(">> (종료하려면 --END )");

			String inputEng = scanner.nextLine();

			if (inputEng.equalsIgnoreCase(vo.getStrEng())) {
				System.out.println("참 잘했어요");
			} else {
				System.out.println("좀더생각해봐요");
				System.out.println(vo.getStrEng());
			}
			System.out.println("=====================");
		}

	}

}