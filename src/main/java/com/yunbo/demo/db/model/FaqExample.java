package com.yunbo.demo.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FaqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqExample() {
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(LocalDateTime value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(LocalDateTime value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(LocalDateTime value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<LocalDateTime> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIsNull() {
            addCriterion("gmt_deleted is null");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIsNotNull() {
            addCriterion("gmt_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted =", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted <>", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_deleted >", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted >=", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedLessThan(LocalDateTime value) {
            addCriterion("gmt_deleted <", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted <=", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIn(List<LocalDateTime> values) {
            addCriterion("gmt_deleted in", values, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_deleted not in", values, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_deleted between", value1, value2, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_deleted not between", value1, value2, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(LocalDateTime value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedIsNull() {
            addCriterion("gmt_published is null");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedIsNotNull() {
            addCriterion("gmt_published is not null");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedEqualTo(LocalDateTime value) {
            addCriterion("gmt_published =", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_published <>", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_published >", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_published >=", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedLessThan(LocalDateTime value) {
            addCriterion("gmt_published <", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_published <=", value, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedIn(List<LocalDateTime> values) {
            addCriterion("gmt_published in", values, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_published not in", values, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_published between", value1, value2, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andGmtPublishedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_published not between", value1, value2, "gmtPublished");
            return (Criteria) this;
        }

        public Criteria andSortSeqIsNull() {
            addCriterion("sort_seq is null");
            return (Criteria) this;
        }

        public Criteria andSortSeqIsNotNull() {
            addCriterion("sort_seq is not null");
            return (Criteria) this;
        }

        public Criteria andSortSeqEqualTo(Long value) {
            addCriterion("sort_seq =", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotEqualTo(Long value) {
            addCriterion("sort_seq <>", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqGreaterThan(Long value) {
            addCriterion("sort_seq >", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_seq >=", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqLessThan(Long value) {
            addCriterion("sort_seq <", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqLessThanOrEqualTo(Long value) {
            addCriterion("sort_seq <=", value, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqIn(List<Long> values) {
            addCriterion("sort_seq in", values, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotIn(List<Long> values) {
            addCriterion("sort_seq not in", values, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqBetween(Long value1, Long value2) {
            addCriterion("sort_seq between", value1, value2, "sortSeq");
            return (Criteria) this;
        }

        public Criteria andSortSeqNotBetween(Long value1, Long value2) {
            addCriterion("sort_seq not between", value1, value2, "sortSeq");
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