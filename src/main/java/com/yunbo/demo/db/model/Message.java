package com.yunbo.demo.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    /**
     * 
     *
     * @mbg.generated
     */
    private Long messageId;

    /**
     * メッセージ種別
     *
     * @mbg.generated
     */
    private String messageType;

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

    /**
     * 公開日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtPublished;

    private static final long serialVersionUID = 1L;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
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

    public LocalDateTime getGmtPublished() {
        return gmtPublished;
    }

    public void setGmtPublished(LocalDateTime gmtPublished) {
        this.gmtPublished = gmtPublished;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageId=").append(messageId);
        sb.append(", messageType=").append(messageType);
        sb.append(", gmtDeleted=").append(gmtDeleted);
        sb.append(", creator=").append(creator);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", updater=").append(updater);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtPublished=").append(gmtPublished);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}