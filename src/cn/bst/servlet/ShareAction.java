package cn.bst.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import cn.bst.model.Shares;
import cn.bst.service.ShareHendle;
import cn.bst.utils.GSONUtils;
import cn.bst.utils.WebDataUtils;

/**
 * Servlet implementation class ShareAction
 */
@WebServlet("/ShareAction")
public class ShareAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//图片上传，使用base64加密图片，然后�?�过json传输
		request.setCharacterEncoding("utf-8");
		Shares share = GSONUtils.fromJson(WebDataUtils.getDataFromRequest(request), Shares.class);
		JSONObject data = new JSONObject();
		data.put("msg", new ShareHendle(share).saveAsNewShare());
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
