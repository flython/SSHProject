package cn.bst.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.bst.model.Users;
import cn.bst.service.UserHendle;
import cn.bst.utils.GSONUtils;
import cn.bst.utils.WebDataUtils;

/**
 * Servlet implementation class UpdateUserInfoAction
 */
@WebServlet("/UpdateUserInfoAction")
public class UpdateUserInfoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInfoAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		JSONObject data = new JSONObject();
		Users user = GSONUtils.fromJson(WebDataUtils.getDataFromRequest(request), Users.class);
		UserHendle uh = new UserHendle(user);
		if(!uh.getUser().getHeadImage().endsWith("head.jpg")){
			uh.updateHeadImage(request.getServletContext().getRealPath("/") + "img\\head");
		}
		data.put("msg", uh.updateUser());
		data.put("data", GSONUtils.toJson(uh.getUser()));
		WebDataUtils.sendDataToRespounse(data.toString(), response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
