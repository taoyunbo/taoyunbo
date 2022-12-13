package com.yunbo.demo.repository;


import com.yunbo.demo.db.model.Demo;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface DemoRepository {

    List<Demo> findDemoByTestId(String testId);
}
