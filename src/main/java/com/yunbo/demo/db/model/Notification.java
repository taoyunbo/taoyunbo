package com.yunbo.demo.db.model;

import java.io.Serializable;

public class Notification implements Serializable {
    /**
     * 
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 
     *
     * @mbg.generated
     */
    private Long messageId;

    /**
     * 言語コード
     *
     * @mbg.generated
     */
    private String languageCode;

    /**
     * タイトル
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 本文
     *
     * @mbg.generated
     */
    private String body;

    /**
     * URL
     *
     * @mbg.generated
     */
    private String url;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageId=").append(messageId);
        sb.append(", languageCode=").append(languageCode);
        sb.append(", title=").append(title);
        sb.append(", body=").append(body);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}