package com.Sett.Cons;

public class Company {

	private int cno;
	private String cname;
	private String loc;

	public Company() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Company(int cno, String cname, String loc) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Company [cno=" + cno + ", cname=" + cname + ", loc=" + loc + "]";
	}

}
