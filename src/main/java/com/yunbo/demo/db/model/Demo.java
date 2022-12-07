package com.yunbo.demo.db.model;

import java.io.Serializable;

public class Demo implements Serializable {
    /**
     * 
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 
     *
     * @mbg.generated
     */
    private String testId;

    /**
     * 
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 
     *
     * @mbg.generated
     */
    private String age;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", testId=").append(testId);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}