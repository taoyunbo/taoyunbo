package com.yunbo.demo.repository;

import com.yunbo.demo.converter.NotificationConverter;
import com.yunbo.demo.db.model.Message;
import com.yunbo.demo.db.model.MessageExample;
import com.yunbo.demo.db.model.Notification;
import com.yunbo.demo.db.model.NotificationExample;
import com.yunbo.demo.mapper.MessageMapper;
import com.yunbo.demo.mapper.NotificationMapper;
import com.yunbo.demo.type.NotificationType;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class NotificationRepositoryImpl implements NotificationRepository {
    private final MessageMapper messageMapper;
    private final NotificationMapper notificationMapper;

    @Override
    public NotificationType notification(String globalAccountId, String language, String until,
                                         Integer limit) {
        MessageExample messageExample = new MessageExample();
        messageExample.setOrderByClause("gmt_create desc");
        String localeTime = ZonedDateTime.parse(until).format(DateTimeFormatter.ISO_LOCAL_DATE);
        messageExample.createCriteria().andGmtPublishedEqualTo(LocalDateTime.parse(localeTime));
        int maxLimit = 50;
        RowBounds rowBounds = new RowBounds(RowBounds.NO_ROW_OFFSET, limit > 50 ? maxLimit : limit);
        List<Message> messages = this.messageMapper.selectByExampleWithRowbounds(messageExample, rowBounds);
        if (messages.isEmpty()) {
            return new NotificationType();
        }
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria().andLanguageCodeEqualTo(language)
            .andMessageIdIn(messages.stream().map(Message::getMessageId).collect(Collectors.toList()));
        List<Notification> notifications = notificationMapper.selectByExample(notificationExample);
        return NotificationConverter.create(messages, notifications);
    }
}
