package com.Obj;

public class EmployeeBean {
	private int empid;
	private String empname;
	private AddressBean addbean;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public AddressBean getAddbean() {
		return addbean;
	}

	public void setAddbean(AddressBean addbean) {
		this.addbean = addbean;
	}

	public EmployeeBean() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", addbean=" + addbean + "]";
	}
	

}
