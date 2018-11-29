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

public class WordExe04 {

	public static void main(String[] args) {
		//	TODO main 시작
		
		//TODO 전역변수 선언부
		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";

		List<WordVO> wordList = new ArrayList();
		FileReader fr;
		BufferedReader buffer;

		
		// TODO 파일 읽기 객체 초기화 생성
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
		// try가 끝난 부분에서 사용할 수 있는 변수는 String, List.
		// buffer와 fr은 close돼서 사용할 수 없음.

		// scanner처럼 장치와 관련된 class는 한 code에서 여러번 생성하는 것은 좋지 않다
		Scanner scanner = new Scanner(System.in);
		int intPass = 0;
		int intFail = 0;
		
		//  TODO 단어게임 시작
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