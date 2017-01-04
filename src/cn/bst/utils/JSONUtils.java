package cn.bst.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {
	public static JSONObject getJSONFromIn(InputStream in){
		JSONObject msg = null;
		String lineString = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		try {
			if((lineString = br.readLine())!=null) {
				msg = new JSONObject(lineString);
			}
			else {
				throw new JSONException("获取不到数据");
			}
		} catch (IOException e) {
			// TODO 需要处理异常
			e.printStackTrace();
		}
		return msg;
	}
	
	
	
	
}
