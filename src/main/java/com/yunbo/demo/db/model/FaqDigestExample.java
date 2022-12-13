package com.yunbo.demo.db.model;

import java.util.ArrayList;
import java.util.List;

public class FaqDigestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqDigestExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFaqIdIsNull() {
            addCriterion("faq_id is null");
            return (Criteria) this;
        }

        public Criteria andFaqIdIsNotNull() {
            addCriterion("faq_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaqIdEqualTo(Long value) {
            addCriterion("faq_id =", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdNotEqualTo(Long value) {
            addCriterion("faq_id <>", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdGreaterThan(Long value) {
            addCriterion("faq_id >", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("faq_id >=", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdLessThan(Long value) {
            addCriterion("faq_id <", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdLessThanOrEqualTo(Long value) {
            addCriterion("faq_id <=", value, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdIn(List<Long> values) {
            addCriterion("faq_id in", values, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdNotIn(List<Long> values) {
            addCriterion("faq_id not in", values, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdBetween(Long value1, Long value2) {
            addCriterion("faq_id between", value1, value2, "faqId");
            return (Criteria) this;
        }

        public Criteria andFaqIdNotBetween(Long value1, Long value2) {
            addCriterion("faq_id not between", value1, value2, "faqId");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIsNull() {
            addCriterion("language_code is null");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIsNotNull() {
            addCriterion("language_code is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeEqualTo(String value) {
            addCriterion("language_code =", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotEqualTo(String value) {
            addCriterion("language_code <>", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeGreaterThan(String value) {
            addCriterion("language_code >", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("language_code >=", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLessThan(String value) {
            addCriterion("language_code <", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("language_code <=", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLike(String value) {
            addCriterion("language_code like", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotLike(String value) {
            addCriterion("language_code not like", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIn(List<String> values) {
            addCriterion("language_code in", values, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotIn(List<String> values) {
            addCriterion("language_code not in", values, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeBetween(String value1, String value2) {
            addCriterion("language_code between", value1, value2, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("language_code not between", value1, value2, "languageCode");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}