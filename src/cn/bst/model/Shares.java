package cn.bst.model;

import java.sql.Timestamp;

/**
 * Shares entity. @author MyEclipse Persistence Tools
 */

public class Shares implements java.io.Serializable {

	// Fields

	private Integer id;
	private String photo;
	private String title;
	private String tag;
	private String userAccount;
	private Timestamp shareTime;

	// Constructors

	/** default constructor */
	public Shares() {
	}

	/** full constructor */
	public Shares(String photo, String title, String tag, String userAccount, Timestamp shareTime) {
		this.photo = photo;
		this.title = title;
		this.tag = tag;
		this.userAccount = userAccount;
		this.shareTime = shareTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Timestamp getShareTime() {
		return this.shareTime;
	}

	public void setShareTime(Timestamp shareTime) {
		this.shareTime = shareTime;
	}

}