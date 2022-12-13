package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.HomeBannerInfo;
import com.yunbo.demo.type.OrganizationType;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface HomeBannersRepository {
    List<HomeBannerInfo> findHomeBanners(String organizationId);
}
