package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite03 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/fileW03.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(printFile,true);
			for (int i = 0; i < 10; i++) {
				int rndNum = (int) (Math.random() * 100) + 1;
				fw.write("대한민국");
				fw.write(rndNum + "\r\n");
				
			}
			fw.flush() ;
			fw.close();
			System.out.println("파일작성 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}