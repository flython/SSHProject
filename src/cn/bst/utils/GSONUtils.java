package cn.bst.utils;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GSONUtils {

	/**
	 * 对象转换成json字符串
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}

	/**
	 * json字符串转成对象
	 * 
	 * @param jsonData
	 * @param type
	 * @return
	 */
	public static <T> T fromJson(String jsonData, Type type) {
		Gson gson = new Gson();
		return gson.fromJson(jsonData, type);
	}

	/**
	 * json字符串转成对象
	 * 
	 * @param jsonData
	 * @param type
	 * @return
	 */
	public static <T> T fromJson(String jsonData, Class<T> type) {
		Gson gson = new Gson();
		return gson.fromJson(jsonData, type);
	}

	/**
	 * 将Json数组解析成相应的映射对象列表
	 * 
	 * @param jsonData
	 * @param type
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> fromJsons(String jsonData, Class<T> type) {
		Gson gson = new Gson();
		List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {
		}.getType());
		return result;
	}
	
}
