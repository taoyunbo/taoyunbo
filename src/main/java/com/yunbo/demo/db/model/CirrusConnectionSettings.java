package com.yunbo.demo.db.model;

import java.io.Serializable;

public class CirrusConnectionSettings implements Serializable {
    /**
     * GKAのサービスID
     *
     * @mbg.generated
     */
    private String gkaServiceId;

    /**
     * Upcoming url endpoint
     *
     * @mbg.generated
     */
    private String upcomingUrl;

    /**
     * History url endpoint
     *
     * @mbg.generated
     */
    private String historyUrl;

    /**
     * Verify url endpoint
     *
     * @mbg.generated
     */
    private String verifyUrl;

    /**
     * Client Id
     *
     * @mbg.generated
     */
    private String clientId;

    /**
     * api secrete key
     *
     * @mbg.generated
     */
    private String clientSecret;

    /**
     * connection time out
     *
     * @mbg.generated
     */
    private Integer timeOut;

    private static final long serialVersionUID = 1L;

    public String getGkaServiceId() {
        return gkaServiceId;
    }

    public void setGkaServiceId(String gkaServiceId) {
        this.gkaServiceId = gkaServiceId;
    }

    public String getUpcomingUrl() {
        return upcomingUrl;
    }

    public void setUpcomingUrl(String upcomingUrl) {
        this.upcomingUrl = upcomingUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getVerifyUrl() {
        return verifyUrl;
    }

    public void setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gkaServiceId=").append(gkaServiceId);
        sb.append(", upcomingUrl=").append(upcomingUrl);
        sb.append(", historyUrl=").append(historyUrl);
        sb.append(", verifyUrl=").append(verifyUrl);
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", timeOut=").append(timeOut);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}