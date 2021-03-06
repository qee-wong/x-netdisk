package group.xuxiake.web.service;

import group.xuxiake.common.entity.Result;
import group.xuxiake.common.entity.UserFriendRequest;

/**
 * Author by xuxiake, Date on 2019/5/5.
 * PS: Not easy to write code, please indicate.
 * Description：
 */
public interface UserFriendRequestService {

    /**
     * 好友申请操作
     * @param applicant 申请者id
     * @param option 操作 1：同意；2：拒绝
     * @return
     */
    Result friendRequestOption(Integer applicant, Integer option);

    /**
     * 搜索好友
     * @param key 关键词
     * @return
     */
    Result searchFriend(String key);

    /**
     * 添加好友请求
     * @param param
     * @return
     */
    Result addFriendRequest(UserFriendRequest param);
}
