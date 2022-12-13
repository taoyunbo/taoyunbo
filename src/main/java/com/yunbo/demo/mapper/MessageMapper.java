package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.Message;
import com.yunbo.demo.db.model.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Long messageId);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExampleWithRowbounds(MessageExample example, RowBounds rowBounds);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Long messageId);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}