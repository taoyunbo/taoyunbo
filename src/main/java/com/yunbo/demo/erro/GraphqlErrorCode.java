package com.yunbo.demo.erro;

public enum GraphqlErrorCode {
    // Third-party exception
    THIRD_PARTY_TIME_OUT("E0101", "third-party API time out"),
    THIRD_PARTY_AUTH_FAILED("E0102", "third-party API auth failed"),
    THIRD_PARTY_PARAM_ERROR("E0103", "third-party API param error"),
    THIRD_PARTY_CALL_EXCEPTION("E0104", "third-party call exception"),
    THIRD_PARTY_CALL_NOT_OK("E0105", "call third-party HttpStatus not ok"),

    // client exception
    SIGNATURE_INVALID("E0201", "signature invalid"),
    FIELD_DO_NOT_EXIST("E0202", "query fields does not exist"),
    ARGUMENT_EXCEPTION("E0203", "IllegalArgumentException"),
    SIGNATURE_TIMESTAMP_INVALID("E0204", "signature timestamp invalid"),

    // middle ware exception
    REDIS_CONNECT_FAILED("E0301", "redis throw exception"),
    MYSQL_CONNECT_FAILED("E0302", "mysql throw exception"),

    // other exception
    UNKNOWN_EXCEPTION("E0900", "unknown exception");

    private final String errorCode;
    private final String message;

    GraphqlErrorCode(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
