package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.OrganizationMst;
import com.yunbo.demo.db.model.OrganizationMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrganizationMstMapper {
    long countByExample(OrganizationMstExample example);

    int deleteByExample(OrganizationMstExample example);

    int deleteByPrimaryKey(String organizationId);

    int insert(OrganizationMst record);

    int insertSelective(OrganizationMst record);

    List<OrganizationMst> selectByExampleWithRowbounds(OrganizationMstExample example, RowBounds rowBounds);

    List<OrganizationMst> selectByExample(OrganizationMstExample example);

    OrganizationMst selectByPrimaryKey(String organizationId);

    int updateByExampleSelective(@Param("record") OrganizationMst record, @Param("example") OrganizationMstExample example);

    int updateByExample(@Param("record") OrganizationMst record, @Param("example") OrganizationMstExample example);

    int updateByPrimaryKeySelective(OrganizationMst record);

    int updateByPrimaryKey(OrganizationMst record);
}