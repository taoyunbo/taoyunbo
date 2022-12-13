package com.yunbo.demo.converter;

import com.yunbo.demo.db.model.Message;
import com.yunbo.demo.db.model.Notification;
import com.yunbo.demo.type.NotificationItemType;
import com.yunbo.demo.type.NotificationType;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author yunbo.tao
 */
public class NotificationConverter {
    public static NotificationType create(List<Message> messages, List<Notification> notifications) {
            List<NotificationItemType> notificationItemTypes = new ArrayList<>();
            NotificationType notificationTypes = new NotificationType();
        messages.forEach(mes -> {
            Optional<Notification> notification =
                notifications.stream().filter(res -> mes.getMessageId().equals(res.getMessageId())).findFirst();
            notification.ifPresent(res -> {
                NotificationItemType notificationItemType = new NotificationItemType();
                notificationItemType.setNotificationId(res.getId());
                notificationItemType.setTitle(res.getTitle());
                notificationItemType.setBody(res.getBody());
                notificationItemType.setUrl(res.getUrl());
                ZonedDateTime zoneDateTime = ZonedDateTime.of(mes.getGmtCreate(), ZoneOffset.UTC);
                notificationItemType.setCreatedAt(zoneDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
                notificationItemTypes.add(notificationItemType);
            });

        });
        List<NotificationItemType> sortedNotificationList = notificationItemTypes.stream()
            .sorted(Comparator.comparing(NotificationItemType::getCreatedAt, Comparator.reverseOrder())).collect(
                Collectors.toList());
        notificationTypes.setNotificationList(sortedNotificationList);
        notificationTypes.setPreviousAt(sortedNotificationList.get(sortedNotificationList.size() - 1).getCreatedAt());
        return notificationTypes;
    }
}
