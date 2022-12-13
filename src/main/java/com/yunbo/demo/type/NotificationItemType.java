package com.yunbo.demo.type;

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
public class NotificationItemType {
    private Long notificationId;
    private String title;
    private String body;
    private String createdAt;
    private String url;
}
