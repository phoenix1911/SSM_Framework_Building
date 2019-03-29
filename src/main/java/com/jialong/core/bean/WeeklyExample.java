package com.jialong.core.bean;

import java.util.ArrayList;
import java.util.List;

public class WeeklyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeeklyExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andIncludepicIsNull() {
            addCriterion("IncludePic is null");
            return (Criteria) this;
        }

        public Criteria andIncludepicIsNotNull() {
            addCriterion("IncludePic is not null");
            return (Criteria) this;
        }

        public Criteria andIncludepicEqualTo(Integer value) {
            addCriterion("IncludePic =", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicNotEqualTo(Integer value) {
            addCriterion("IncludePic <>", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicGreaterThan(Integer value) {
            addCriterion("IncludePic >", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicGreaterThanOrEqualTo(Integer value) {
            addCriterion("IncludePic >=", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicLessThan(Integer value) {
            addCriterion("IncludePic <", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicLessThanOrEqualTo(Integer value) {
            addCriterion("IncludePic <=", value, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicIn(List<Integer> values) {
            addCriterion("IncludePic in", values, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicNotIn(List<Integer> values) {
            addCriterion("IncludePic not in", values, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicBetween(Integer value1, Integer value2) {
            addCriterion("IncludePic between", value1, value2, "includepic");
            return (Criteria) this;
        }

        public Criteria andIncludepicNotBetween(Integer value1, Integer value2) {
            addCriterion("IncludePic not between", value1, value2, "includepic");
            return (Criteria) this;
        }

        public Criteria andSystemtimeIsNull() {
            addCriterion("systemtime is null");
            return (Criteria) this;
        }

        public Criteria andSystemtimeIsNotNull() {
            addCriterion("systemtime is not null");
            return (Criteria) this;
        }

        public Criteria andSystemtimeEqualTo(String value) {
            addCriterion("systemtime =", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeNotEqualTo(String value) {
            addCriterion("systemtime <>", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeGreaterThan(String value) {
            addCriterion("systemtime >", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeGreaterThanOrEqualTo(String value) {
            addCriterion("systemtime >=", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeLessThan(String value) {
            addCriterion("systemtime <", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeLessThanOrEqualTo(String value) {
            addCriterion("systemtime <=", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeLike(String value) {
            addCriterion("systemtime like", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeNotLike(String value) {
            addCriterion("systemtime not like", value, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeIn(List<String> values) {
            addCriterion("systemtime in", values, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeNotIn(List<String> values) {
            addCriterion("systemtime not in", values, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeBetween(String value1, String value2) {
            addCriterion("systemtime between", value1, value2, "systemtime");
            return (Criteria) this;
        }

        public Criteria andSystemtimeNotBetween(String value1, String value2) {
            addCriterion("systemtime not between", value1, value2, "systemtime");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andP1IsNull() {
            addCriterion("p1 is null");
            return (Criteria) this;
        }

        public Criteria andP1IsNotNull() {
            addCriterion("p1 is not null");
            return (Criteria) this;
        }

        public Criteria andP1EqualTo(String value) {
            addCriterion("p1 =", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotEqualTo(String value) {
            addCriterion("p1 <>", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThan(String value) {
            addCriterion("p1 >", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThanOrEqualTo(String value) {
            addCriterion("p1 >=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThan(String value) {
            addCriterion("p1 <", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThanOrEqualTo(String value) {
            addCriterion("p1 <=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1Like(String value) {
            addCriterion("p1 like", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotLike(String value) {
            addCriterion("p1 not like", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1In(List<String> values) {
            addCriterion("p1 in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotIn(List<String> values) {
            addCriterion("p1 not in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1Between(String value1, String value2) {
            addCriterion("p1 between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotBetween(String value1, String value2) {
            addCriterion("p1 not between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP2IsNull() {
            addCriterion("p2 is null");
            return (Criteria) this;
        }

        public Criteria andP2IsNotNull() {
            addCriterion("p2 is not null");
            return (Criteria) this;
        }

        public Criteria andP2EqualTo(String value) {
            addCriterion("p2 =", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotEqualTo(String value) {
            addCriterion("p2 <>", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThan(String value) {
            addCriterion("p2 >", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThanOrEqualTo(String value) {
            addCriterion("p2 >=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThan(String value) {
            addCriterion("p2 <", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThanOrEqualTo(String value) {
            addCriterion("p2 <=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2Like(String value) {
            addCriterion("p2 like", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotLike(String value) {
            addCriterion("p2 not like", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2In(List<String> values) {
            addCriterion("p2 in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotIn(List<String> values) {
            addCriterion("p2 not in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2Between(String value1, String value2) {
            addCriterion("p2 between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotBetween(String value1, String value2) {
            addCriterion("p2 not between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP3IsNull() {
            addCriterion("p3 is null");
            return (Criteria) this;
        }

        public Criteria andP3IsNotNull() {
            addCriterion("p3 is not null");
            return (Criteria) this;
        }

        public Criteria andP3EqualTo(String value) {
            addCriterion("p3 =", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotEqualTo(String value) {
            addCriterion("p3 <>", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThan(String value) {
            addCriterion("p3 >", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThanOrEqualTo(String value) {
            addCriterion("p3 >=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThan(String value) {
            addCriterion("p3 <", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThanOrEqualTo(String value) {
            addCriterion("p3 <=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3Like(String value) {
            addCriterion("p3 like", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotLike(String value) {
            addCriterion("p3 not like", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3In(List<String> values) {
            addCriterion("p3 in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotIn(List<String> values) {
            addCriterion("p3 not in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3Between(String value1, String value2) {
            addCriterion("p3 between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotBetween(String value1, String value2) {
            addCriterion("p3 not between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP4IsNull() {
            addCriterion("p4 is null");
            return (Criteria) this;
        }

        public Criteria andP4IsNotNull() {
            addCriterion("p4 is not null");
            return (Criteria) this;
        }

        public Criteria andP4EqualTo(String value) {
            addCriterion("p4 =", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotEqualTo(String value) {
            addCriterion("p4 <>", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThan(String value) {
            addCriterion("p4 >", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThanOrEqualTo(String value) {
            addCriterion("p4 >=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThan(String value) {
            addCriterion("p4 <", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThanOrEqualTo(String value) {
            addCriterion("p4 <=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4Like(String value) {
            addCriterion("p4 like", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotLike(String value) {
            addCriterion("p4 not like", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4In(List<String> values) {
            addCriterion("p4 in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotIn(List<String> values) {
            addCriterion("p4 not in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4Between(String value1, String value2) {
            addCriterion("p4 between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotBetween(String value1, String value2) {
            addCriterion("p4 not between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andP5IsNull() {
            addCriterion("p5 is null");
            return (Criteria) this;
        }

        public Criteria andP5IsNotNull() {
            addCriterion("p5 is not null");
            return (Criteria) this;
        }

        public Criteria andP5EqualTo(String value) {
            addCriterion("p5 =", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotEqualTo(String value) {
            addCriterion("p5 <>", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5GreaterThan(String value) {
            addCriterion("p5 >", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5GreaterThanOrEqualTo(String value) {
            addCriterion("p5 >=", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5LessThan(String value) {
            addCriterion("p5 <", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5LessThanOrEqualTo(String value) {
            addCriterion("p5 <=", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5Like(String value) {
            addCriterion("p5 like", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotLike(String value) {
            addCriterion("p5 not like", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5In(List<String> values) {
            addCriterion("p5 in", values, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotIn(List<String> values) {
            addCriterion("p5 not in", values, "p5");
            return (Criteria) this;
        }

        public Criteria andP5Between(String value1, String value2) {
            addCriterion("p5 between", value1, value2, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotBetween(String value1, String value2) {
            addCriterion("p5 not between", value1, value2, "p5");
            return (Criteria) this;
        }

        public Criteria andP6IsNull() {
            addCriterion("p6 is null");
            return (Criteria) this;
        }

        public Criteria andP6IsNotNull() {
            addCriterion("p6 is not null");
            return (Criteria) this;
        }

        public Criteria andP6EqualTo(String value) {
            addCriterion("p6 =", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotEqualTo(String value) {
            addCriterion("p6 <>", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6GreaterThan(String value) {
            addCriterion("p6 >", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6GreaterThanOrEqualTo(String value) {
            addCriterion("p6 >=", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6LessThan(String value) {
            addCriterion("p6 <", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6LessThanOrEqualTo(String value) {
            addCriterion("p6 <=", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6Like(String value) {
            addCriterion("p6 like", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotLike(String value) {
            addCriterion("p6 not like", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6In(List<String> values) {
            addCriterion("p6 in", values, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotIn(List<String> values) {
            addCriterion("p6 not in", values, "p6");
            return (Criteria) this;
        }

        public Criteria andP6Between(String value1, String value2) {
            addCriterion("p6 between", value1, value2, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotBetween(String value1, String value2) {
            addCriterion("p6 not between", value1, value2, "p6");
            return (Criteria) this;
        }

        public Criteria andP7IsNull() {
            addCriterion("p7 is null");
            return (Criteria) this;
        }

        public Criteria andP7IsNotNull() {
            addCriterion("p7 is not null");
            return (Criteria) this;
        }

        public Criteria andP7EqualTo(String value) {
            addCriterion("p7 =", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotEqualTo(String value) {
            addCriterion("p7 <>", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7GreaterThan(String value) {
            addCriterion("p7 >", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7GreaterThanOrEqualTo(String value) {
            addCriterion("p7 >=", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7LessThan(String value) {
            addCriterion("p7 <", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7LessThanOrEqualTo(String value) {
            addCriterion("p7 <=", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7Like(String value) {
            addCriterion("p7 like", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotLike(String value) {
            addCriterion("p7 not like", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7In(List<String> values) {
            addCriterion("p7 in", values, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotIn(List<String> values) {
            addCriterion("p7 not in", values, "p7");
            return (Criteria) this;
        }

        public Criteria andP7Between(String value1, String value2) {
            addCriterion("p7 between", value1, value2, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotBetween(String value1, String value2) {
            addCriterion("p7 not between", value1, value2, "p7");
            return (Criteria) this;
        }

        public Criteria andP8IsNull() {
            addCriterion("p8 is null");
            return (Criteria) this;
        }

        public Criteria andP8IsNotNull() {
            addCriterion("p8 is not null");
            return (Criteria) this;
        }

        public Criteria andP8EqualTo(String value) {
            addCriterion("p8 =", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotEqualTo(String value) {
            addCriterion("p8 <>", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8GreaterThan(String value) {
            addCriterion("p8 >", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8GreaterThanOrEqualTo(String value) {
            addCriterion("p8 >=", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8LessThan(String value) {
            addCriterion("p8 <", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8LessThanOrEqualTo(String value) {
            addCriterion("p8 <=", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8Like(String value) {
            addCriterion("p8 like", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotLike(String value) {
            addCriterion("p8 not like", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8In(List<String> values) {
            addCriterion("p8 in", values, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotIn(List<String> values) {
            addCriterion("p8 not in", values, "p8");
            return (Criteria) this;
        }

        public Criteria andP8Between(String value1, String value2) {
            addCriterion("p8 between", value1, value2, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotBetween(String value1, String value2) {
            addCriterion("p8 not between", value1, value2, "p8");
            return (Criteria) this;
        }

        public Criteria andWeeksIsNull() {
            addCriterion("weeks is null");
            return (Criteria) this;
        }

        public Criteria andWeeksIsNotNull() {
            addCriterion("weeks is not null");
            return (Criteria) this;
        }

        public Criteria andWeeksEqualTo(Integer value) {
            addCriterion("weeks =", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotEqualTo(Integer value) {
            addCriterion("weeks <>", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksGreaterThan(Integer value) {
            addCriterion("weeks >", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksGreaterThanOrEqualTo(Integer value) {
            addCriterion("weeks >=", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksLessThan(Integer value) {
            addCriterion("weeks <", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksLessThanOrEqualTo(Integer value) {
            addCriterion("weeks <=", value, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksIn(List<Integer> values) {
            addCriterion("weeks in", values, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotIn(List<Integer> values) {
            addCriterion("weeks not in", values, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksBetween(Integer value1, Integer value2) {
            addCriterion("weeks between", value1, value2, "weeks");
            return (Criteria) this;
        }

        public Criteria andWeeksNotBetween(Integer value1, Integer value2) {
            addCriterion("weeks not between", value1, value2, "weeks");
            return (Criteria) this;
        }

        public Criteria andScoregradeIsNull() {
            addCriterion("scoregrade is null");
            return (Criteria) this;
        }

        public Criteria andScoregradeIsNotNull() {
            addCriterion("scoregrade is not null");
            return (Criteria) this;
        }

        public Criteria andScoregradeEqualTo(String value) {
            addCriterion("scoregrade =", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeNotEqualTo(String value) {
            addCriterion("scoregrade <>", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeGreaterThan(String value) {
            addCriterion("scoregrade >", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeGreaterThanOrEqualTo(String value) {
            addCriterion("scoregrade >=", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeLessThan(String value) {
            addCriterion("scoregrade <", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeLessThanOrEqualTo(String value) {
            addCriterion("scoregrade <=", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeLike(String value) {
            addCriterion("scoregrade like", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeNotLike(String value) {
            addCriterion("scoregrade not like", value, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeIn(List<String> values) {
            addCriterion("scoregrade in", values, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeNotIn(List<String> values) {
            addCriterion("scoregrade not in", values, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeBetween(String value1, String value2) {
            addCriterion("scoregrade between", value1, value2, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andScoregradeNotBetween(String value1, String value2) {
            addCriterion("scoregrade not between", value1, value2, "scoregrade");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNull() {
            addCriterion("sessionid is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("sessionid is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(String value) {
            addCriterion("sessionid =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(String value) {
            addCriterion("sessionid <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(String value) {
            addCriterion("sessionid >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("sessionid >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(String value) {
            addCriterion("sessionid <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(String value) {
            addCriterion("sessionid <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLike(String value) {
            addCriterion("sessionid like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotLike(String value) {
            addCriterion("sessionid not like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<String> values) {
            addCriterion("sessionid in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<String> values) {
            addCriterion("sessionid not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(String value1, String value2) {
            addCriterion("sessionid between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(String value1, String value2) {
            addCriterion("sessionid not between", value1, value2, "sessionid");
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