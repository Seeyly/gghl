package yggl.com.utils;

import java.util.UUID;

/**
 * 
 * @Class CommonUtils
 * @author LEON
 * @Date 2014-3-21 下午4:32:30
 * @Description
 * 		一些工具类
 *
 */
public class CommonUtils {

	/**
	 * 
	 * @Method UUIDGenerator
	 * @author LEON
	 * @Date 2014-3-21 下午4:33:58
	 * @Description
	 * 		uuid 生成器
	 *
	 * @return
	 */
	public static String UUIDGenerator() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		return id.replace("-", "");
	}
}
