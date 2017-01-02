package cn.bst.model;

import java.sql.Timestamp;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String account;
	private String psw;
	private Boolean sex;
	private Integer age;
	private String tele;
	private String addr;
	private String image;
	private Timestamp logDate;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String account, String psw, Boolean sex, Integer age, String tele, String addr, String image,
			Timestamp logDate) {
		this.account = account;
		this.psw = psw;
		this.sex = sex;
		this.age = age;
		this.tele = tele;
		this.addr = addr;
		this.image = image;
		this.logDate = logDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTele() {
		return this.tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Timestamp getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Timestamp logDate) {
		this.logDate = logDate;
	}

}