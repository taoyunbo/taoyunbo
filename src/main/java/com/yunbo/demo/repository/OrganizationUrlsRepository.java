package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationUrlInfo;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface OrganizationUrlsRepository {

    List<OrganizationUrlInfo> findOrganizationsUrls(final String organizationId);
}
