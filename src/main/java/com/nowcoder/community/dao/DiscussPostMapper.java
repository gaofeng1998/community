package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit); //offset为起始行号,userID所发的贴

    //@Param用于给参数取别名，如果方法只有一个参数，
    // 并且在<if>中使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);//userId的帖子数量


}
