package com.biz.fileread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
/*
 * 파일을 저장할 때는 몇개를 저장하는지 알지만 불러올때는 대개 그 개수를 알 수 없다
 * 읽는 방법에 대해 생각해볼 필요가 있다
 */
	public static void main(String[] args) {
		
		String readFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		FileReader fr ;
		
				try {
					fr = new FileReader(readFile) ;
					// 몇변 반복해야 하는지 모르는 경우는 while을 사용하는 것이 좋으며 기본원칙이다.
					for(int i = 0 ; i < 30 ; i++) {
					int intRead = fr.read();
					System.out.print((char)intRead);
					}
					
					while(true) {
						int intRead = fr.read() ;
						if(intRead < 0) {
							break ;
						}
						System.out.println((char) intRead);
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
