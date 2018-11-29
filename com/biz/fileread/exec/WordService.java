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

public class WordService {
	private String readFile;
	private List<WordVO> wordList;
	private WordVO wordVO ;

	// WordService 클래스의 생성자
	// WordService w = new WordService()문장이 실행되면 호출되는 method
	public WordService() {
		readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";
		wordList = new ArrayList();
	}

	public void makeWordList() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);

			// TODO 문자열 읽어서 wordList에 담기
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
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void playGame() {

		// TODO 게임 시작 부분
		Scanner scanner = new Scanner(System.in);
		int intPass = 0;
		int intFail = 0;

		// TODO 단어게임 시작
		while (intFail < 5) {
			Collections.shuffle(wordList);
			WordVO vo = wordList.get(0);

			int wordCount = wordList.size();
			int intIndex = (int) (Math.random() * wordCount);
			vo = wordList.get(intIndex);

			System.out.println("다음 풀이에 맞는 영단어를 입력하세요");
			System.out.println(vo.getStrKor());
			System.out.print(">> (종료하려면 --END )");

			String inputEng = scanner.nextLine();
			if (inputEng.equals("--END")) {
				break;
			}
			// TODO 정답 판별
			if (inputEng.equalsIgnoreCase(vo.getStrEng())) {
				System.out.println("참 잘했어요");
				intPass++;

			} else {
				System.out.println("좀더생각해봐요");
				System.out.println(vo.getStrEng());
				intFail++;

			}
			System.out.println("------------------------------");
			System.out.println("맞은개수" + intPass);
			System.out.println("틀린개수" + intFail);
			System.out.println("=====================");

		}
		System.out.println("다시 공부하고 오세요");
	}
}