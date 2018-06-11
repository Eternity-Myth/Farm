package com.farm.entity;

import java.util.ArrayList;
import java.util.List;

public class MiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiddleExample() {
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

        public Criteria andMFidIsNull() {
            addCriterion("m_fid is null");
            return (Criteria) this;
        }

        public Criteria andMFidIsNotNull() {
            addCriterion("m_fid is not null");
            return (Criteria) this;
        }

        public Criteria andMFidEqualTo(Integer value) {
            addCriterion("m_fid =", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidNotEqualTo(Integer value) {
            addCriterion("m_fid <>", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidGreaterThan(Integer value) {
            addCriterion("m_fid >", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_fid >=", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidLessThan(Integer value) {
            addCriterion("m_fid <", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidLessThanOrEqualTo(Integer value) {
            addCriterion("m_fid <=", value, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidIn(List<Integer> values) {
            addCriterion("m_fid in", values, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidNotIn(List<Integer> values) {
            addCriterion("m_fid not in", values, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidBetween(Integer value1, Integer value2) {
            addCriterion("m_fid between", value1, value2, "mFid");
            return (Criteria) this;
        }

        public Criteria andMFidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_fid not between", value1, value2, "mFid");
            return (Criteria) this;
        }

        public Criteria andMCidIsNull() {
            addCriterion("m_cid is null");
            return (Criteria) this;
        }

        public Criteria andMCidIsNotNull() {
            addCriterion("m_cid is not null");
            return (Criteria) this;
        }

        public Criteria andMCidEqualTo(Integer value) {
            addCriterion("m_cid =", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidNotEqualTo(Integer value) {
            addCriterion("m_cid <>", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidGreaterThan(Integer value) {
            addCriterion("m_cid >", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_cid >=", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidLessThan(Integer value) {
            addCriterion("m_cid <", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidLessThanOrEqualTo(Integer value) {
            addCriterion("m_cid <=", value, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidIn(List<Integer> values) {
            addCriterion("m_cid in", values, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidNotIn(List<Integer> values) {
            addCriterion("m_cid not in", values, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidBetween(Integer value1, Integer value2) {
            addCriterion("m_cid between", value1, value2, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_cid not between", value1, value2, "mCid");
            return (Criteria) this;
        }

        public Criteria andMCnameIsNull() {
            addCriterion("m_cname is null");
            return (Criteria) this;
        }

        public Criteria andMCnameIsNotNull() {
            addCriterion("m_cname is not null");
            return (Criteria) this;
        }

        public Criteria andMCnameEqualTo(String value) {
            addCriterion("m_cname =", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameNotEqualTo(String value) {
            addCriterion("m_cname <>", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameGreaterThan(String value) {
            addCriterion("m_cname >", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameGreaterThanOrEqualTo(String value) {
            addCriterion("m_cname >=", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameLessThan(String value) {
            addCriterion("m_cname <", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameLessThanOrEqualTo(String value) {
            addCriterion("m_cname <=", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameLike(String value) {
            addCriterion("m_cname like", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameNotLike(String value) {
            addCriterion("m_cname not like", value, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameIn(List<String> values) {
            addCriterion("m_cname in", values, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameNotIn(List<String> values) {
            addCriterion("m_cname not in", values, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameBetween(String value1, String value2) {
            addCriterion("m_cname between", value1, value2, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCnameNotBetween(String value1, String value2) {
            addCriterion("m_cname not between", value1, value2, "mCname");
            return (Criteria) this;
        }

        public Criteria andMCprofitIsNull() {
            addCriterion("m_cprofit is null");
            return (Criteria) this;
        }

        public Criteria andMCprofitIsNotNull() {
            addCriterion("m_cprofit is not null");
            return (Criteria) this;
        }

        public Criteria andMCprofitEqualTo(Float value) {
            addCriterion("m_cprofit =", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitNotEqualTo(Float value) {
            addCriterion("m_cprofit <>", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitGreaterThan(Float value) {
            addCriterion("m_cprofit >", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitGreaterThanOrEqualTo(Float value) {
            addCriterion("m_cprofit >=", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitLessThan(Float value) {
            addCriterion("m_cprofit <", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitLessThanOrEqualTo(Float value) {
            addCriterion("m_cprofit <=", value, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitIn(List<Float> values) {
            addCriterion("m_cprofit in", values, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitNotIn(List<Float> values) {
            addCriterion("m_cprofit not in", values, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitBetween(Float value1, Float value2) {
            addCriterion("m_cprofit between", value1, value2, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andMCprofitNotBetween(Float value1, Float value2) {
            addCriterion("m_cprofit not between", value1, value2, "mCprofit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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