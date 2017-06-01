package cn.bst.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bst.model.Shares;
import cn.bst.service.ShareHendle;

public class GetArticleListAction extends ActionSupport {
	private String tag;
	@Override
	public String execute() throws Exception {
		List<Shares> list = ShareHendle.getSharesList(tag);
		Map session = ActionContext.getContext().getSession();
		session.put("List", list);
		return SUCCESS;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
