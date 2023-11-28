package com.sprApp1;

public class Student {
	private int sid;
	private String sName;
	private double sFee;
	private int s1,s2,s3;
	

	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public double getsFee() {
		return sFee;
	}


	public void setsFee(double sFee) {
		this.sFee = sFee;
	}


	public int getS1() {
		return s1;
	}


	public void setS1(int s1) {
		this.s1 = s1;
	}


	public int getS2() {
		return s2;
	}


	public void setS2(int s2) {
		this.s2 = s2;
	}


	public int getS3() {
		return s3;
	}


	public void setS3(int s3) {
		this.s3 = s3;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sFee=" + sFee + ", s1=" + s1 + ", s2=" + s2 + ", s3="
				+ s3 + "]";
	}


	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	public static String checkGrade(int tot) {
		String gra="";
		if(tot>=85) { gra=" A grade";}
		else if(tot>=75&&tot<85) {  gra="B grade" ;}
		else if(tot>=60&& tot<75) {gra="C grade";}
		else if(tot>=45&& tot<60) {gra="D grade";}
		else { gra="F grade" ;}
		return gra;
	}
    public  void printFormat() {
    	int total=s1+s2+s3;
    	double avgs=total/3;
    	String grade =checkGrade((int)avgs);
    	System.out.println("StudentId:"+sid+"\nStudentName:"+sName+"\nStudentFee:"+sFee+"\nSubject1 Mark :"+s1+"\n Subject2 Mark :"+s2+"\n Subject3 Mark:"+s3+"\n Total Marks:"+total+"\n Average Marks:"+avgs+"\n Grade :"+grade);
    }
}
