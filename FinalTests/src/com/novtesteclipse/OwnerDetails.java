package com.novtesteclipse;

public class OwnerDetails {
	int oid;
	String ownername, mobile, email;
	public OwnerDetails() {
		// TODO Auto-generated constructor stub
	}
	public OwnerDetails(int oid, String ownername, String mobile, String email) {
		super();
		this.oid = oid;
		this.ownername = ownername;
		this.mobile = mobile;
		this.email = email;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nOwnerDetails [oid=" + oid + ", ownername=" + ownername + ", mobile=" + mobile + ", email=" + email
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
