package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.OrganizationServiceInfo;
import com.yunbo.demo.db.model.OrganizationServiceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationServiceInfoMapper {
    long countByExample(OrganizationServiceInfoExample example);

    int deleteByExample(OrganizationServiceInfoExample example);

    int deleteByPrimaryKey(String gkaServiceId);

    int insert(OrganizationServiceInfo record);

    int insertSelective(OrganizationServiceInfo record);

    List<OrganizationServiceInfo> selectByExampleWithRowbounds(OrganizationServiceInfoExample example, RowBounds rowBounds);

    List<OrganizationServiceInfo> selectByExample(OrganizationServiceInfoExample example);

    OrganizationServiceInfo selectByPrimaryKey(String gkaServiceId);

    int updateByExampleSelective(@Param("record") OrganizationServiceInfo record, @Param("example") OrganizationServiceInfoExample example);

    int updateByExample(@Param("record") OrganizationServiceInfo record, @Param("example") OrganizationServiceInfoExample example);

    int updateByPrimaryKeySelective(OrganizationServiceInfo record);

    int updateByPrimaryKey(OrganizationServiceInfo record);
}