package cn.bst.model;

import java.sql.Timestamp;

/**
 * Replys entity. @author MyEclipse Persistence Tools
 */

public class Replys implements java.io.Serializable {

	// Fields

	private Integer id;
	private String commentValue;
	private Timestamp commentTime;
	private String shearIs;
	private String userAccount;

	// Constructors

	/** default constructor */
	public Replys() {
	}

	/** full constructor */
	public Replys(String commentValue, Timestamp commentTime, String shearIs, String userAccount) {
		this.commentValue = commentValue;
		this.commentTime = commentTime;
		this.shearIs = shearIs;
		this.userAccount = userAccount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommentValue() {
		return this.commentValue;
	}

	public void setCommentValue(String commentValue) {
		this.commentValue = commentValue;
	}

	public Timestamp getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}

	public String getShearIs() {
		return this.shearIs;
	}

	public void setShearIs(String shearIs) {
		this.shearIs = shearIs;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

}