package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.HomeBannersRepository;
import com.yunbo.demo.type.HomeBannerType;
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
public class HomeBannerGraphQLResolver implements GraphQLResolver<OrganizationType> {

    private final HomeBannersRepository homeBannersRepository;

    public List<HomeBannerType> homeBanners(final OrganizationType organizationType) {
        return homeBannersRepository.findHomeBanners(organizationType.getOrganizationId()).stream().map(
            item -> HomeBannerType.builder().languageCode(item.getLanguageCode()).bannerText(item.getBannerText())
                .build()).collect(
            Collectors.toList());
    }
}
