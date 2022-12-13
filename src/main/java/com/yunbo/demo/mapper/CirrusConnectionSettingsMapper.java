package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.CirrusConnectionSettings;
import com.yunbo.demo.db.model.CirrusConnectionSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CirrusConnectionSettingsMapper {
    long countByExample(CirrusConnectionSettingsExample example);

    int deleteByExample(CirrusConnectionSettingsExample example);

    int deleteByPrimaryKey(String gkaServiceId);

    int insert(CirrusConnectionSettings record);

    int insertSelective(CirrusConnectionSettings record);

    List<CirrusConnectionSettings> selectByExampleWithRowbounds(CirrusConnectionSettingsExample example, RowBounds rowBounds);

    List<CirrusConnectionSettings> selectByExample(CirrusConnectionSettingsExample example);

    CirrusConnectionSettings selectByPrimaryKey(String gkaServiceId);

    int updateByExampleSelective(@Param("record") CirrusConnectionSettings record, @Param("example") CirrusConnectionSettingsExample example);

    int updateByExample(@Param("record") CirrusConnectionSettings record, @Param("example") CirrusConnectionSettingsExample example);

    int updateByPrimaryKeySelective(CirrusConnectionSettings record);

    int updateByPrimaryKey(CirrusConnectionSettings record);
}