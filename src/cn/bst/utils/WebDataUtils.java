package cn.bst.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

public class WebDataUtils {
	/**
	 * 用来获取request里的一行数据，使用BufferReader
	 * 
	 * @param request
	 * @return
	 */
	public static String getDataFromRequest(HttpServletRequest request) {
		String data = null;
		BufferedReader br = null;
		try {
			
			request.setCharacterEncoding("utf-8");
			br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			if ((data = br.readLine()) == null) {
				throw new JSONException("获取不到数据");
			}
		} catch (IOException e) {
			// TODO 需要处理异常
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//输入提示
		System.out.println("收到了:\t\t" + data);
		return data;
	}

	public static boolean sendDataToRespounse(String data, HttpServletResponse response) {
		boolean reply = true;
		BufferedWriter bw = null;
		DataOutputStream dos = null;
		response.setCharacterEncoding("utf-8");
		try {
			bw = new BufferedWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
			bw.write(data);
			bw.flush();
//			dos = new DataOutputStream(response.getOutputStream());
//			dos.write("hahaha".getBytes());
//			dos.flush();
//			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reply = false;
		}finally {
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("发送了:\t\t" + data);
		return reply;
	}
}
