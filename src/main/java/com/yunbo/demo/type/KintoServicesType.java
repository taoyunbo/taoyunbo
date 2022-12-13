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
public class KintoServicesType {

    private List<KintoServiceItemType> upcoming;
    private List<KintoServiceItemType> history;
}
