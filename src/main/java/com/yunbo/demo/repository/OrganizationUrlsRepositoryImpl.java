package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationUrlInfo;
import com.yunbo.demo.db.model.OrganizationUrlInfoExample;
import com.yunbo.demo.mapper.OrganizationUrlInfoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationUrlsRepositoryImpl implements OrganizationUrlsRepository{

    private final OrganizationUrlInfoMapper organizationUrlInfoMapper;
    @Override
    public List<OrganizationUrlInfo> findOrganizationsUrls(String organizationId) {
        OrganizationUrlInfoExample urlInfoExample = new OrganizationUrlInfoExample();
        urlInfoExample.createCriteria().andOrganizationIdEqualTo(organizationId).andGmtDeletedIsNull();
        return organizationUrlInfoMapper.selectByExample(urlInfoExample);
    }
}
