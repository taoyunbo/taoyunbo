package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.Demo;
import com.yunbo.demo.db.model.DemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DemoMapper {
    long countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExampleWithRowbounds(DemoExample example, RowBounds rowBounds);

    List<Demo> selectByExample(DemoExample example);

    Demo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}