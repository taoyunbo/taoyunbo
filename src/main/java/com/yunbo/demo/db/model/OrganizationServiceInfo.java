package com.yunbo.demo.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrganizationServiceInfo implements Serializable {
    /**
     * GKAのサービスID
     *
     * @mbg.generated
     */
    private String gkaServiceId;

    /**
     * サービスID
     *
     * @mbg.generated
     */
    private String serviceId;

    /**
     * 組織ID
     *
     * @mbg.generated
     */
    private String organizationId;

    /**
     * サービス名
     *
     * @mbg.generated
     */
    private String serviceName;

    /**
     * サービスURL
     *
     * @mbg.generated
     */
    private String serviceUrl;

    /**
     * S3から取得するためサービス画像キー
     *
     * @mbg.generated
     */
    private String serviceImageS3Key;

    /**
     * S3から取得するためアイコンキー
     *
     * @mbg.generated
     */
    private String serviceActiveIconS3Key;

    /**
     * S3から取得するためインアクティブなアイコンキー
     *
     * @mbg.generated
     */
    private String serviceInactiveIconS3Key;

    /**
     * 順番. 1 is first
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 削除日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtDeleted;

    /**
     * 作成者
     *
     * @mbg.generated
     */
    private String creator;

    /**
     * 作成日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     * 更新者
     *
     * @mbg.generated
     */
    private String updater;

    /**
     * 更新日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    private static final long serialVersionUID = 1L;

    public String getGkaServiceId() {
        return gkaServiceId;
    }

    public void setGkaServiceId(String gkaServiceId) {
        this.gkaServiceId = gkaServiceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceImageS3Key() {
        return serviceImageS3Key;
    }

    public void setServiceImageS3Key(String serviceImageS3Key) {
        this.serviceImageS3Key = serviceImageS3Key;
    }

    public String getServiceActiveIconS3Key() {
        return serviceActiveIconS3Key;
    }

    public void setServiceActiveIconS3Key(String serviceActiveIconS3Key) {
        this.serviceActiveIconS3Key = serviceActiveIconS3Key;
    }

    public String getServiceInactiveIconS3Key() {
        return serviceInactiveIconS3Key;
    }

    public void setServiceInactiveIconS3Key(String serviceInactiveIconS3Key) {
        this.serviceInactiveIconS3Key = serviceInactiveIconS3Key;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public LocalDateTime getGmtDeleted() {
        return gmtDeleted;
    }

    public void setGmtDeleted(LocalDateTime gmtDeleted) {
        this.gmtDeleted = gmtDeleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gkaServiceId=").append(gkaServiceId);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", serviceUrl=").append(serviceUrl);
        sb.append(", serviceImageS3Key=").append(serviceImageS3Key);
        sb.append(", serviceActiveIconS3Key=").append(serviceActiveIconS3Key);
        sb.append(", serviceInactiveIconS3Key=").append(serviceInactiveIconS3Key);
        sb.append(", sort=").append(sort);
        sb.append(", gmtDeleted=").append(gmtDeleted);
        sb.append(", creator=").append(creator);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", updater=").append(updater);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}