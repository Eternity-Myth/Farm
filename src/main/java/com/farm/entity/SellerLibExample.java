package com.farm.entity;

import java.util.ArrayList;
import java.util.List;

public class SellerLibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerLibExample() {
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

        public Criteria andSellerlibIdIsNull() {
            addCriterion("sellerlib_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdIsNotNull() {
            addCriterion("sellerlib_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdEqualTo(Integer value) {
            addCriterion("sellerlib_id =", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdNotEqualTo(Integer value) {
            addCriterion("sellerlib_id <>", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdGreaterThan(Integer value) {
            addCriterion("sellerlib_id >", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerlib_id >=", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdLessThan(Integer value) {
            addCriterion("sellerlib_id <", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerlib_id <=", value, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdIn(List<Integer> values) {
            addCriterion("sellerlib_id in", values, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdNotIn(List<Integer> values) {
            addCriterion("sellerlib_id not in", values, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerlib_id between", value1, value2, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerlibIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerlib_id not between", value1, value2, "sellerlibId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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

        public Criteria andSellerItemNumIsNull() {
            addCriterion("seller_item_num is null");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumIsNotNull() {
            addCriterion("seller_item_num is not null");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumEqualTo(Integer value) {
            addCriterion("seller_item_num =", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumNotEqualTo(Integer value) {
            addCriterion("seller_item_num <>", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumGreaterThan(Integer value) {
            addCriterion("seller_item_num >", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_item_num >=", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumLessThan(Integer value) {
            addCriterion("seller_item_num <", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("seller_item_num <=", value, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumIn(List<Integer> values) {
            addCriterion("seller_item_num in", values, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumNotIn(List<Integer> values) {
            addCriterion("seller_item_num not in", values, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumBetween(Integer value1, Integer value2) {
            addCriterion("seller_item_num between", value1, value2, "sellerItemNum");
            return (Criteria) this;
        }

        public Criteria andSellerItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_item_num not between", value1, value2, "sellerItemNum");
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

        public Criteria andItemUpdatetimeEqualTo(String value) {
            addCriterion("item_updatetime =", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotEqualTo(String value) {
            addCriterion("item_updatetime <>", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeGreaterThan(String value) {
            addCriterion("item_updatetime >", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("item_updatetime >=", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeLessThan(String value) {
            addCriterion("item_updatetime <", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("item_updatetime <=", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeLike(String value) {
            addCriterion("item_updatetime like", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotLike(String value) {
            addCriterion("item_updatetime not like", value, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeIn(List<String> values) {
            addCriterion("item_updatetime in", values, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotIn(List<String> values) {
            addCriterion("item_updatetime not in", values, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeBetween(String value1, String value2) {
            addCriterion("item_updatetime between", value1, value2, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andItemUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("item_updatetime not between", value1, value2, "itemUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateIsNull() {
            addCriterion("seller_item_state is null");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateIsNotNull() {
            addCriterion("seller_item_state is not null");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateEqualTo(Boolean value) {
            addCriterion("seller_item_state =", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateNotEqualTo(Boolean value) {
            addCriterion("seller_item_state <>", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateGreaterThan(Boolean value) {
            addCriterion("seller_item_state >", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seller_item_state >=", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateLessThan(Boolean value) {
            addCriterion("seller_item_state <", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateLessThanOrEqualTo(Boolean value) {
            addCriterion("seller_item_state <=", value, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateIn(List<Boolean> values) {
            addCriterion("seller_item_state in", values, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateNotIn(List<Boolean> values) {
            addCriterion("seller_item_state not in", values, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_item_state between", value1, value2, "sellerItemState");
            return (Criteria) this;
        }

        public Criteria andSellerItemStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_item_state not between", value1, value2, "sellerItemState");
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