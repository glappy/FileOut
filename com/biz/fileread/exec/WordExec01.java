package com.biz.fileread.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.fileread.vo.WordVO;

public class WordExec01 {

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
		//try가 끝난 부분에서 사용할 수 있는 변수는 String, List. 
		//buffer와 fr은 close돼서 사용할 수 없음.

		for(int i = 0 ; i < wordList.size() ; i++) {
			WordVO vo = wordList.get(i) ;
		//	System.out.print(vo.getStrKor() + "\t/");
		//	System.out.println(vo.getStrEng());
						
		}
		
		Collections.shuffle(wordList);
		System.out.println("다음 단어는 무슨 뜻인가요?");
		System.out.println(wordList.get(0).getStrKor());
	}
}
