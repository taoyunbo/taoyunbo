package com.yunbo.demo.type;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yunbo.tao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationType {

    private List<NotificationItemType> notificationList;
    private String previousAt;
}
