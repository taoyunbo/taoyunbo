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
public class OrganizationUrlsType {
    private String organizationId;
    private String urlType;
    private String url;
}
