package com.yunbo.demo.db.model;

import java.io.Serializable;

public class Test implements Serializable {
    /**
     * GKAのサービスID
     *
     * @mbg.generated
     */
    private String testId;

    /**
     * Upcoming url endpoint
     *
     * @mbg.generated
     */
    private String student;

    /**
     * History url endpoint
     *
     * @mbg.generated
     */
    private String teacher;

    private static final long serialVersionUID = 1L;

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", testId=").append(testId);
        sb.append(", student=").append(student);
        sb.append(", teacher=").append(teacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}