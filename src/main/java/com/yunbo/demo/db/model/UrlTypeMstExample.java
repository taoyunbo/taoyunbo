package com.yunbo.demo.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UrlTypeMstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UrlTypeMstExample() {
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

        public Criteria andUrlTypeIsNull() {
            addCriterion("url_type is null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIsNotNull() {
            addCriterion("url_type is not null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeEqualTo(String value) {
            addCriterion("url_type =", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotEqualTo(String value) {
            addCriterion("url_type <>", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeGreaterThan(String value) {
            addCriterion("url_type >", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("url_type >=", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLessThan(String value) {
            addCriterion("url_type <", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLessThanOrEqualTo(String value) {
            addCriterion("url_type <=", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeLike(String value) {
            addCriterion("url_type like", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotLike(String value) {
            addCriterion("url_type not like", value, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeIn(List<String> values) {
            addCriterion("url_type in", values, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotIn(List<String> values) {
            addCriterion("url_type not in", values, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeBetween(String value1, String value2) {
            addCriterion("url_type between", value1, value2, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNotBetween(String value1, String value2) {
            addCriterion("url_type not between", value1, value2, "urlType");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameIsNull() {
            addCriterion("url_type_name is null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameIsNotNull() {
            addCriterion("url_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameEqualTo(String value) {
            addCriterion("url_type_name =", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameNotEqualTo(String value) {
            addCriterion("url_type_name <>", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameGreaterThan(String value) {
            addCriterion("url_type_name >", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("url_type_name >=", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameLessThan(String value) {
            addCriterion("url_type_name <", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameLessThanOrEqualTo(String value) {
            addCriterion("url_type_name <=", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameLike(String value) {
            addCriterion("url_type_name like", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameNotLike(String value) {
            addCriterion("url_type_name not like", value, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameIn(List<String> values) {
            addCriterion("url_type_name in", values, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameNotIn(List<String> values) {
            addCriterion("url_type_name not in", values, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameBetween(String value1, String value2) {
            addCriterion("url_type_name between", value1, value2, "urlTypeName");
            return (Criteria) this;
        }

        public Criteria andUrlTypeNameNotBetween(String value1, String value2) {
            addCriterion("url_type_name not between", value1, value2, "urlTypeName");
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