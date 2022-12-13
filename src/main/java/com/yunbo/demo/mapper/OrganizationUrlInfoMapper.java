package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.OrganizationUrlInfo;
import com.yunbo.demo.db.model.OrganizationUrlInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationUrlInfoMapper {
    long countByExample(OrganizationUrlInfoExample example);

    int deleteByExample(OrganizationUrlInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationUrlInfo record);

    int insertSelective(OrganizationUrlInfo record);

    List<OrganizationUrlInfo> selectByExampleWithRowbounds(OrganizationUrlInfoExample example, RowBounds rowBounds);

    List<OrganizationUrlInfo> selectByExample(OrganizationUrlInfoExample example);

    OrganizationUrlInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationUrlInfo record, @Param("example") OrganizationUrlInfoExample example);

    int updateByExample(@Param("record") OrganizationUrlInfo record, @Param("example") OrganizationUrlInfoExample example);

    int updateByPrimaryKeySelective(OrganizationUrlInfo record);

    int updateByPrimaryKey(OrganizationUrlInfo record);
}