package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.OrganizationRepository;
import com.yunbo.demo.type.CountryOrganizationType;
import com.yunbo.demo.type.OrganizationType;
import graphql.kickstart.tools.GraphQLResolver;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class OrganizationGraphQLResolver implements GraphQLResolver<CountryOrganizationType> {

    private final OrganizationRepository organizationRepository;

    public List<OrganizationType> organizations(final CountryOrganizationType countryOrganizationType) {
        return this.organizationRepository.findOrganizations(countryOrganizationType.getCountryIsoCode()).stream().map(
            item -> OrganizationType.builder().organizationId(item.getOrganizationId())
                .organizationName(item.getOrganizationName()).build()).collect(
            Collectors.toList());
    }
}
