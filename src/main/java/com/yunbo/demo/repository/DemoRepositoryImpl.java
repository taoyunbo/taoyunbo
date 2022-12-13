package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.Demo;
import com.yunbo.demo.db.model.DemoExample;
import com.yunbo.demo.mapper.DemoMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author yunbo.tao
 */
@Component
@AllArgsConstructor
public class DemoRepositoryImpl implements DemoRepository{

    private final DemoMapper demoMapper;
    @Override
    public List<Demo> findDemoByTestId(String testId) {
        DemoExample demoExample = new DemoExample();
        demoExample.createCriteria().andTestIdEqualTo(testId);
        return this.demoMapper.selectByExample(demoExample);
    }
}
