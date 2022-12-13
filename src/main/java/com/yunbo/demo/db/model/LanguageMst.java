package com.yunbo.demo.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class LanguageMst implements Serializable {
    /**
     * 言語コード
     *
     * @mbg.generated
     */
    private String languageCode;

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

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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
        sb.append(", languageCode=").append(languageCode);
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