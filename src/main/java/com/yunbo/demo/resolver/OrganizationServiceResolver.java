package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.OrganizationServiceRepository;
import com.yunbo.demo.type.OrganizationServiceType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationServiceResolver implements GraphQLQueryResolver {

    private final OrganizationServiceRepository repository;

    public List<OrganizationServiceType> organizationServices(final String organizationId) {
        if (organizationId == null) {
            return Collections.emptyList();
        }
        return repository.organizationServiceInfo(organizationId).stream().map(
            item -> OrganizationServiceType.builder()
                .organizationId(item.getOrganizationId())
                .gkaServiceId(item.getGkaServiceId())
                .serviceId(item.getServiceId())
                .serviceName(item.getServiceName())
                .serviceUrl(item.getServiceUrl())
                .serviceImageS3Key(item.getServiceImageS3Key())
                .serviceInactiveIconS3Key(item.getServiceInactiveIconS3Key())
                .serviceActiveIconS3Key(item.getServiceActiveIconS3Key())
                .sort(item.getSort()).build()).collect(
            Collectors.toList());
    }
}
