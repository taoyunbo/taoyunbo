package com.yunbo.demo.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Faq implements Serializable {
    /**
     * 
     *
     * @mbg.generated
     */
    private Long faqId;

    /**
     * 作成者
     *
     * @mbg.generated
     */
    private String creator;

    /**
     * 更新者
     *
     * @mbg.generated
     */
    private String updater;

    /**
     * 作成日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     * 削除日時
     *
     * @mbg.generated
     */
    private LocalDateTime gmtDeleted;

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

    /**
     * 
     *
     * @mbg.generated
     */
    private Long sortSeq;

    private static final long serialVersionUID = 1L;

    public Long getFaqId() {
        return faqId;
    }

    public void setFaqId(Long faqId) {
        this.faqId = faqId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtDeleted() {
        return gmtDeleted;
    }

    public void setGmtDeleted(LocalDateTime gmtDeleted) {
        this.gmtDeleted = gmtDeleted;
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

    public Long getSortSeq() {
        return sortSeq;
    }

    public void setSortSeq(Long sortSeq) {
        this.sortSeq = sortSeq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", faqId=").append(faqId);
        sb.append(", creator=").append(creator);
        sb.append(", updater=").append(updater);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtDeleted=").append(gmtDeleted);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", gmtPublished=").append(gmtPublished);
        sb.append(", sortSeq=").append(sortSeq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}