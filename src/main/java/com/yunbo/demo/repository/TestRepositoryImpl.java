package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.Test;
import com.yunbo.demo.db.model.TestExample;
import com.yunbo.demo.mapper.TestMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TestRepositoryImpl implements TestRepository{

    private final TestMapper testMapper;
    @Override
    public List<Test> findTestById(String testId) {
        TestExample testExample = new TestExample();
        testExample.createCriteria().andTestIdEqualTo(testId);
        return this.testMapper.selectByExample(testExample);
    }
}
