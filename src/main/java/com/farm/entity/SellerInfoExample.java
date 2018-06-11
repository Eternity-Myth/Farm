package com.farm.entity;

import java.util.ArrayList;
import java.util.List;

public class SellerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerInfoExample() {
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

        public Criteria andSellerPhoneIsNull() {
            addCriterion("seller_phone is null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNotNull() {
            addCriterion("seller_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneEqualTo(String value) {
            addCriterion("seller_phone =", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotEqualTo(String value) {
            addCriterion("seller_phone <>", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThan(String value) {
            addCriterion("seller_phone >", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("seller_phone >=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThan(String value) {
            addCriterion("seller_phone <", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThanOrEqualTo(String value) {
            addCriterion("seller_phone <=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLike(String value) {
            addCriterion("seller_phone like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotLike(String value) {
            addCriterion("seller_phone not like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIn(List<String> values) {
            addCriterion("seller_phone in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotIn(List<String> values) {
            addCriterion("seller_phone not in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneBetween(String value1, String value2) {
            addCriterion("seller_phone between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotBetween(String value1, String value2) {
            addCriterion("seller_phone not between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameIsNull() {
            addCriterion("seller_company_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameIsNotNull() {
            addCriterion("seller_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameEqualTo(String value) {
            addCriterion("seller_company_name =", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameNotEqualTo(String value) {
            addCriterion("seller_company_name <>", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameGreaterThan(String value) {
            addCriterion("seller_company_name >", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_company_name >=", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameLessThan(String value) {
            addCriterion("seller_company_name <", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("seller_company_name <=", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameLike(String value) {
            addCriterion("seller_company_name like", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameNotLike(String value) {
            addCriterion("seller_company_name not like", value, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameIn(List<String> values) {
            addCriterion("seller_company_name in", values, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameNotIn(List<String> values) {
            addCriterion("seller_company_name not in", values, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameBetween(String value1, String value2) {
            addCriterion("seller_company_name between", value1, value2, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerCompanyNameNotBetween(String value1, String value2) {
            addCriterion("seller_company_name not between", value1, value2, "sellerCompanyName");
            return (Criteria) this;
        }

        public Criteria andSellerAddIsNull() {
            addCriterion("seller_add is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddIsNotNull() {
            addCriterion("seller_add is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddEqualTo(String value) {
            addCriterion("seller_add =", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddNotEqualTo(String value) {
            addCriterion("seller_add <>", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddGreaterThan(String value) {
            addCriterion("seller_add >", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddGreaterThanOrEqualTo(String value) {
            addCriterion("seller_add >=", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddLessThan(String value) {
            addCriterion("seller_add <", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddLessThanOrEqualTo(String value) {
            addCriterion("seller_add <=", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddLike(String value) {
            addCriterion("seller_add like", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddNotLike(String value) {
            addCriterion("seller_add not like", value, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddIn(List<String> values) {
            addCriterion("seller_add in", values, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddNotIn(List<String> values) {
            addCriterion("seller_add not in", values, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddBetween(String value1, String value2) {
            addCriterion("seller_add between", value1, value2, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerAddNotBetween(String value1, String value2) {
            addCriterion("seller_add not between", value1, value2, "sellerAdd");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNull() {
            addCriterion("seller_state is null");
            return (Criteria) this;
        }

        public Criteria andSellerStateIsNotNull() {
            addCriterion("seller_state is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStateEqualTo(Boolean value) {
            addCriterion("seller_state =", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotEqualTo(Boolean value) {
            addCriterion("seller_state <>", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThan(Boolean value) {
            addCriterion("seller_state >", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seller_state >=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThan(Boolean value) {
            addCriterion("seller_state <", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateLessThanOrEqualTo(Boolean value) {
            addCriterion("seller_state <=", value, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateIn(List<Boolean> values) {
            addCriterion("seller_state in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotIn(List<Boolean> values) {
            addCriterion("seller_state not in", values, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_state between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seller_state not between", value1, value2, "sellerState");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumIsNull() {
            addCriterion("seller_alipaynum is null");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumIsNotNull() {
            addCriterion("seller_alipaynum is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumEqualTo(String value) {
            addCriterion("seller_alipaynum =", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumNotEqualTo(String value) {
            addCriterion("seller_alipaynum <>", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumGreaterThan(String value) {
            addCriterion("seller_alipaynum >", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumGreaterThanOrEqualTo(String value) {
            addCriterion("seller_alipaynum >=", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumLessThan(String value) {
            addCriterion("seller_alipaynum <", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumLessThanOrEqualTo(String value) {
            addCriterion("seller_alipaynum <=", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumLike(String value) {
            addCriterion("seller_alipaynum like", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumNotLike(String value) {
            addCriterion("seller_alipaynum not like", value, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumIn(List<String> values) {
            addCriterion("seller_alipaynum in", values, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumNotIn(List<String> values) {
            addCriterion("seller_alipaynum not in", values, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumBetween(String value1, String value2) {
            addCriterion("seller_alipaynum between", value1, value2, "sellerAlipaynum");
            return (Criteria) this;
        }

        public Criteria andSellerAlipaynumNotBetween(String value1, String value2) {
            addCriterion("seller_alipaynum not between", value1, value2, "sellerAlipaynum");
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