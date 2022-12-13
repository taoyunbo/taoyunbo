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
public class KintoServiceItemType {

    private String url;
    private String country;
    private String idpServiceId;
    private List<KintoServiceItemContentType> contents;
}
