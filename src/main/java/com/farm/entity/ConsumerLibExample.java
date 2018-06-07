package com.farm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsumerLibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumerLibExample() {
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

        public Criteria andConIdIsNull() {
            addCriterion("con_id is null");
            return (Criteria) this;
        }

        public Criteria andConIdIsNotNull() {
            addCriterion("con_id is not null");
            return (Criteria) this;
        }

        public Criteria andConIdEqualTo(Integer value) {
            addCriterion("con_id =", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotEqualTo(Integer value) {
            addCriterion("con_id <>", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThan(Integer value) {
            addCriterion("con_id >", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_id >=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThan(Integer value) {
            addCriterion("con_id <", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThanOrEqualTo(Integer value) {
            addCriterion("con_id <=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdIn(List<Integer> values) {
            addCriterion("con_id in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotIn(List<Integer> values) {
            addCriterion("con_id not in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdBetween(Integer value1, Integer value2) {
            addCriterion("con_id between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotBetween(Integer value1, Integer value2) {
            addCriterion("con_id not between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andUserItemNumIsNull() {
            addCriterion("user_item_num is null");
            return (Criteria) this;
        }

        public Criteria andUserItemNumIsNotNull() {
            addCriterion("user_item_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserItemNumEqualTo(Integer value) {
            addCriterion("user_item_num =", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumNotEqualTo(Integer value) {
            addCriterion("user_item_num <>", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumGreaterThan(Integer value) {
            addCriterion("user_item_num >", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_item_num >=", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumLessThan(Integer value) {
            addCriterion("user_item_num <", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_item_num <=", value, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumIn(List<Integer> values) {
            addCriterion("user_item_num in", values, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumNotIn(List<Integer> values) {
            addCriterion("user_item_num not in", values, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumBetween(Integer value1, Integer value2) {
            addCriterion("user_item_num between", value1, value2, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andUserItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_item_num not between", value1, value2, "userItemNum");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeIsNull() {
            addCriterion("item_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeIsNotNull() {
            addCriterion("item_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeEqualTo(Date value) {
            addCriterion("item_updatetime =", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotEqualTo(Date value) {
            addCriterion("item_updatetime <>", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeGreaterThan(Date value) {
            addCriterion("item_updatetime >", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("item_updatetime >=", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeLessThan(Date value) {
            addCriterion("item_updatetime <", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("item_updatetime <=", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeIn(List<Date> values) {
            addCriterion("item_updatetime in", values, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotIn(List<Date> values) {
            addCriterion("item_updatetime not in", values, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("item_updatetime between", value1, value2, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("item_updatetime not between", value1, value2, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserItemStateIsNull() {
            addCriterion("user_item_state is null");
            return (Criteria) this;
        }

        public Criteria andUserItemStateIsNotNull() {
            addCriterion("user_item_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserItemStateEqualTo(Boolean value) {
            addCriterion("user_item_state =", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateNotEqualTo(Boolean value) {
            addCriterion("user_item_state <>", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateGreaterThan(Boolean value) {
            addCriterion("user_item_state >", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_item_state >=", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateLessThan(Boolean value) {
            addCriterion("user_item_state <", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateLessThanOrEqualTo(Boolean value) {
            addCriterion("user_item_state <=", value, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateIn(List<Boolean> values) {
            addCriterion("user_item_state in", values, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateNotIn(List<Boolean> values) {
            addCriterion("user_item_state not in", values, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateBetween(Boolean value1, Boolean value2) {
            addCriterion("user_item_state between", value1, value2, "userItemState");
            return (Criteria) this;
        }

        public Criteria andUserItemStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_item_state not between", value1, value2, "userItemState");
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