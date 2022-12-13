package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.LanguageMst;
import com.yunbo.demo.db.model.LanguageMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LanguageMstMapper {
    long countByExample(LanguageMstExample example);

    int deleteByExample(LanguageMstExample example);

    int deleteByPrimaryKey(String languageCode);

    int insert(LanguageMst record);

    int insertSelective(LanguageMst record);

    List<LanguageMst> selectByExampleWithRowbounds(LanguageMstExample example, RowBounds rowBounds);

    List<LanguageMst> selectByExample(LanguageMstExample example);

    LanguageMst selectByPrimaryKey(String languageCode);

    int updateByExampleSelective(@Param("record") LanguageMst record, @Param("example") LanguageMstExample example);

    int updateByExample(@Param("record") LanguageMst record, @Param("example") LanguageMstExample example);

    int updateByPrimaryKeySelective(LanguageMst record);

    int updateByPrimaryKey(LanguageMst record);
}