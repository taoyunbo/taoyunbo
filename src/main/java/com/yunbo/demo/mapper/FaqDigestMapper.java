package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.FaqDigest;
import com.yunbo.demo.db.model.FaqDigestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FaqDigestMapper {
    long countByExample(FaqDigestExample example);

    int deleteByExample(FaqDigestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FaqDigest record);

    int insertSelective(FaqDigest record);

    List<FaqDigest> selectByExampleWithRowbounds(FaqDigestExample example, RowBounds rowBounds);

    List<FaqDigest> selectByExample(FaqDigestExample example);

    FaqDigest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FaqDigest record, @Param("example") FaqDigestExample example);

    int updateByExample(@Param("record") FaqDigest record, @Param("example") FaqDigestExample example);

    int updateByPrimaryKeySelective(FaqDigest record);

    int updateByPrimaryKey(FaqDigest record);
}