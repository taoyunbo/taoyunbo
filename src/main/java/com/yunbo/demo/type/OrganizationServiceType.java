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
public class OrganizationServiceType {
    private String organizationId;

    private String gkaServiceId;

    private String serviceId;

    private String serviceName;

    private String serviceUrl;

    private String serviceImageS3Key;

    private String serviceActiveIconS3Key;

    private String serviceInactiveIconS3Key;

    private int sort;
}
