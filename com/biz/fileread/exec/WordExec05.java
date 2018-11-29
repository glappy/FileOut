package com.biz.fileread.exec;

import java.util.Scanner;

public class WordExec05 {

	public static void main(String[] args) {
		WordService ws = new WordService() ;
		ws.makeWordList();
			
		while(true) {
			ws.playGame();
			System.out.println("=======================");
			System.out.println("게임을 끝내시겠습니까");
			System.out.println("종료(YES) / 계속(NO, ENTER)");
			Scanner scanner = new Scanner(System.in) ;
			String strYesNo = scanner.nextLine();
			if(strYesNo.equals("YES")) {
				System.out.println("게임을 종료합니다");
				System.out.println("GOOD BYE");
				
			}
			
		}
	}
}