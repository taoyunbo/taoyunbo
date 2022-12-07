package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.Test;
import com.yunbo.demo.db.model.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestMapper {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(String testId);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExampleWithRowbounds(TestExample example, RowBounds rowBounds);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(String testId);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}