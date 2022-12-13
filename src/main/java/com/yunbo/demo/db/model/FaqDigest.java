package com.yunbo.demo.db.model;

import java.io.Serializable;

public class FaqDigest implements Serializable {
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
    private Long faqId;

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
    private String question;

    /**
     * 本文
     *
     * @mbg.generated
     */
    private String answer;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFaqId() {
        return faqId;
    }

    public void setFaqId(Long faqId) {
        this.faqId = faqId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", faqId=").append(faqId);
        sb.append(", languageCode=").append(languageCode);
        sb.append(", question=").append(question);
        sb.append(", answer=").append(answer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}