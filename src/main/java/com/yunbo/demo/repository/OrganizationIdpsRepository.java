package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationIdpInfo;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface OrganizationIdpsRepository {
    /**
     * query OrganizationIdpInfo table data
     * @param organizationId   organizationId
     * @return list
     */
    List<OrganizationIdpInfo> findOrganizationIdps(final String organizationId);
}
