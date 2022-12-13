package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.OrganizationIdpInfo;
import com.yunbo.demo.db.model.OrganizationIdpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationIdpInfoMapper {
    long countByExample(OrganizationIdpInfoExample example);

    int deleteByExample(OrganizationIdpInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationIdpInfo record);

    int insertSelective(OrganizationIdpInfo record);

    List<OrganizationIdpInfo> selectByExampleWithRowbounds(OrganizationIdpInfoExample example, RowBounds rowBounds);

    List<OrganizationIdpInfo> selectByExample(OrganizationIdpInfoExample example);

    OrganizationIdpInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationIdpInfo record, @Param("example") OrganizationIdpInfoExample example);

    int updateByExample(@Param("record") OrganizationIdpInfo record, @Param("example") OrganizationIdpInfoExample example);

    int updateByPrimaryKeySelective(OrganizationIdpInfo record);

    int updateByPrimaryKey(OrganizationIdpInfo record);
}