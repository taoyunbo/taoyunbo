package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.HomeBannerInfo;
import com.yunbo.demo.db.model.HomeBannerInfoExample;
import com.yunbo.demo.mapper.HomeBannerInfoMapper;
import com.yunbo.demo.type.OrganizationType;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HomeBannersRepositoryImpl implements HomeBannersRepository{

    private final HomeBannerInfoMapper homeBannerInfoMapper;
    @Override
    public List<HomeBannerInfo> findHomeBanners(String organizationId) {
        HomeBannerInfoExample example = new HomeBannerInfoExample();
        example.createCriteria().andOrganizationIdEqualTo(organizationId).andGmtDeletedIsNull();
        return homeBannerInfoMapper.selectByExample(example);
    }
}
