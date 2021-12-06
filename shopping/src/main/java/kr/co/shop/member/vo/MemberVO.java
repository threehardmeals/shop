package kr.co.shop.member.vo;

public class MemberVO {
	private int id, point;
	private String userid, password, name, email, phone, joinday;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public int getPoint() {
		return this.point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getJoinday() {
		return this.joinday;
	}
	public void setJoinday(String joinday) {
		this.joinday = joinday;
	}
}
