package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationIdpInfo;
import com.yunbo.demo.db.model.OrganizationIdpInfoExample;
import com.yunbo.demo.mapper.OrganizationIdpInfoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationIdpsRepositoryImpl implements OrganizationIdpsRepository{

    private final OrganizationIdpInfoMapper organizationIdpInfoMapper;
    /**
     * query OrganizationIdpInfo table data
     *
     * @param organizationId organizationId
     * @return list
     */
    @Override
    public List<OrganizationIdpInfo> findOrganizationIdps(String organizationId) {
        OrganizationIdpInfoExample idpInfoExample = new OrganizationIdpInfoExample();
        if (StringUtils.isNotBlank(organizationId)) {
            idpInfoExample.createCriteria().andOrganizationIdEqualTo(organizationId);
        }
        idpInfoExample.createCriteria().andOrganizationIdEqualTo(organizationId);
        return organizationIdpInfoMapper.selectByExample(idpInfoExample);
    }
}
