package com.yunbo.demo.erro;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import org.springframework.boot.logging.LogLevel;

@Getter
public class CustomGraphqlException extends RuntimeException implements GraphQLError {

    private final String errorCode;
    private final String message;
    private final LogLevel logLevel;

    public CustomGraphqlException(String message, String errorCode) {
        this.errorCode = errorCode;
        this.message = message;
        this.logLevel = LogLevel.WARN;
    }

    public CustomGraphqlException(String message, String errorCode, LogLevel logLevel) {
        this.errorCode = errorCode;
        this.message = message;
        this.logLevel = logLevel;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Map<String, Object> getExtensions() {
        Map<String, Object> map = new HashMap<>();
        map.put("errorCode", this.errorCode);
        map.put("message", this.message);
        return map;
    }
}
