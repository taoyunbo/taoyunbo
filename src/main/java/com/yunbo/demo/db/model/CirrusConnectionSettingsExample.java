package com.yunbo.demo.db.model;

import java.util.ArrayList;
import java.util.List;

public class CirrusConnectionSettingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CirrusConnectionSettingsExample() {
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

        public Criteria andGkaServiceIdIsNull() {
            addCriterion("gka_service_id is null");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdIsNotNull() {
            addCriterion("gka_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdEqualTo(String value) {
            addCriterion("gka_service_id =", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdNotEqualTo(String value) {
            addCriterion("gka_service_id <>", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdGreaterThan(String value) {
            addCriterion("gka_service_id >", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("gka_service_id >=", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdLessThan(String value) {
            addCriterion("gka_service_id <", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdLessThanOrEqualTo(String value) {
            addCriterion("gka_service_id <=", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdLike(String value) {
            addCriterion("gka_service_id like", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdNotLike(String value) {
            addCriterion("gka_service_id not like", value, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdIn(List<String> values) {
            addCriterion("gka_service_id in", values, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdNotIn(List<String> values) {
            addCriterion("gka_service_id not in", values, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdBetween(String value1, String value2) {
            addCriterion("gka_service_id between", value1, value2, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andGkaServiceIdNotBetween(String value1, String value2) {
            addCriterion("gka_service_id not between", value1, value2, "gkaServiceId");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlIsNull() {
            addCriterion("upcoming_url is null");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlIsNotNull() {
            addCriterion("upcoming_url is not null");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlEqualTo(String value) {
            addCriterion("upcoming_url =", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlNotEqualTo(String value) {
            addCriterion("upcoming_url <>", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlGreaterThan(String value) {
            addCriterion("upcoming_url >", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlGreaterThanOrEqualTo(String value) {
            addCriterion("upcoming_url >=", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlLessThan(String value) {
            addCriterion("upcoming_url <", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlLessThanOrEqualTo(String value) {
            addCriterion("upcoming_url <=", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlLike(String value) {
            addCriterion("upcoming_url like", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlNotLike(String value) {
            addCriterion("upcoming_url not like", value, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlIn(List<String> values) {
            addCriterion("upcoming_url in", values, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlNotIn(List<String> values) {
            addCriterion("upcoming_url not in", values, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlBetween(String value1, String value2) {
            addCriterion("upcoming_url between", value1, value2, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andUpcomingUrlNotBetween(String value1, String value2) {
            addCriterion("upcoming_url not between", value1, value2, "upcomingUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlIsNull() {
            addCriterion("history_url is null");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlIsNotNull() {
            addCriterion("history_url is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlEqualTo(String value) {
            addCriterion("history_url =", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlNotEqualTo(String value) {
            addCriterion("history_url <>", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlGreaterThan(String value) {
            addCriterion("history_url >", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("history_url >=", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlLessThan(String value) {
            addCriterion("history_url <", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlLessThanOrEqualTo(String value) {
            addCriterion("history_url <=", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlLike(String value) {
            addCriterion("history_url like", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlNotLike(String value) {
            addCriterion("history_url not like", value, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlIn(List<String> values) {
            addCriterion("history_url in", values, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlNotIn(List<String> values) {
            addCriterion("history_url not in", values, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlBetween(String value1, String value2) {
            addCriterion("history_url between", value1, value2, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andHistoryUrlNotBetween(String value1, String value2) {
            addCriterion("history_url not between", value1, value2, "historyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlIsNull() {
            addCriterion("verify_url is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlIsNotNull() {
            addCriterion("verify_url is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlEqualTo(String value) {
            addCriterion("verify_url =", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlNotEqualTo(String value) {
            addCriterion("verify_url <>", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlGreaterThan(String value) {
            addCriterion("verify_url >", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("verify_url >=", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlLessThan(String value) {
            addCriterion("verify_url <", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlLessThanOrEqualTo(String value) {
            addCriterion("verify_url <=", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlLike(String value) {
            addCriterion("verify_url like", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlNotLike(String value) {
            addCriterion("verify_url not like", value, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlIn(List<String> values) {
            addCriterion("verify_url in", values, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlNotIn(List<String> values) {
            addCriterion("verify_url not in", values, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlBetween(String value1, String value2) {
            addCriterion("verify_url between", value1, value2, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andVerifyUrlNotBetween(String value1, String value2) {
            addCriterion("verify_url not between", value1, value2, "verifyUrl");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientSecretIsNull() {
            addCriterion("client_secret is null");
            return (Criteria) this;
        }

        public Criteria andClientSecretIsNotNull() {
            addCriterion("client_secret is not null");
            return (Criteria) this;
        }

        public Criteria andClientSecretEqualTo(String value) {
            addCriterion("client_secret =", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotEqualTo(String value) {
            addCriterion("client_secret <>", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretGreaterThan(String value) {
            addCriterion("client_secret >", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretGreaterThanOrEqualTo(String value) {
            addCriterion("client_secret >=", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLessThan(String value) {
            addCriterion("client_secret <", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLessThanOrEqualTo(String value) {
            addCriterion("client_secret <=", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretLike(String value) {
            addCriterion("client_secret like", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotLike(String value) {
            addCriterion("client_secret not like", value, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretIn(List<String> values) {
            addCriterion("client_secret in", values, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotIn(List<String> values) {
            addCriterion("client_secret not in", values, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretBetween(String value1, String value2) {
            addCriterion("client_secret between", value1, value2, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andClientSecretNotBetween(String value1, String value2) {
            addCriterion("client_secret not between", value1, value2, "clientSecret");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNull() {
            addCriterion("time_out is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("time_out is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(Integer value) {
            addCriterion("time_out =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(Integer value) {
            addCriterion("time_out <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(Integer value) {
            addCriterion("time_out >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_out >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(Integer value) {
            addCriterion("time_out <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("time_out <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<Integer> values) {
            addCriterion("time_out in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<Integer> values) {
            addCriterion("time_out not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(Integer value1, Integer value2) {
            addCriterion("time_out between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("time_out not between", value1, value2, "timeOut");
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