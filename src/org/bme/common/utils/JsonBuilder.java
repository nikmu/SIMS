package org.bme.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import org.apache.commons.io.IOUtils;
import org.bme.common.utils.constants.Constants;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * 项目名称：SIMS（脑卒中信息管理系统）   
 * 类名称：JsonBuilder   
 * 类描述：JSON数据工具类
 * 创建人：张俊   
 * 创建时间：2016年3月8日 下午3:27:20   
 * 修改人：张俊   
 * 修改时间：2016年3月8日 下午3:27:20   
 * 修改备注：   
 * @version 1.0  
 *
 */
@SuppressWarnings("all")
public class JsonBuilder {
	private StringUtil stringUtil = new StringUtil();

	private static class JsonHolder {
		private static final JsonBuilder JSON_BUILDER = new JsonBuilder();
		private static ObjectMapper mapper = new ObjectMapper();
	}

	/**
	 * 将一个对象解析成Json数据格式
	 * 
	 * @param object
	 * @return
	 */
	public String toJson(Object object) {
		try {
			return JsonHolder.mapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 将一个对象解析成Json数据格式
	 * 
	 * @param object
	 * @return JSONObject
	 */
	public JSONObject toJson_ReturnJsonObject(Object object) {
		try {
			return JSONObject.fromObject(JsonHolder.mapper
					.writeValueAsString(object));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String toJson(Object object, int Total, String jsonTitle) {
		try {
			String jsonStr = JsonHolder.mapper.writeValueAsString(object);
			if (0 == Total) {
				return "{" + "\"" + jsonTitle + "\":" + jsonStr + "}";
			}else {
				return "{" + "\"total\":" + Total + "," + "\"" + jsonTitle + "\":"
						+ jsonStr + "}";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 传入需要转换的List以及封装成json对应的key的名称，就能转换成json格式的字符串。
	 * 
	 * @param List
	 * @param jsonTitle
	 * @return
	 */
	public String toJson(Object object, String jsonTitle) {
		return toJson(object, 0, jsonTitle);
	}

	public String toString(Object obj) {
		ObjectMapper objectMapper = null;
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		String jsonString = "{}";
		if (null == objectMapper) {
			objectMapper = new ObjectMapper();
		}
		try {
			JsonGenerator jsonGenerator = new ObjectMapper().getJsonFactory()
					.createJsonGenerator(byteOutput, JsonEncoding.UTF8);
			objectMapper.writeValue(jsonGenerator, obj);
			jsonString = byteOutput.toString(JsonEncoding.UTF8.getJavaName());
		} catch (IOException e) {
		} finally {
			IOUtils.closeQuietly(byteOutput);
		}
		return jsonString;
	}
	
	/**
	 * 将一个对象解析成Json数据格式
	 * 
	 * @param object
	 * @return
	 */
//	public String pageModelToJson(PageModel<?> pm, String jsonTitle) {
//		try {
//			int Total = pm.getTotal();
//			List<?> list = pm.getList();
//			String jsonStr = toJson(list, Total, jsonTitle);
//			return (jsonStr);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "";
//		}
//	}

	/**
	 * 将一个Json字条串闭装成指定类型对象
	 * 
	 * @param json
	 * @param c
	 * @return
	 */
	public Object fromJson(String json, Class c) {
		json = clearJson(json);
		try {
			return JsonHolder.mapper.readValue(json, c);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 格式化json成一个数组
	 * 
	 * @param json
	 * @return
	 */
	public String jsonArrayFormat(String json) {
		if (!json.startsWith("[")) {
			json = "[" + json + "]";
		}
		return json;
	}

//	/**
//	 * json数组转对象数组
//	 * 
//	 * @param json
//	 * @param c
//	 * @return
//	 */
//	public Object[] jsonToEntity(String json, Class<?> c, String excludes) {
//		JsonConfig jsonConfig = null;
//		int length = 0;
//		jsonConfig = new JsonConfig();
//		jsonConfig.setExcludes(excludes.split(","));
//		JSONArray array = JSONArray.fromObject(jsonArrayFormat(json),
//				jsonConfig);
//		length = array.size();
//		Object[] objects = new Object[length];
//		for (int i = 0; i < length; i++) {
//			JSONObject jsonObject = array.getJSONObject(i);
//			objects[i] = JSONObject.toBean(jsonObject, JsonTreeNode.class);
//		}
//		return objects;
//	}

//	public Object[] requestToEntity(HttpServletRequest request, Class<?> c,
//			String excludes) {
//		StringBuffer json = new StringBuffer();
//		String line = null;
//		BufferedReader reader = null;
//		try {
//			reader = request.getReader();
//			while ((line = reader.readLine()) != null) {
//				json.append(line);
//			}
//		} catch (IOException e) {
//			return null;
//		}
//		return jsonToEntity(json.toString(), c, excludes);
//	}

	/**
	 * 将一个JsonArray数据转成一个List的键值对[{name:'hhl'}]
	 * 
	 * @param json
	 * @return
	 */
	public List<Map> fromJsonArray(String json) {
		json = clearJson(json);
		return (List<Map>) fromJson(json, ArrayList.class);
	}

	/**
	 * 为操作成功返回Json
	 * 
	 * @param strDate
	 * @return
	 */
	public String returnSuccessJson(String strDate, Object model) {
		StringBuffer sb = new StringBuffer();
		sb.append("{success:true,info:");
		sb.append("'" + strDate + "'");
		if (null != model) {
			StringWriter sw = new StringWriter();
			try {
				JsonHolder.mapper.writeValue(sw, model);
				sb.append(",model:");
				sb.append(sw);
				sw.close();
			} catch (Exception e) {
				try {
					sw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		sb.append("}");
		return sb.toString();
	}

	/**
	 * 为操作失败返回Json
	 * 
	 * @param strDate
	 * @return
	 */
	public String returnFailureJson(String strDate, Object model) {
		StringBuffer sb = new StringBuffer();
		sb.append("{success:false,info:");
		sb.append("'" + strDate + "'");
		if (null != model) {
			StringWriter sw = new StringWriter();
			try {
				JsonHolder.mapper.writeValue(sw, model);
				sb.append(",model:");
				sb.append(sw);
				sw.close();
			} catch (Exception e) {
				try {
					sw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		sb.append("}");
		return sb.toString();
	}

	/**
	 * 为分布列表提供Json封装
	 * 
	 * @param count
	 * @param list
	 * @return
	 */
	public String buildObjListToJson(Long count, Collection recods,
			boolean listJson) {
		try {
			StringBuffer sb = new StringBuffer();
			if (listJson) {// 判断是否展示list的数据
				sb.append("{totalCount:" + count + ",rows:");
			} else {
				sb.append("");
			}
			// 构建集合的json数据
			StringWriter sw = new StringWriter();
			JsonHolder.mapper.writeValue(sw, recods);
			sb.append(sw);
			sw.close();
			if (listJson) {
				sb.append("}");
			} else {
				sb.append("");
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 格式化Json去掉回车
	 * 
	 * @param json
	 * @return
	 */
	public String clearJson(String json) {
		if (stringUtil.isNotEmpty(json)) {
			return json.replaceAll("\n", "");
		} else {
			return null;
		}
	}

	/**
	 * 把json数据转成sql
	 * 
	 * @param jsonSql
	 *            [{sql:''}] ["asd","asd"]
	 * @return
	 */
	public String[] jsonSqlToString(String jsonSql) {
		Object[] os = JSONArray.fromObject(jsonSql).toArray();
		String[] sqls = new String[os.length];
		for (int i = 0; i < os.length; i++) {
			// 使用JSONObject和sql键出值
			JSONObject jo = (JSONObject) os[i];
			String j = (String) jo.get("sql");
			sqls[i] = j;
		}
		return sqls;
	}

	/**
	 * 构建对象json数据[{},{},{}]
	 * 
	 * @param values
	 * @param excludes
	 * @return
	 */
	public String buildList(List<?> values, String excludes) {
		StringBuffer returnJson = new StringBuffer("[");
		for (Object obj : values) {
			// 声明json配置对象
			JsonConfig cfg = new JsonConfig();
			if (StringUtil.isNotEmpty(excludes)) {
				String[] excluds = excludes.split(",");
				if (excluds.length > 0) {
					// 增加排除属性数组
					cfg.setExcludes(excluds);
				}
			}
			// 设置循环策略为忽略，避免死循环
			cfg.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			JSONObject jsonObject = JSONObject.fromObject(obj, cfg);
			returnJson.append(jsonObject.toString() + Constants.STR_SPLIT);
		}
		if (values.size() > 0) {
			returnJson.deleteCharAt(returnJson.length() - 1);
		}
		returnJson.append("]");
		return returnJson.toString();
	}

	public String buildList(Collection<?> values, String excludes) {
		StringBuffer returnJson = new StringBuffer("[");
		for (Object obj : values) {
			// 声明json配置对象
			JsonConfig cfg = new JsonConfig();
			if (StringUtil.isNotEmpty(excludes)) {
				String[] excluds = excludes.split(",");
				if (excluds.length > 0) {
					// 增加排除属性数组
					cfg.setExcludes(excluds);
				}
			}
			// 设置循环策略为忽略，避免死循环
			cfg.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
			JSONObject jsonObject = JSONObject.fromObject(obj, cfg);
			returnJson.append(jsonObject.toString() + Constants.STR_SPLIT);
		}
		if (values.size() > 0) {
			returnJson.deleteCharAt(returnJson.length() - 1);
		}
		returnJson.append("]");
		return returnJson.toString();
	}

	/**
	 * 构建对象json数据
	 * 
	 * @param values
	 *            数据集合
	 * @param excludes
	 *            忽略的列
	 * @return
	 */
	public String buildList(Long total, String roots,
			Collection<? extends Object> values, String excludes) {
		StringBuffer sb = new StringBuffer();
		sb.append("{total:" + total + "," + roots + ":[");
		JsonConfig cfg = new JsonConfig();
		String[] excluds = null;
		if (StringUtil.isNotEmpty(excludes)) {
			excluds = excludes.split(",");
			if (excludes.length() > 0) {
				cfg.setExcludes(excluds);
			}
		}
		cfg.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		for (Object object : values) {
			// 声明json配置对象
			// 设置循环策略为忽略、避免死循环
			JSONObject jsonObject = JSONObject.fromObject(object, cfg);
			sb.append(jsonObject.toString() + ",");
		}
		if (values.size() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]}");
		return sb.toString();
	}

//	public String getModelFields(String modelName, Field[] fields,
//			String exclude) {
//		List<ExtField> list = new ArrayList<ExtField>();
//		for (Field field : fields) {
//			boolean flag = false;
//			String[] excludes = null;
//			if (null != exclude) {
//				excludes = exclude.split(Constants.STR_SPLIT);
//				for (String ex : excludes) {
//					if (field.getName().equals(ex)) {
//						flag = true;
//						break;
//					}
//				}
//			}
//			if (flag) {
//				continue;
//			}
//			boolean excludeFlag = false;
//			String fieldType = field.getType().getSimpleName().toLowerCase();// 获取字段类型名称
//			if (fieldType.equals("double")) {
//				fieldType = ExtFieldType.FLOAT;
//			} else if (fieldType.equals("long")) {
//				fieldType = ExtFieldType.INT;
//			} else if (fieldType.equals("bigdecimal")) {
//				fieldType = ExtFieldType.INT;
//			} else if (fieldType.equals("timestamp")) {
//				fieldType = ExtFieldType.INT;
//			} else if (fieldType.equals("date")) {
//				fieldType = ExtFieldType.STRING;
//			} else if (fieldType.equals("integer")) {
//				fieldType = ExtFieldType.INT;
//			} else {
//				excludeFlag = true;
//			}
//			ExtField extField = new ExtField(field.getName(), fieldType);
//			if (!flag) {
//				list.add(extField);
//			}
//		}
//		ModelUtil.modelFieldsJson.put(modelName, toJson(list));
//		return toJson(list);
//	}
	
	/**
	 * Json装Map
	 * @param jsonObj 需要转换的json对象
	 * @return
	 */
	public static Map<String,String> jsonToMap(JSONObject jsonObj) {
		Map<String,String> map = new HashMap();
		Iterator keys = jsonObj.keys();
		String key = "";
		String value = "";
		while (keys.hasNext()) {
			key = (String) keys.next();
			value = jsonObj.get(key).toString();
			map.put(key, value);
		}
		return map;
	}
	
	//--------------------------------以下为新增的方法，主要是借鉴“室内质控项目”------------
	// 将接收到的流转换为JSONObject对象（单一Model操作），该方法在调用时只需传入已转换好的Stream字符串
	public static JSONObject strToJsonObj(String strParm) {
		JSONObject jsonObj = JSONObject.fromObject(strParm);
		return jsonObj;
	}

	// 将接收到的流转换为JSONObject对象（单一Model操作）
	public JSONObject streamToJSONObject(HttpServletRequest req)
			throws IOException {
		JSONObject jsonObject = JSONObject
				.fromObject(getStream(req).toString());
		return jsonObject;
	}
	
	// 将接收到的流转换为JSONObject对象（单一Model操作），该方法在调用时只需传入已转换好的Stream字符串
	public JSONObject streamToJSONObject(String streamStr) throws IOException {
		JSONObject jsonObject = JSONObject.fromObject(streamStr);
		return jsonObject;
	}
	
	// 将接收到的流转换为JSONObject对象（多个Model操作）
	public JSONArray streamToJSONArray(HttpServletRequest req)
			throws IOException {
		JSONArray jsonArray = JSONArray.fromObject(getStream(req).toString());
		return jsonArray;
	}

	// 将接收到的流转换为JSONObject对象（多个Model操作），该方法在调用时只需传入已转换好的Stream字符串
	public JSONArray streamToJSONArray(String streamStr) throws IOException {
		JSONArray jsonArray = JSONArray.fromObject(streamStr);
		return jsonArray;
	}
	
	// 获取前台通过流传输的数据
	public StringBuffer getStream(HttpServletRequest req) throws IOException {
		StringBuffer info = new StringBuffer();
		InputStream in = req.getInputStream();
		BufferedInputStream buf = new BufferedInputStream(in);
		byte[] buffer = new byte[1024];
		int iRead;
		while ((iRead = buf.read(buffer)) != -1) {
			info.append(new String(buffer, 0, iRead, "utf-8"));
		}
		return info;
	}
}
