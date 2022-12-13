package com.yunbo.demo.db.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrganizationServiceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationServiceInfoExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("organization_id like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("organization_id not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIsNull() {
            addCriterion("service_url is null");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIsNotNull() {
            addCriterion("service_url is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUrlEqualTo(String value) {
            addCriterion("service_url =", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotEqualTo(String value) {
            addCriterion("service_url <>", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlGreaterThan(String value) {
            addCriterion("service_url >", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("service_url >=", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLessThan(String value) {
            addCriterion("service_url <", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLessThanOrEqualTo(String value) {
            addCriterion("service_url <=", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLike(String value) {
            addCriterion("service_url like", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotLike(String value) {
            addCriterion("service_url not like", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIn(List<String> values) {
            addCriterion("service_url in", values, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotIn(List<String> values) {
            addCriterion("service_url not in", values, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlBetween(String value1, String value2) {
            addCriterion("service_url between", value1, value2, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotBetween(String value1, String value2) {
            addCriterion("service_url not between", value1, value2, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyIsNull() {
            addCriterion("service_image_s3_key is null");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyIsNotNull() {
            addCriterion("service_image_s3_key is not null");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyEqualTo(String value) {
            addCriterion("service_image_s3_key =", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyNotEqualTo(String value) {
            addCriterion("service_image_s3_key <>", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyGreaterThan(String value) {
            addCriterion("service_image_s3_key >", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyGreaterThanOrEqualTo(String value) {
            addCriterion("service_image_s3_key >=", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyLessThan(String value) {
            addCriterion("service_image_s3_key <", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyLessThanOrEqualTo(String value) {
            addCriterion("service_image_s3_key <=", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyLike(String value) {
            addCriterion("service_image_s3_key like", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyNotLike(String value) {
            addCriterion("service_image_s3_key not like", value, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyIn(List<String> values) {
            addCriterion("service_image_s3_key in", values, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyNotIn(List<String> values) {
            addCriterion("service_image_s3_key not in", values, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyBetween(String value1, String value2) {
            addCriterion("service_image_s3_key between", value1, value2, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceImageS3KeyNotBetween(String value1, String value2) {
            addCriterion("service_image_s3_key not between", value1, value2, "serviceImageS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyIsNull() {
            addCriterion("service_active_icon_s3_key is null");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyIsNotNull() {
            addCriterion("service_active_icon_s3_key is not null");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyEqualTo(String value) {
            addCriterion("service_active_icon_s3_key =", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyNotEqualTo(String value) {
            addCriterion("service_active_icon_s3_key <>", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyGreaterThan(String value) {
            addCriterion("service_active_icon_s3_key >", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyGreaterThanOrEqualTo(String value) {
            addCriterion("service_active_icon_s3_key >=", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyLessThan(String value) {
            addCriterion("service_active_icon_s3_key <", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyLessThanOrEqualTo(String value) {
            addCriterion("service_active_icon_s3_key <=", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyLike(String value) {
            addCriterion("service_active_icon_s3_key like", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyNotLike(String value) {
            addCriterion("service_active_icon_s3_key not like", value, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyIn(List<String> values) {
            addCriterion("service_active_icon_s3_key in", values, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyNotIn(List<String> values) {
            addCriterion("service_active_icon_s3_key not in", values, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyBetween(String value1, String value2) {
            addCriterion("service_active_icon_s3_key between", value1, value2, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceActiveIconS3KeyNotBetween(String value1, String value2) {
            addCriterion("service_active_icon_s3_key not between", value1, value2, "serviceActiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyIsNull() {
            addCriterion("service_inactive_icon_s3_key is null");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyIsNotNull() {
            addCriterion("service_inactive_icon_s3_key is not null");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyEqualTo(String value) {
            addCriterion("service_inactive_icon_s3_key =", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyNotEqualTo(String value) {
            addCriterion("service_inactive_icon_s3_key <>", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyGreaterThan(String value) {
            addCriterion("service_inactive_icon_s3_key >", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyGreaterThanOrEqualTo(String value) {
            addCriterion("service_inactive_icon_s3_key >=", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyLessThan(String value) {
            addCriterion("service_inactive_icon_s3_key <", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyLessThanOrEqualTo(String value) {
            addCriterion("service_inactive_icon_s3_key <=", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyLike(String value) {
            addCriterion("service_inactive_icon_s3_key like", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyNotLike(String value) {
            addCriterion("service_inactive_icon_s3_key not like", value, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyIn(List<String> values) {
            addCriterion("service_inactive_icon_s3_key in", values, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyNotIn(List<String> values) {
            addCriterion("service_inactive_icon_s3_key not in", values, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyBetween(String value1, String value2) {
            addCriterion("service_inactive_icon_s3_key between", value1, value2, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andServiceInactiveIconS3KeyNotBetween(String value1, String value2) {
            addCriterion("service_inactive_icon_s3_key not between", value1, value2, "serviceInactiveIconS3Key");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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