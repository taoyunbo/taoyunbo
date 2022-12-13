package com.yunbo.demo.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrganizationContainerInfo implements Serializable {
    /**
     * 
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 組織ID
     *
     * @mbg.generated
     */
    private String organizationId;

    /**
     * UPCOMING
HISTORY
     *
     * @mbg.generated
     */
    private String containerType;

    /**
     * コンテナ名
     *
     * @mbg.generated
     */
    private String containerName;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
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
        sb.append(", id=").append(id);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", containerType=").append(containerType);
        sb.append(", containerName=").append(containerName);
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