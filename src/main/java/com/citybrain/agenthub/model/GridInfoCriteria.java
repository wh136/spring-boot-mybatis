package com.citybrain.agenthub.model;

import java.util.ArrayList;
import java.util.List;

public class GridInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GridInfoCriteria() {
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

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(String value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(String value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(String value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(String value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(String value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLike(String value) {
            addCriterion("zone_id like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotLike(String value) {
            addCriterion("zone_id not like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<String> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<String> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(String value1, String value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(String value1, String value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneLngIsNull() {
            addCriterion("zone_lng is null");
            return (Criteria) this;
        }

        public Criteria andZoneLngIsNotNull() {
            addCriterion("zone_lng is not null");
            return (Criteria) this;
        }

        public Criteria andZoneLngEqualTo(String value) {
            addCriterion("zone_lng =", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngNotEqualTo(String value) {
            addCriterion("zone_lng <>", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngGreaterThan(String value) {
            addCriterion("zone_lng >", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngGreaterThanOrEqualTo(String value) {
            addCriterion("zone_lng >=", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngLessThan(String value) {
            addCriterion("zone_lng <", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngLessThanOrEqualTo(String value) {
            addCriterion("zone_lng <=", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngLike(String value) {
            addCriterion("zone_lng like", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngNotLike(String value) {
            addCriterion("zone_lng not like", value, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngIn(List<String> values) {
            addCriterion("zone_lng in", values, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngNotIn(List<String> values) {
            addCriterion("zone_lng not in", values, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngBetween(String value1, String value2) {
            addCriterion("zone_lng between", value1, value2, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLngNotBetween(String value1, String value2) {
            addCriterion("zone_lng not between", value1, value2, "zoneLng");
            return (Criteria) this;
        }

        public Criteria andZoneLatIsNull() {
            addCriterion("zone_lat is null");
            return (Criteria) this;
        }

        public Criteria andZoneLatIsNotNull() {
            addCriterion("zone_lat is not null");
            return (Criteria) this;
        }

        public Criteria andZoneLatEqualTo(String value) {
            addCriterion("zone_lat =", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatNotEqualTo(String value) {
            addCriterion("zone_lat <>", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatGreaterThan(String value) {
            addCriterion("zone_lat >", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatGreaterThanOrEqualTo(String value) {
            addCriterion("zone_lat >=", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatLessThan(String value) {
            addCriterion("zone_lat <", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatLessThanOrEqualTo(String value) {
            addCriterion("zone_lat <=", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatLike(String value) {
            addCriterion("zone_lat like", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatNotLike(String value) {
            addCriterion("zone_lat not like", value, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatIn(List<String> values) {
            addCriterion("zone_lat in", values, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatNotIn(List<String> values) {
            addCriterion("zone_lat not in", values, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatBetween(String value1, String value2) {
            addCriterion("zone_lat between", value1, value2, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andZoneLatNotBetween(String value1, String value2) {
            addCriterion("zone_lat not between", value1, value2, "zoneLat");
            return (Criteria) this;
        }

        public Criteria andCntUserIsNull() {
            addCriterion("cnt_user is null");
            return (Criteria) this;
        }

        public Criteria andCntUserIsNotNull() {
            addCriterion("cnt_user is not null");
            return (Criteria) this;
        }

        public Criteria andCntUserEqualTo(String value) {
            addCriterion("cnt_user =", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserNotEqualTo(String value) {
            addCriterion("cnt_user <>", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserGreaterThan(String value) {
            addCriterion("cnt_user >", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserGreaterThanOrEqualTo(String value) {
            addCriterion("cnt_user >=", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserLessThan(String value) {
            addCriterion("cnt_user <", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserLessThanOrEqualTo(String value) {
            addCriterion("cnt_user <=", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserLike(String value) {
            addCriterion("cnt_user like", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserNotLike(String value) {
            addCriterion("cnt_user not like", value, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserIn(List<String> values) {
            addCriterion("cnt_user in", values, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserNotIn(List<String> values) {
            addCriterion("cnt_user not in", values, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserBetween(String value1, String value2) {
            addCriterion("cnt_user between", value1, value2, "cntUser");
            return (Criteria) this;
        }

        public Criteria andCntUserNotBetween(String value1, String value2) {
            addCriterion("cnt_user not between", value1, value2, "cntUser");
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