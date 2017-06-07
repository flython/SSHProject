package cn.bst.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.bst.model.Users;
import cn.bst.service.UserHendle;

public class UsersAction extends ActionSupport {
	Map<String, Object> session = ActionContext.getContext().getSession();
	private Users user;
	
	
	public String doUpdateUserInfo() throws Exception {
		UserHendle uh = new UserHendle(user);
		if(!uh.getUser().getHeadImage().endsWith("head.jpg")){
			uh.updateHeadImage(ServletActionContext.getServletContext().getRealPath("/") + "img\\head");
		}
		session.put("msg", uh.updateUser());
		return SUCCESS;
	}
}
