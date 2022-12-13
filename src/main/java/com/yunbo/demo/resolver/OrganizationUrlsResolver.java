package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.OrganizationUrlsRepository;
import com.yunbo.demo.type.OrganizationUrlsType;
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
public class OrganizationUrlsResolver implements GraphQLQueryResolver {

    private final OrganizationUrlsRepository organizationUrlsRepository;

    public List<OrganizationUrlsType> organizationUrls(final String organizationId) {
        if (organizationId == null) {
            return Collections.emptyList();
        }
        return organizationUrlsRepository.findOrganizationsUrls(organizationId).stream().map(
            item -> OrganizationUrlsType.builder().organizationId(item.getOrganizationId()).urlType(item.getUrlType())
                .url(
                    item.getUrl()).build()).collect(Collectors.toList());
    }
}
