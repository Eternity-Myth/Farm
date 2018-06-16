package com.farm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssignmentExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssiStateIsNull() {
            addCriterion("assi_state is null");
            return (Criteria) this;
        }

        public Criteria andAssiStateIsNotNull() {
            addCriterion("assi_state is not null");
            return (Criteria) this;
        }

        public Criteria andAssiStateEqualTo(Boolean value) {
            addCriterion("assi_state =", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateNotEqualTo(Boolean value) {
            addCriterion("assi_state <>", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateGreaterThan(Boolean value) {
            addCriterion("assi_state >", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("assi_state >=", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateLessThan(Boolean value) {
            addCriterion("assi_state <", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateLessThanOrEqualTo(Boolean value) {
            addCriterion("assi_state <=", value, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateIn(List<Boolean> values) {
            addCriterion("assi_state in", values, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateNotIn(List<Boolean> values) {
            addCriterion("assi_state not in", values, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateBetween(Boolean value1, Boolean value2) {
            addCriterion("assi_state between", value1, value2, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("assi_state not between", value1, value2, "assiState");
            return (Criteria) this;
        }

        public Criteria andAssiTypeIsNull() {
            addCriterion("assi_type is null");
            return (Criteria) this;
        }

        public Criteria andAssiTypeIsNotNull() {
            addCriterion("assi_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssiTypeEqualTo(String value) {
            addCriterion("assi_type =", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeNotEqualTo(String value) {
            addCriterion("assi_type <>", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeGreaterThan(String value) {
            addCriterion("assi_type >", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("assi_type >=", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeLessThan(String value) {
            addCriterion("assi_type <", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeLessThanOrEqualTo(String value) {
            addCriterion("assi_type <=", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeLike(String value) {
            addCriterion("assi_type like", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeNotLike(String value) {
            addCriterion("assi_type not like", value, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeIn(List<String> values) {
            addCriterion("assi_type in", values, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeNotIn(List<String> values) {
            addCriterion("assi_type not in", values, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeBetween(String value1, String value2) {
            addCriterion("assi_type between", value1, value2, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiTypeNotBetween(String value1, String value2) {
            addCriterion("assi_type not between", value1, value2, "assiType");
            return (Criteria) this;
        }

        public Criteria andAssiDataIsNull() {
            addCriterion("assi_data is null");
            return (Criteria) this;
        }

        public Criteria andAssiDataIsNotNull() {
            addCriterion("assi_data is not null");
            return (Criteria) this;
        }

        public Criteria andAssiDataEqualTo(String value) {
            addCriterion("assi_data =", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataNotEqualTo(String value) {
            addCriterion("assi_data <>", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataGreaterThan(String value) {
            addCriterion("assi_data >", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataGreaterThanOrEqualTo(String value) {
            addCriterion("assi_data >=", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataLessThan(String value) {
            addCriterion("assi_data <", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataLessThanOrEqualTo(String value) {
            addCriterion("assi_data <=", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataLike(String value) {
            addCriterion("assi_data like", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataNotLike(String value) {
            addCriterion("assi_data not like", value, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataIn(List<String> values) {
            addCriterion("assi_data in", values, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataNotIn(List<String> values) {
            addCriterion("assi_data not in", values, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataBetween(String value1, String value2) {
            addCriterion("assi_data between", value1, value2, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiDataNotBetween(String value1, String value2) {
            addCriterion("assi_data not between", value1, value2, "assiData");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameIsNull() {
            addCriterion("assi_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameIsNotNull() {
            addCriterion("assi_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameEqualTo(String value) {
            addCriterion("assi_nickname =", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameNotEqualTo(String value) {
            addCriterion("assi_nickname <>", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameGreaterThan(String value) {
            addCriterion("assi_nickname >", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("assi_nickname >=", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameLessThan(String value) {
            addCriterion("assi_nickname <", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameLessThanOrEqualTo(String value) {
            addCriterion("assi_nickname <=", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameLike(String value) {
            addCriterion("assi_nickname like", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameNotLike(String value) {
            addCriterion("assi_nickname not like", value, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameIn(List<String> values) {
            addCriterion("assi_nickname in", values, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameNotIn(List<String> values) {
            addCriterion("assi_nickname not in", values, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameBetween(String value1, String value2) {
            addCriterion("assi_nickname between", value1, value2, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiNicknameNotBetween(String value1, String value2) {
            addCriterion("assi_nickname not between", value1, value2, "assiNickname");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeIsNull() {
            addCriterion("assi_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeIsNotNull() {
            addCriterion("assi_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeEqualTo(Date value) {
            addCriterion("assi_createtime =", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeNotEqualTo(Date value) {
            addCriterion("assi_createtime <>", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeGreaterThan(Date value) {
            addCriterion("assi_createtime >", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assi_createtime >=", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeLessThan(Date value) {
            addCriterion("assi_createtime <", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("assi_createtime <=", value, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeIn(List<Date> values) {
            addCriterion("assi_createtime in", values, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeNotIn(List<Date> values) {
            addCriterion("assi_createtime not in", values, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeBetween(Date value1, Date value2) {
            addCriterion("assi_createtime between", value1, value2, "assiCreatetime");
            return (Criteria) this;
        }

        public Criteria andAssiCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("assi_createtime not between", value1, value2, "assiCreatetime");
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