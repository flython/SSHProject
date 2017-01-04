package cn.bst.model;

import java.sql.Timestamp;

/**
 * ReplysAndAccountId entity. @author MyEclipse Persistence Tools
 */

public class ReplysAndAccountId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer shearsId;
	private Integer usersId;
	private String content;
	private Timestamp replysTime;
	private String userAccount;
	private String headImage;

	// Constructors

	/** default constructor */
	public ReplysAndAccountId() {
	}

	/** minimal constructor */
	public ReplysAndAccountId(Integer id, Integer shearsId, Integer usersId, String content) {
		this.id = id;
		this.shearsId = shearsId;
		this.usersId = usersId;
		this.content = content;
	}

	/** full constructor */
	public ReplysAndAccountId(Integer id, Integer shearsId, Integer usersId, String content, Timestamp replysTime,
			String userAccount, String headImage) {
		this.id = id;
		this.shearsId = shearsId;
		this.usersId = usersId;
		this.content = content;
		this.replysTime = replysTime;
		this.userAccount = userAccount;
		this.headImage = headImage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getShearsId() {
		return this.shearsId;
	}

	public void setShearsId(Integer shearsId) {
		this.shearsId = shearsId;
	}

	public Integer getUsersId() {
		return this.usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getReplysTime() {
		return this.replysTime;
	}

	public void setReplysTime(Timestamp replysTime) {
		this.replysTime = replysTime;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getHeadImage() {
		return this.headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReplysAndAccountId))
			return false;
		ReplysAndAccountId castOther = (ReplysAndAccountId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getShearsId() == castOther.getShearsId()) || (this.getShearsId() != null
						&& castOther.getShearsId() != null && this.getShearsId().equals(castOther.getShearsId())))
				&& ((this.getUsersId() == castOther.getUsersId()) || (this.getUsersId() != null
						&& castOther.getUsersId() != null && this.getUsersId().equals(castOther.getUsersId())))
				&& ((this.getContent() == castOther.getContent()) || (this.getContent() != null
						&& castOther.getContent() != null && this.getContent().equals(castOther.getContent())))
				&& ((this.getReplysTime() == castOther.getReplysTime()) || (this.getReplysTime() != null
						&& castOther.getReplysTime() != null && this.getReplysTime().equals(castOther.getReplysTime())))
				&& ((this.getUserAccount() == castOther.getUserAccount())
						|| (this.getUserAccount() != null && castOther.getUserAccount() != null
								&& this.getUserAccount().equals(castOther.getUserAccount())))
				&& ((this.getHeadImage() == castOther.getHeadImage()) || (this.getHeadImage() != null
						&& castOther.getHeadImage() != null && this.getHeadImage().equals(castOther.getHeadImage())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getShearsId() == null ? 0 : this.getShearsId().hashCode());
		result = 37 * result + (getUsersId() == null ? 0 : this.getUsersId().hashCode());
		result = 37 * result + (getContent() == null ? 0 : this.getContent().hashCode());
		result = 37 * result + (getReplysTime() == null ? 0 : this.getReplysTime().hashCode());
		result = 37 * result + (getUserAccount() == null ? 0 : this.getUserAccount().hashCode());
		result = 37 * result + (getHeadImage() == null ? 0 : this.getHeadImage().hashCode());
		return result;
	}

}