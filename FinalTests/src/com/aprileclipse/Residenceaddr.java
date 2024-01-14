package com.aprileclipse;

public class Residenceaddr {
	int vaddid;
	String surveyno,building,area,pincode,city,state;
	public Residenceaddr() {
		// TODO Auto-generated constructor stub
	}
	public Residenceaddr(int vaddid, String surveyno, String building, String area, String pincode, String city,
			String state) {
		super();
		this.vaddid = vaddid;
		this.surveyno = surveyno;
		this.building = building;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	public int getVaddid() {
		return vaddid;
	}

	public void setVaddid(int vaddid) {
		this.vaddid = vaddid;
	}

	public String getSurveyno() {
		return surveyno;
	}

	public void setSurveyno(String surveyno) {
		this.surveyno = surveyno;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Residenceaddr [vaddid=" + vaddid + ", surveyno=" + surveyno + ", building=" + building + ", area="
				+ area + ", pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
