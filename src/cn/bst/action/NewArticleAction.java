package cn.bst.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.bst.model.Shares;
import cn.bst.service.ShareHendle;

public class NewArticleAction extends ActionSupport {
	private Shares share;
	@Override
	public String execute() throws Exception {
		
		if(new ShareHendle(share).saveAsNewShare()) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

	public Shares getShare() {
		return share;
	}

	public void setShare(Shares share) {
		this.share = share;
	}
	
	
}
