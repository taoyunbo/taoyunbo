package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.OrganizationServiceInfo;
import com.yunbo.demo.db.model.OrganizationServiceInfoExample;
import com.yunbo.demo.mapper.OrganizationServiceInfoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationServiceRepositoryImpl implements OrganizationServiceRepository {

    private final OrganizationServiceInfoMapper organizationServiceInfoMapper;

    @Override
    public List<OrganizationServiceInfo> organizationServiceInfo(String organizationId) {
        OrganizationServiceInfoExample example = new OrganizationServiceInfoExample();
        example.createCriteria().andOrganizationIdEqualTo(organizationId);
        return organizationServiceInfoMapper.selectByExample(example);
    }
}
