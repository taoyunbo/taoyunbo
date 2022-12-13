package com.yunbo.demo.type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoType {

    private String id;

    private String testId;

    private String name;

    private String age;
}
