package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationServiceInfo;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface OrganizationServiceRepository {
    List<OrganizationServiceInfo> organizationServiceInfo(final String organizationId);
}
