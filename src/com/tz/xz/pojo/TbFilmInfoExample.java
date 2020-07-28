package com.tz.xz.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbFilmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFilmInfoExample() {
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

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("f_type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("f_type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("f_type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("f_type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("f_type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("f_type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("f_type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("f_type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("f_type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("f_type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("f_type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("f_type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("f_type not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFScoreIsNull() {
            addCriterion("f_score is null");
            return (Criteria) this;
        }

        public Criteria andFScoreIsNotNull() {
            addCriterion("f_score is not null");
            return (Criteria) this;
        }

        public Criteria andFScoreEqualTo(Integer value) {
            addCriterion("f_score =", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreNotEqualTo(Integer value) {
            addCriterion("f_score <>", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreGreaterThan(Integer value) {
            addCriterion("f_score >", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_score >=", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreLessThan(Integer value) {
            addCriterion("f_score <", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreLessThanOrEqualTo(Integer value) {
            addCriterion("f_score <=", value, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreIn(List<Integer> values) {
            addCriterion("f_score in", values, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreNotIn(List<Integer> values) {
            addCriterion("f_score not in", values, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreBetween(Integer value1, Integer value2) {
            addCriterion("f_score between", value1, value2, "fScore");
            return (Criteria) this;
        }

        public Criteria andFScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("f_score not between", value1, value2, "fScore");
            return (Criteria) this;
        }

        public Criteria andFPlayYearIsNull() {
            addCriterion("f_play_year is null");
            return (Criteria) this;
        }

        public Criteria andFPlayYearIsNotNull() {
            addCriterion("f_play_year is not null");
            return (Criteria) this;
        }

        public Criteria andFPlayYearEqualTo(Integer value) {
            addCriterion("f_play_year =", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearNotEqualTo(Integer value) {
            addCriterion("f_play_year <>", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearGreaterThan(Integer value) {
            addCriterion("f_play_year >", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_play_year >=", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearLessThan(Integer value) {
            addCriterion("f_play_year <", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearLessThanOrEqualTo(Integer value) {
            addCriterion("f_play_year <=", value, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearIn(List<Integer> values) {
            addCriterion("f_play_year in", values, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearNotIn(List<Integer> values) {
            addCriterion("f_play_year not in", values, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearBetween(Integer value1, Integer value2) {
            addCriterion("f_play_year between", value1, value2, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFPlayYearNotBetween(Integer value1, Integer value2) {
            addCriterion("f_play_year not between", value1, value2, "fPlayYear");
            return (Criteria) this;
        }

        public Criteria andFOriginIsNull() {
            addCriterion("f_origin is null");
            return (Criteria) this;
        }

        public Criteria andFOriginIsNotNull() {
            addCriterion("f_origin is not null");
            return (Criteria) this;
        }

        public Criteria andFOriginEqualTo(String value) {
            addCriterion("f_origin =", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginNotEqualTo(String value) {
            addCriterion("f_origin <>", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginGreaterThan(String value) {
            addCriterion("f_origin >", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginGreaterThanOrEqualTo(String value) {
            addCriterion("f_origin >=", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginLessThan(String value) {
            addCriterion("f_origin <", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginLessThanOrEqualTo(String value) {
            addCriterion("f_origin <=", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginLike(String value) {
            addCriterion("f_origin like", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginNotLike(String value) {
            addCriterion("f_origin not like", value, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginIn(List<String> values) {
            addCriterion("f_origin in", values, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginNotIn(List<String> values) {
            addCriterion("f_origin not in", values, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginBetween(String value1, String value2) {
            addCriterion("f_origin between", value1, value2, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFOriginNotBetween(String value1, String value2) {
            addCriterion("f_origin not between", value1, value2, "fOrigin");
            return (Criteria) this;
        }

        public Criteria andFPicIsNull() {
            addCriterion("f_pic is null");
            return (Criteria) this;
        }

        public Criteria andFPicIsNotNull() {
            addCriterion("f_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFPicEqualTo(String value) {
            addCriterion("f_pic =", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotEqualTo(String value) {
            addCriterion("f_pic <>", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicGreaterThan(String value) {
            addCriterion("f_pic >", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicGreaterThanOrEqualTo(String value) {
            addCriterion("f_pic >=", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLessThan(String value) {
            addCriterion("f_pic <", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLessThanOrEqualTo(String value) {
            addCriterion("f_pic <=", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicLike(String value) {
            addCriterion("f_pic like", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotLike(String value) {
            addCriterion("f_pic not like", value, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicIn(List<String> values) {
            addCriterion("f_pic in", values, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotIn(List<String> values) {
            addCriterion("f_pic not in", values, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicBetween(String value1, String value2) {
            addCriterion("f_pic between", value1, value2, "fPic");
            return (Criteria) this;
        }

        public Criteria andFPicNotBetween(String value1, String value2) {
            addCriterion("f_pic not between", value1, value2, "fPic");
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