package com.Obj;

public class AddressBean {
	private int hno;
	private String name;
	private String state;

	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", name=" + name + ", state=" + state + "]";
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public AddressBean() {
		super();
	}

}
