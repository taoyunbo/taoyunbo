package com.yunbo.demo.repository;

import com.yunbo.demo.db.model.Test;
import java.util.List;

/**
 * @author yunbo.tao
 */
public interface TestRepository {
    List<Test> findTestById(String testId);
}
