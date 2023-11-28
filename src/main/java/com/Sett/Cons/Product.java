package com.Sett.Cons;

public class Product {

	private int pno;
	private String pname;
	private String state;
	private Company com;

	public Product() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Product(int pno, String pname, String state, Company com) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.state = state;
		this.com = com;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", state=" + state + ", com=" + com + "]";
	}

}
