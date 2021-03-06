package com.zt.dao.inner;

import com.zt.entity.DetailImg;
import com.zt.entity.InviTation;
import com.zt.model.InviWithDetailImg;
import org.apache.ibatis.annotations.Param;

import javax.annotation.security.PermitAll;
import java.util.List;

public interface InviTationDaoI {

    /**
     * 获取所有帖子
     * @return
     */
    public List<InviTation> getAllInvi();


    /**
     * 获取所有帖子，根据viewNum倒序排列
     * @return
     */
    public List<InviTation> getAllInviOrderByViewNum();

    /**
     * 插入一条帖子记录
     * @param inviTation
     */
    public void insertInvi(InviTation inviTation);

    /**
     * 根据title获取id
     * @param title
     * @return
     */
    public List<Long> getIdByTitle(@Param(value = "title") String title);

    /**
     * 根据id获取帖子及其对应的细节图
     * @param type
     * @return
     */
    public List<InviWithDetailImg> getInviByType(@Param(value = "type") int type);

    /**
     * 帖子点赞数+1
     * @param inviId
     */
    public void likeNumAdd1(@Param(value = "inviId") long inviId);

    /**
     * 帖子数-1
     * @param inviId
     */
    public void likeNumSub1(@Param(value = "inviId") long inviId);

    /**
     * 根据id获取一条具体的帖子
     * @param inviId
     * @return
     */
    public InviWithDetailImg getInviId(@Param(value = "inviId") long inviId);

    /**
     * 根据inviId让对应帖子的浏览量+1
     * @param inviId
     */
    public void viewNumAdd1(@Param(value = "inviId") long inviId);

    /**
     * 根据type和userId请求某个用户自己在某一类别下的所有帖子
     * @param type
     * @param userId
     * @return
     */
    public List<DetailImg> getInviBuTypeAndUserId(@Param(value = "type") long type,@Param(value = "userId") long userId);

    /**
     * 获取用户个人收藏的帖子
     * @param userId
     * @return
     */
    public List<InviWithDetailImg> getSavedInvi(@Param(value = "userId") long userId);

    /**
     * 根据id删除一条帖子
     * @param inviId
     */
    public void deleteInviById(@Param(value = "inviId") long inviId);

    /**
     * 更改用户头像
     * @param icon
     * @param userId
     */
    public void updateIcon(@Param(value = "icon") String icon,@Param(value = "userId") long userId);


    /**
     * 修改用户名
     * @param userName
     */
    public void updateUserName(@Param(value = "userName") String userName,@Param(value = "userId") long userId);

    /**
     * 对应帖子的评论数加1
     * @param inviId
     */
    public void jugeNumAdd1(@Param(value = "inviId") long inviId);

}
