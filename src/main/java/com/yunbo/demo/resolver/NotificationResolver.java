package com.yunbo.demo.resolver;

import com.yunbo.demo.erro.CustomGraphqlException;
import com.yunbo.demo.erro.GraphqlErrorCode;
import com.yunbo.demo.repository.NotificationRepository;
import com.yunbo.demo.type.NotificationType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class NotificationResolver implements GraphQLQueryResolver {
    private final NotificationRepository notificationRepository;

    public NotificationType notifications(final String globalAccountId, final String language, final String until,
                                          final Integer limit) {
        if (StringUtils.isEmpty(language)) {
            throw new CustomGraphqlException("language can not be null",
                GraphqlErrorCode.ARGUMENT_EXCEPTION.getErrorCode());
        }
        if (limit == null) {
            throw new CustomGraphqlException("limit can not be null",
                GraphqlErrorCode.ARGUMENT_EXCEPTION.getErrorCode());
        }
        return this.notificationRepository
            .notification(globalAccountId, language, StringUtils.isBlank(until) ? getISO8601() : until, limit);

    }

    private String getISO8601() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date());
    }
}
