package com.yunbo.demo.mapper;

import com.yunbo.demo.db.model.HomeBannerInfo;
import com.yunbo.demo.db.model.HomeBannerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HomeBannerInfoMapper {
    long countByExample(HomeBannerInfoExample example);

    int deleteByExample(HomeBannerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HomeBannerInfo record);

    int insertSelective(HomeBannerInfo record);

    List<HomeBannerInfo> selectByExampleWithRowbounds(HomeBannerInfoExample example, RowBounds rowBounds);

    List<HomeBannerInfo> selectByExample(HomeBannerInfoExample example);

    HomeBannerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HomeBannerInfo record, @Param("example") HomeBannerInfoExample example);

    int updateByExample(@Param("record") HomeBannerInfo record, @Param("example") HomeBannerInfoExample example);

    int updateByPrimaryKeySelective(HomeBannerInfo record);

    int updateByPrimaryKey(HomeBannerInfo record);
}