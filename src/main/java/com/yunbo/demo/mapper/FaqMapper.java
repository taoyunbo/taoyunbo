package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.Faq;
import com.yunbo.demo.db.model.FaqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FaqMapper {
    long countByExample(FaqExample example);

    int deleteByExample(FaqExample example);

    int deleteByPrimaryKey(Long faqId);

    int insert(Faq record);

    int insertSelective(Faq record);

    List<Faq> selectByExampleWithRowbounds(FaqExample example, RowBounds rowBounds);

    List<Faq> selectByExample(FaqExample example);

    Faq selectByPrimaryKey(Long faqId);

    int updateByExampleSelective(@Param("record") Faq record, @Param("example") FaqExample example);

    int updateByExample(@Param("record") Faq record, @Param("example") FaqExample example);

    int updateByPrimaryKeySelective(Faq record);

    int updateByPrimaryKey(Faq record);
}