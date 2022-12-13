package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.OrganizationIdpsRepository;
import com.yunbo.demo.type.OrganizationIdpsType;
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
public class OrganizationIdpsResolver implements GraphQLQueryResolver {

    private final OrganizationIdpsRepository organizationIdpsRepository;

    public List<OrganizationIdpsType> organizationIdps(final String organizationId) {

        return organizationIdpsRepository.findOrganizationIdps(organizationId).stream().map(
            item -> OrganizationIdpsType.builder()
                .organizationId(item.getOrganizationId())
                .idpServiceId(item.getIdpServiceId())
                .updateUserInfoUrl(item.getUpdateUserInfoUrl()).build()).collect(Collectors.toList());
    }
}
