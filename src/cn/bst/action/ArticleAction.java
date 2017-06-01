package cn.bst.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bst.service.ShareHendle;

public class ArticleAction extends ActionSupport {
	private Integer id;
	
	@Override
	public String execute() throws Exception {
		ActionContext.getContext().getSession().put("ariticle", new ShareHendle().getShareByID(id));
		return SUCCESS;
	}
}
