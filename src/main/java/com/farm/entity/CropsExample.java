package com.farm.entity;

import java.util.ArrayList;
import java.util.List;

public class CropsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CropsExample() {
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

        public Criteria andCropsnameIsNull() {
            addCriterion("cropsName is null");
            return (Criteria) this;
        }

        public Criteria andCropsnameIsNotNull() {
            addCriterion("cropsName is not null");
            return (Criteria) this;
        }

        public Criteria andCropsnameEqualTo(String value) {
            addCriterion("cropsName =", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameNotEqualTo(String value) {
            addCriterion("cropsName <>", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameGreaterThan(String value) {
            addCriterion("cropsName >", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameGreaterThanOrEqualTo(String value) {
            addCriterion("cropsName >=", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameLessThan(String value) {
            addCriterion("cropsName <", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameLessThanOrEqualTo(String value) {
            addCriterion("cropsName <=", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameLike(String value) {
            addCriterion("cropsName like", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameNotLike(String value) {
            addCriterion("cropsName not like", value, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameIn(List<String> values) {
            addCriterion("cropsName in", values, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameNotIn(List<String> values) {
            addCriterion("cropsName not in", values, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameBetween(String value1, String value2) {
            addCriterion("cropsName between", value1, value2, "cropsname");
            return (Criteria) this;
        }

        public Criteria andCropsnameNotBetween(String value1, String value2) {
            addCriterion("cropsName not between", value1, value2, "cropsname");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Float value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Float value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Float value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Float value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Float value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Float> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Float> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Float value1, Float value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Float value1, Float value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Float value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Float value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Float value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Float value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Float value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Float> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Float> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Float value1, Float value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Float value1, Float value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andCropstimeIsNull() {
            addCriterion("cropsTime is null");
            return (Criteria) this;
        }

        public Criteria andCropstimeIsNotNull() {
            addCriterion("cropsTime is not null");
            return (Criteria) this;
        }

        public Criteria andCropstimeEqualTo(Integer value) {
            addCriterion("cropsTime =", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeNotEqualTo(Integer value) {
            addCriterion("cropsTime <>", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeGreaterThan(Integer value) {
            addCriterion("cropsTime >", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cropsTime >=", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeLessThan(Integer value) {
            addCriterion("cropsTime <", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeLessThanOrEqualTo(Integer value) {
            addCriterion("cropsTime <=", value, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeIn(List<Integer> values) {
            addCriterion("cropsTime in", values, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeNotIn(List<Integer> values) {
            addCriterion("cropsTime not in", values, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeBetween(Integer value1, Integer value2) {
            addCriterion("cropsTime between", value1, value2, "cropstime");
            return (Criteria) this;
        }

        public Criteria andCropstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cropsTime not between", value1, value2, "cropstime");
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