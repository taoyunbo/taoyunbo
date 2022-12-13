package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationMst;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface OrganizationRepository {
    List<OrganizationMst> findOrganizations(final String countryIsoCode);
}
