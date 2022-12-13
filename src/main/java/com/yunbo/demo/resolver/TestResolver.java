package com.yunbo.demo.resolver;

import com.yunbo.demo.repository.TestRepository;
import com.yunbo.demo.type.TestType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TestResolver implements GraphQLQueryResolver {

    private final TestRepository testRepository;

    public List<TestType> testAndDemo(String testId) {

        return this.testRepository.findTestById(testId).stream().map(
            item -> TestType.builder()
                .testId(item.getTestId())
                .student(item.getStudent())
                .teacher(item.getTeacher())
                .build()).collect(
            Collectors.toList());
    }
}
