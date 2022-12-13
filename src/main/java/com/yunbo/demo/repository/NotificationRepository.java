package com.yunbo.demo.repository;

import com.yunbo.demo.type.NotificationType;

/**
 * @author yunbo.tao
 */
public interface NotificationRepository {
    NotificationType notification(final String globalAccountId, final String language, final String until,
                                  final Integer limit);
}
