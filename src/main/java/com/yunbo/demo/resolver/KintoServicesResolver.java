package com.yunbo.demo.resolver;

import com.yunbo.demo.erro.CustomGraphqlException;
import com.yunbo.demo.erro.GraphqlErrorCode;
import com.yunbo.demo.type.KintoServicesType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yunbo.tao
 */
public class KintoServicesResolver implements GraphQLQueryResolver {

    private static final String TOKEN ="token";
    private static final String IDPSERVICEID ="idpServiceId";
    private static final String IDPSERVICEIDSUB ="idpServiceIdSub";
    public KintoServicesType kintoServices(final String globalAccountId, final String language) {
        if (StringUtils.isEmpty(globalAccountId)) {
            throw new CustomGraphqlException("Not found globalAccountId", GraphqlErrorCode.ARGUMENT_EXCEPTION.getErrorCode());
        }
        if (StringUtils.isEmpty(language)) {
            throw new CustomGraphqlException("Not found language",GraphqlErrorCode.ARGUMENT_EXCEPTION.getErrorCode());
        }
    }
}
