package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.CountryMst;
import com.yunbo.demo.db.model.CountryMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CountryMstMapper {
    long countByExample(CountryMstExample example);

    int deleteByExample(CountryMstExample example);

    int deleteByPrimaryKey(String countryIsoCode);

    int insert(CountryMst record);

    int insertSelective(CountryMst record);

    List<CountryMst> selectByExampleWithRowbounds(CountryMstExample example, RowBounds rowBounds);

    List<CountryMst> selectByExample(CountryMstExample example);

    CountryMst selectByPrimaryKey(String countryIsoCode);

    int updateByExampleSelective(@Param("record") CountryMst record, @Param("example") CountryMstExample example);

    int updateByExample(@Param("record") CountryMst record, @Param("example") CountryMstExample example);

    int updateByPrimaryKeySelective(CountryMst record);

    int updateByPrimaryKey(CountryMst record);
}