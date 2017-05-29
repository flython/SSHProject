package cn.bst.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class GetReplyListAction
 */
@WebServlet("/GetReplyListAction")
public class GetReplyListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetReplyListAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		JSONObject data = new JSONObject();
		List<Replys> rp = ReplyHendle.getReplysByID(new JSONObject(WebDataUtils.getDataFromRequest(request)).getInt("id"));
		if(rp.size() > 0) {
			data.put("msg", true);
			data.put("data", GSONUtils.toJson(rp));
		}
		else {
			data.put("msg", false);
		}
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
