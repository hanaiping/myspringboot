package com.hap.demo.core.constant;


import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * <p>Title: AcConstant</p>
 * <p>Description: </p>
 * <p>Company: FuTang International</p>
 *
 * @author Robin
 * @version 1.0
 * @date 2018年8月30日上午11:37:29
 */
public class Constant{

    /**数字常量：0
     * 新建状态  待完成  ， 关键字推送状态 ：未推送   删除状态  未删除   展示状态 ：展示
     *
     *
     * **/
    public static final Integer COMMON_STATUS_FALSE = 0;
    /**数字常量：1
     *
     * 完成状态  已完成 ，关键字推送状态 ：已推送  删除状态  已删除  展示状态 ：不展示
     *
     * **/
    public static final Integer COMMON_STATUS_TRUE = 1;

    public static final String RRK_SHORTVIDEO_CACHE = "SHORTVIDEO";
    public static final String AC_TYPE = "rrk.ac.type";

    public static final String AUTHORIZATION = "Authorization";

    /**
     * 通用缓存命名空间
     */
    public static final String REGION_CACHE_NAMESPACE = "C:REGION:";
    /**
     * @Author
     * @Description
     * @Date 11:57 2019/4/26 0026
     * @Param public final static int EXRP_DAY = 60 * 60 * 24;
     * @return
     */
    public final static int EXRP_WEEKDAY = 60 * 60 * 24 * 3;
    public final static Charset CHARSET_UTF_8 = StandardCharsets.UTF_8;


    /**
     * 系统启动首屏
     */
    public static final String SYSTEM_CACHE_STARTPIC = "S:STARTPIC:";
    /**
     * 短视频分类
     */
    public static final String VIDEO_CACHE_CLASS = "V:CLASS:";
    /**
     * 附近的短视频
     **/
    public static final String VIDEO_CACHE_NEARBY = "V:NEARBY:";
    /**
     * 推荐的短视频
     **/
    public static final String VIDEO_CACHE_RECOMMEND = "V:RECOMMEND:";
    /**
     * 短视频数据
     **/
    public static final String VIDEO_CACHE_INFO = "V:INFO:";
    /**
     * 全部短视频
     */
    public static final String VIDEO_CACHE_NAMESPACE = "V:SHORTVIDEO:";
    /**
     * 短视频分类
     */
    public static final String VIDEOCLASS_CACHE_NAMESPACE = "V:SHORTVIDEOCLASS:";
    /**
     * 用户已观看的记录表
     **/
    public static final String VIDEO_CACHE_WATCHED = "V:WATCHED:";
    /**
     * 音乐分类
     */
    public static final String MUSICCLASS_CACHE_NAMESPACE = "M:MUSICCLASS:";

    public static final String MUSIC_CACHE_NAMESPACE = "M:MUSIC:";
    /**
     * 用户信息
     **/
    public static final String USER_CACHE_NAMESPACE = "U:USER:";
    /**
     * 粉丝信息
     **/
    public static final String FANS_CACHE_NAMESPACE = "F:FANS:";
    /**
     * 联系人信息
     **/
    public static final String LINK_CACHE_NAMESPACE = "L:LINK:";
    /**
     * 关注信息
     **/
    public static final String CONCERN_CACHE_NAMESPACE = "C:CONCERN:";
    /**
     * 挑战短视频
     **/
    public static final String CHALLENGE_CACHE_NAMESPACE = "C:CHALLENGE:";

    /**
     * 用户评论数
     **/
    public static final String MESSAGE_COMMENT_COUNT = "C:COMMENT:";

    /**
     * 用户点赞数
     **/
    public static final String MESSAGE_PRAISE_COUNT = "P:PRAISE:";

    /**
     * 用户粉丝冒泡数
     **/
    public static final String MESSAGE_FANS_COUNT = "F:FANS:";

    /**
     * 用户粉丝总数
     */
    public static final String FANS_COUNT = "USER:FAN:";

    /**
     * 用户的关注数
     */
    public static final String ATTENTION_COUNT = "USER:ATTENTIONCOUNT:";

    /**
     * 用户好友数
     */
    public static final String LINK_COUNT = "USER:LINKCOUNT:";

    /**
     * 关注对象新增作品数
     */
    public static final String MESSAGE_ATTENTION_COUNT = "A:ATTENTION:";
    /**
     * 用户的短视频播放总数
     */
    public static final String USER_SHORT_PLAYCOUNT = "USER:PLAYCOUNT:";
    /**
     * 记录用户的播放记录
     */
    public static final String USER_PLAYRECORD = "U:PLAYRECORD:";
    public static final String VIDEO_PLAYCOUNT = "U:VIDEO:PLAYCOUNT:";
    public static final String USER_PLAYCOUNT = "U:USER:PLAYCOUNT:";


    /**
     * 添加短视频
     */
    public static final String CHARM_CONFIG_CHARMVALUE_ADDVIDEO = "C:ADDVIDEO:";
    public static final String CHARM_CONFIG_OPERATIONNUM_ADDVIDEO = "O:ADDVIDEO:";


    /**
     * 被关注
     */
    public static final String CHARM_CONFIG_CHARMVALUE_ATTENTIONED = "C:ATTENTIONED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_ATTENTIONED = "O:ATTENTIONED:";


    /**
     * 视频被点赞
     */
    public static final String CHARM_CONFIG_CHARMVALUE_PARISEVIDEOED = "C:PARISEVIDEOED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_PARISEVIDEOED = "O:PARISEVIDEOED:";


    /**
     * 短视频被分享
     */
    public static final String CHARM_CONFIG_CHARMVALUE_SHAREVIDEOED = "C:SHAREVIDEOED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_SHAREVIDEOED = "O:SHAREVIDEOED:";


    /**
     * 短视频评论
     */
    public static final String CHARM_CONFIG_CHARMVALUE_COMMENTVIDEO = "C:COMMENTVIDEO:";
    public static final String CHARM_CONFIG_OPERATIONNUM_COMMENTVIDEO = "O:COMMENTVIDEO:";


    /**
     * 短视频被评论
     */
    public static final String CHARM_CONFIG_CHARMVALUE_COMMENTVIDEOED = "C:COMMENTVIDEOED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_COMMENTVIDEOED = "O:COMMENTVIDEOED:";


    /**
     * 会员邀请 Member invitation
     */
    public static final String CHARM_CONFIG_CHARMVALUE_MEMBERINVITATION = "C:MEMBERINVITATION:";
    public static final String CHARM_CONFIG_OPERATIONNUM_MEMBERINVITATION = "O:MEMBERINVITATION:";

    /**
     * 红包red packet
     */
    public static final String CHARM_CONFIG_CHARMVALUE_REDPACKET = "C:REDPACKET:";
    public static final String CHARM_CONFIG_OPERATIONNUM_REDPACKET = "O:REDPACKET:";

    /**
     * MCN邀请  Invitation
     */
    public static final String CHARM_CONFIG_CHARMVALUE_MCNINVITATION = "C:MCNINVITATION:";
    public static final String CHARM_CONFIG_OPERATIONNUM_MCNINVITATION = "O:MCNINVITATION:";


    /**
     * 用户被分享
     */
    public static final String CHARM_CONFIG_CHARMVALUE_SHAREUSERED = "C:SHAREUSERED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_SHAREUSERED = "O:SHAREUSERED:";


    /**
     * 评论被点赞
     */
    public static final String CHARM_CONFIG_CHARMVALUE_COMMENTPRAISEED = "C:COMMENTPRAISEED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_COMMENTPRAISEED = "O:COMMENTPRAISEED:";


    /**
     * 音乐被分享
     */
    public static final String CHARM_CONFIG_CHARMVALUE_MUSICSHAREED = "C:MUSICSHAREED:";
    public static final String CHARM_CONFIG_OPERATIONNUM_MUSICSHAREED = "O:MUSICSHAREED:";
    /**
     * @Author
     * @Description ADDPLAYCOUNT
     * @Date 11:08 2019/4/24 0024
     * @Param
     * @return
     */
    public static final String CHARM_CONFIG_CHARMVALUE_ADDPLAYCOUNT = "C:ADDPLAYCOUNT:";
    public static final String CHARM_CONFIG_OPERATIONNUM_ADDPLAYCOUNT = "O:ADDPLAYCOUNT:";


    /**
     * 用户签到
     */

    public static final String CHARM_CONFIG_USERSIGN = "SIGN:U:"; //用户签到外层key
    public static final String CHARM_CONFIG_CHARMVALUE_USERSIGN = "SIGN:U:CHARMVALUE:";//签到累计魅力值
    public static final String CHARM_CONFIG_OPERATIONNUM_USERSIGN = "SIGN:U:OPERATIONNUM:";//签到次数

    public static final String CHARM_CONFIG_CHARMVALUE_WATCHVIDEO = "C:WATCHVIDEO:";
    public static final String CHARM_CONFIG_OPERATIONNUM_WATCHVIDEO = "O:WATCHVIDEO:";


    public static final String CHARM_CONFIG = "CHARM:CONFIG";
    public static final String CHARM = "charm:";

    /**
     * @Author
     * @Description
     * @Date 17:47 2019/4/29 0029
     * @Param VIDEOWEIGHTS
     * @return
     */

    public static final String VIDEOWEIGHTS = "VIDEOWEIGHTS";
    /**
     * @Author
     * @Description 点赞加权重
     * @Date 10:39 2019/4/30 0030
     * @Param
     * @return
     */
    public static final Double VIDEOWEIGHTS_VIDEOPRISE_SCORE = 0.01;
    /**
     * @Author
     * @Description 评论加权重
     * @Date 10:39 2019/4/30 0030
     * @Param
     * @return
     */
    public static final Double VIDEOWEIGHTS_COMMENT_SCORE = 0.001;
    /**
     * @Author
     * @Description 用户粉丝
     * @Date 11:01 2019/5/6 0006
     * @Param
     * @return
     */
    public static final String USER_ATTENTION = "U:USER:ATTENTION:";

    /**
     * 用户类型
     */
    public static final String USER_TYPE_INFO = "U:TYPECLASS";

    /**
     * 短视频总数
     */
    public static final String VIDEO_TOTAL = "SHORTVIDEO:COUNT:";


    /**
     * 用户总的魅力值
     */
    public static final String USER_ALL_CHARMVALUE = "wallet:total:rank";

    /**
     * 排序的权重的配置信息
     */
    public static final String WEIGHT_CONFIG = "WEIGHT:CONFIG:";

    public static final String WEIGHT = "WEIGHT";
    /**
     * 用户角色配置信息
     */
    public static final String U_TYPECLASS = "U:TYPECLASS";

    /**
     * mcn的已经推荐的数
     */
    public static final String MCN_RECOMMD = "MCN_RECOMMD:";

    /**
     * 将所有的短视频的数据存到redis
     */
    public static final String SHORTVIDE = "SHORTVIDEO:";

    /**
     * 定义存储短视频外键key
     */
    public static final String VIDEO_KEY = "VIDEO_KEY:";

    /**
     * 会员魅力值配置数据
     */
    public static final String USER_CHARM_CONFIG = "CHARM:CONFIG";

    /**
     * 七牛云
     */
    public static final String ACCESSKEY = "24DxxS2UfqufEvZM_nl3NbXmuoF4nXwPudWtsosh";// 七牛Ak
    public static final String SECRETKEY = "QyBvwYmzFtKLwKjF1nbIrixCvjjXgx9LgqaiPd06";// 七牛Sk
    public static final String SCOPE = "rrkliveimages";// 七牛空间名
    public static final String SCOPE2 = "shortvideo";// 七牛空间名
    public static final String MAC_NAME = "HmacSHA1";
    public static final String ENCODING = "UTF-8";

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
     * 记录消息
     */
    public static final String MQ_LOGMES = "log:mqLog:";


    /**
     * 将每次刷新的短视频存入到redis
     */
    public static final String REFRESH_USER_VIDEO = "U:REFRESH:";

    /**
     * 统计用户的作品数
     */
    public static final String USER_VIDEO_GALLERY = "U:GALLERY:";


}
