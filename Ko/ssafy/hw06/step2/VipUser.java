package com.ssafy.hw06.step2;

public class VipUser extends User {
	private String grade;
	private int point;

	public VipUser() {
		super();
	}

	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age);
		// TODO Auto-generated constructor stub
		this.grade = grade;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return super.toString() + "VipUser [grade=" + grade + ", point=" + point + "]";
	}

}
