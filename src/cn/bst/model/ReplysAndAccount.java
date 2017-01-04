package cn.bst.model;

/**
 * ReplysAndAccount entity. @author MyEclipse Persistence Tools
 */

public class ReplysAndAccount implements java.io.Serializable {

	// Fields

	private ReplysAndAccountId id;

	// Constructors

	/** default constructor */
	public ReplysAndAccount() {
	}

	/** full constructor */
	public ReplysAndAccount(ReplysAndAccountId id) {
		this.id = id;
	}

	// Property accessors

	public ReplysAndAccountId getId() {
		return this.id;
	}

	public void setId(ReplysAndAccountId id) {
		this.id = id;
	}

}