package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.OrganizationContainerInfo;
import com.yunbo.demo.db.model.OrganizationContainerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationContainerInfoMapper {
    long countByExample(OrganizationContainerInfoExample example);

    int deleteByExample(OrganizationContainerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrganizationContainerInfo record);

    int insertSelective(OrganizationContainerInfo record);

    List<OrganizationContainerInfo> selectByExampleWithRowbounds(OrganizationContainerInfoExample example, RowBounds rowBounds);

    List<OrganizationContainerInfo> selectByExample(OrganizationContainerInfoExample example);

    OrganizationContainerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrganizationContainerInfo record, @Param("example") OrganizationContainerInfoExample example);

    int updateByExample(@Param("record") OrganizationContainerInfo record, @Param("example") OrganizationContainerInfoExample example);

    int updateByPrimaryKeySelective(OrganizationContainerInfo record);

    int updateByPrimaryKey(OrganizationContainerInfo record);
}