package com.biz.printout.vo;

public class GradeVO {

	private String strNum ;
	private int intKor ;
	private int intEng ;
	private int intMat ;
	private int intSum ;
	private float floatAve ;
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMat() {
		return intMat;
	}
	public void setIntMat(int intMat) {
		this.intMat = intMat;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAve() {
		return floatAve;
	}
	public void setFloatAve(float floatAve) {
		this.floatAve = floatAve;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMat=" + intMat
				+ ", intSum=" + intSum + ", floatAve=" + floatAve + "]";
	}
	
}