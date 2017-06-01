package cn.bst.action;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bst.model.Replys;
import cn.bst.service.ReplyHendle;
import cn.bst.utils.WebDataUtils;

public class GetReplyList extends ActionSupport {
	private Integer id;
	
	@Override
	public String execute() throws Exception {
		List<Replys> rp = ReplyHendle.getReplysByID(id);
		if(rp.size() > 0){
			Map session = ActionContext.getContext().getSession();
			session.put("list", rp);
			return SUCCESS;
		}
		else {
			
			return ERROR;
		}
	}
}
