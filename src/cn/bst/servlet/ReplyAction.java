package cn.bst.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.bst.model.Replys;
import cn.bst.service.ReplyHendle;
import cn.bst.utils.GSONUtils;
import cn.bst.utils.WebDataUtils;

/**
 * Servlet implementation class ReplyAction
 */
@WebServlet("/ReplyAction")
public class ReplyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		Replys reply = GSONUtils.fromJson(WebDataUtils.getDataFromRequest(request), Replys.class);
		JSONObject data = new JSONObject();
		data.put("msg", new ReplyHendle(reply).saveAsNewReply());
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
