package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.CountryOrganizationRepository;
import com.yunbo.demo.type.CountryOrganizationType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class CountryOrganizationQueryResolver implements GraphQLQueryResolver {

    private final CountryOrganizationRepository countryOrganizationRepository;

    public List<CountryOrganizationType> countryOrganizations() {
        return this.countryOrganizationRepository.findCountryMst().stream().map(
            item -> CountryOrganizationType.builder().countryIsoCode(item.getCountryIsoCode())
                .countryName(item.getCountryName()).sort(item.getSort()).build()).collect(
            Collectors.toList());
    }
}
