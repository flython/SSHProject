package cn.bst.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bst.model.Shares;
import cn.bst.model.SharesDAO;
import cn.bst.service.ShareHendle;

public class NewArticleAction extends ActionSupport {
	private Shares share;
	Map<String, Object> session = ActionContext.getContext().getSession();
	@Override
	public String execute() throws Exception {
		
		if(new ShareHendle(share).saveAsNewShare()) {
			//提交后会不会生成id放在对象里呢，有必要验证一下
			session.put("artId", ((Shares)new SharesDAO().findByExample(share).get(0)).getId());
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
