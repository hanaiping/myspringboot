package com.hap.demo.core.constant;

/**
 * @description:
 * @author: Administrator
 * @date: 2019-07-08 17:17
 */
public interface RedisConstant {

    /**
     * 用户信息
     **/
    String USER_CACHE_NAMESPACE = "U:USER:";

    /**
     * 用户的短视频播放总数
     */
    String USER_SHORT_PLAYCOUNT = "USER:PLAYCOUNT:";

    /**
     * 短视频总数
     */
    String VIDEO_TOTAL = "SHORTVIDEO:COUNT:";

    /**
     * @Author
     * @Description ADDPLAYCOUNT
     * @Date 11:08 2019/4/24 0024
     * @Param
     * @return
     */
    String CHARM_CONFIG_CHARMVALUE_ADDPLAYCOUNT = "C:ADDPLAYCOUNT:";
    String CHARM_CONFIG_OPERATIONNUM_ADDPLAYCOUNT = "O:ADDPLAYCOUNT:";

    /**
     * 用户关注的key
     */
    String USER_SHORTVIDEO_ATTENTION = "U:USER:ATTENTION:";

    /**
     * 用户点赞的key
     */
    String USER_SHORTVIDEO_PRAISE = "P:PRAISE:";

    /**
     * 用户登录的key
     */
    String USER_LOGIN = "U:USER:LOGIN:";

    /**
     * 短视频的key
     */
    String SHORTVIDE = "SHORTVIDEO:";

    String MQ_CORRELATIONDATA = "MQ:MSG";
}
