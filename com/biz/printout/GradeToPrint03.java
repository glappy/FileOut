package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeToPrint03 {

	public static void main(String[] args) {
	
		String saveFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw ;
		
		try {
			pw = new PrintWriter(saveFile) ;
			for(int i= 0 ; i < 30 ; i++) {
				pw.print(i + 1); 
				pw.print(":");
				
				int intKor =(int)(Math.random()*(100-50+1)) + 50; 
				pw.print(intKor);
				pw.print(":");
				
				int intEng =(int)(Math.random()*(100-50+1)) + 50;
				pw.print(intEng);
				pw.print(":");
				
				int intMat =(int)(Math.random()*(100-50+1)) + 50;
				pw.print(intMat);
				pw.print(":");
				
				int intSum = intKor ;
				intSum += intEng ;
				intSum += intMat ;
				pw.println(intSum) ;
			}
			pw.close();
			System.out.println("성적저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
