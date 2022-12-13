package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.DemoRepository;
import com.yunbo.demo.type.DemoType;
import com.yunbo.demo.type.TestType;
import graphql.kickstart.tools.GraphQLResolver;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DemoGraphQLResolver implements GraphQLResolver<TestType> {

    private final DemoRepository demoRepository;

    public List<DemoType> findDemo(TestType testType) {
        return this.demoRepository.findDemoByTestId(testType.getTestId()).stream().map(
            item -> DemoType.builder()
                .testId(item.getTestId())
                .age(item.getAge())
                .id(item.getId())
                .name(item.getName())
                .build()).collect(
            Collectors.toList());
    }
}
