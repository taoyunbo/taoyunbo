package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationMst;
import com.yunbo.demo.db.model.OrganizationMstExample;
import com.yunbo.demo.mapper.OrganizationMstMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationRepositoryImpl implements OrganizationRepository{

    private final OrganizationMstMapper organizationMstMapper;

    @Override
    public List<OrganizationMst> findOrganizations(String countryIsoCode) {
        OrganizationMstExample organizationMstExample = new OrganizationMstExample();
        organizationMstExample.createCriteria().andCountryIsoCodeEqualTo(countryIsoCode).andGmtDeletedIsNull();
        return organizationMstMapper.selectByExample(organizationMstExample);
    }
}
