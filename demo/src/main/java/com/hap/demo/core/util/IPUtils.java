package com.hap.demo.core.util;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.hap.demo.core.constant.Constant;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * IP地址
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017年3月8日 下午12:57:02
 */
public class IPUtils {
    private static Logger logger = LoggerFactory.getLogger(IPUtils.class);

    /**
     * 获取IP地址
     * <p>
     * 使用Nginx等反向代理软件， 则不能通过request.getRemoteAddr()获取IP地址
     * 如果使用了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP地址，X-Forwarded-For中第一个非unknown的有效IP字符串，则为真实IP地址
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = null;
        try {
            ip = request.getHeader("x-forwarded-for");
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip) || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
        } catch (Exception e) {
            logger.error("IPUtils ERROR ", e);
        }
        return ip;
    }

    //根据IP地址获取当前登录的地点
    public static String getAddressByIp(String ipAddress) {
        String url = "http://ip.taobao.com/service/getIpInfo.php?ip=" + ipAddress;
        String result = HttpUtil.get(url, Constant.CHARSET_UTF_8);
        JSONObject jsonObject = JSONUtil.parseObj(result);
        StringBuffer sb = new StringBuffer();
        sb.append(jsonObject.getJSONObject("data").get("country") + " . ");
        sb.append(jsonObject.getJSONObject("data").get("region") + " . ");
        sb.append(jsonObject.getJSONObject("data").get("city") + " . ");
        sb.append(jsonObject.getJSONObject("data").get("county") + " . ");
        sb.append(jsonObject.getJSONObject("data").get("isp"));
        return sb.toString();
    }


}
