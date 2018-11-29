package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeToPrint02 {

	public static void main(String[] args) {
	
		String saveFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw ;
		
		try {
			pw = new PrintWriter(saveFile) ;
			for(int i= 0 ; i < 30 ; i++) {
				pw.print(i + 1); 
				pw.print(":");
				pw.print((int)(Math.random()*(100-50+1)) + 50);
				pw.print(":");
				pw.print((int)(Math.random()*(100-50+1)) + 50);
				pw.print(":");
				pw.print((int)(Math.random()*(100-50+1)) + 50);
				
				int intSum = (int)(Math.random()*(100-50+1)) + 50;
				intSum += (int)(Math.random()*(100-50+1)) + 50;
				intSum += (int)(Math.random()*(100-50+1)) + 50;
				pw.print(intSum); // 실제 값들의 합과 intSum의 값이 불일치
			}
			pw.close();
			System.out.println("성적저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
