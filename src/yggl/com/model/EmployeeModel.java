package yggl.com.model;

import java.util.Date;

public class EmployeeModel {

	
	private String id;
	private String name;
	private String sex;
	private String phone;
	private String idcard;
	private String aihao;
	private Date birthdate;
	
	
	
	public EmployeeModel(String id, String name, String sex, String phone,
			String idcard, String aihao, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.idcard = idcard;
		this.aihao = aihao;
		this.birthdate = birthdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getAihao() {
		return aihao;
	}
	public void setAihao(String aihao) {
		this.aihao = aihao;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", phone=" + phone + ", idcard=" + idcard + ", aihao="
				+ aihao + ", birthdate=" + birthdate + "]";
	}
	
	
}
