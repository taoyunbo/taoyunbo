package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.UrlTypeMst;
import com.yunbo.demo.db.model.UrlTypeMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UrlTypeMstMapper {
    long countByExample(UrlTypeMstExample example);

    int deleteByExample(UrlTypeMstExample example);

    int deleteByPrimaryKey(String urlType);

    int insert(UrlTypeMst record);

    int insertSelective(UrlTypeMst record);

    List<UrlTypeMst> selectByExampleWithRowbounds(UrlTypeMstExample example, RowBounds rowBounds);

    List<UrlTypeMst> selectByExample(UrlTypeMstExample example);

    UrlTypeMst selectByPrimaryKey(String urlType);

    int updateByExampleSelective(@Param("record") UrlTypeMst record, @Param("example") UrlTypeMstExample example);

    int updateByExample(@Param("record") UrlTypeMst record, @Param("example") UrlTypeMstExample example);

    int updateByPrimaryKeySelective(UrlTypeMst record);

    int updateByPrimaryKey(UrlTypeMst record);
}