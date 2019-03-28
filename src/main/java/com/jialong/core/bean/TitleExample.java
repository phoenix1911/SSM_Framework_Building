package com.jialong.core.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TitleExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsIsNull() {
            addCriterion("isuploadrws is null");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsIsNotNull() {
            addCriterion("isuploadrws is not null");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsEqualTo(Integer value) {
            addCriterion("isuploadrws =", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsNotEqualTo(Integer value) {
            addCriterion("isuploadrws <>", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsGreaterThan(Integer value) {
            addCriterion("isuploadrws >", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsGreaterThanOrEqualTo(Integer value) {
            addCriterion("isuploadrws >=", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsLessThan(Integer value) {
            addCriterion("isuploadrws <", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsLessThanOrEqualTo(Integer value) {
            addCriterion("isuploadrws <=", value, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsIn(List<Integer> values) {
            addCriterion("isuploadrws in", values, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsNotIn(List<Integer> values) {
            addCriterion("isuploadrws not in", values, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsBetween(Integer value1, Integer value2) {
            addCriterion("isuploadrws between", value1, value2, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andIsuploadrwsNotBetween(Integer value1, Integer value2) {
            addCriterion("isuploadrws not between", value1, value2, "isuploadrws");
            return (Criteria) this;
        }

        public Criteria andRwsIsNull() {
            addCriterion("rws is null");
            return (Criteria) this;
        }

        public Criteria andRwsIsNotNull() {
            addCriterion("rws is not null");
            return (Criteria) this;
        }

        public Criteria andRwsEqualTo(String value) {
            addCriterion("rws =", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsNotEqualTo(String value) {
            addCriterion("rws <>", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsGreaterThan(String value) {
            addCriterion("rws >", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsGreaterThanOrEqualTo(String value) {
            addCriterion("rws >=", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsLessThan(String value) {
            addCriterion("rws <", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsLessThanOrEqualTo(String value) {
            addCriterion("rws <=", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsLike(String value) {
            addCriterion("rws like", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsNotLike(String value) {
            addCriterion("rws not like", value, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsIn(List<String> values) {
            addCriterion("rws in", values, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsNotIn(List<String> values) {
            addCriterion("rws not in", values, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsBetween(String value1, String value2) {
            addCriterion("rws between", value1, value2, "rws");
            return (Criteria) this;
        }

        public Criteria andRwsNotBetween(String value1, String value2) {
            addCriterion("rws not between", value1, value2, "rws");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgIsNull() {
            addCriterion("isuploadktbg is null");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgIsNotNull() {
            addCriterion("isuploadktbg is not null");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgEqualTo(Integer value) {
            addCriterion("isuploadktbg =", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgNotEqualTo(Integer value) {
            addCriterion("isuploadktbg <>", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgGreaterThan(Integer value) {
            addCriterion("isuploadktbg >", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgGreaterThanOrEqualTo(Integer value) {
            addCriterion("isuploadktbg >=", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgLessThan(Integer value) {
            addCriterion("isuploadktbg <", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgLessThanOrEqualTo(Integer value) {
            addCriterion("isuploadktbg <=", value, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgIn(List<Integer> values) {
            addCriterion("isuploadktbg in", values, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgNotIn(List<Integer> values) {
            addCriterion("isuploadktbg not in", values, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgBetween(Integer value1, Integer value2) {
            addCriterion("isuploadktbg between", value1, value2, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadktbgNotBetween(Integer value1, Integer value2) {
            addCriterion("isuploadktbg not between", value1, value2, "isuploadktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgIsNull() {
            addCriterion("ktbg is null");
            return (Criteria) this;
        }

        public Criteria andKtbgIsNotNull() {
            addCriterion("ktbg is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgEqualTo(String value) {
            addCriterion("ktbg =", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgNotEqualTo(String value) {
            addCriterion("ktbg <>", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgGreaterThan(String value) {
            addCriterion("ktbg >", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgGreaterThanOrEqualTo(String value) {
            addCriterion("ktbg >=", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgLessThan(String value) {
            addCriterion("ktbg <", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgLessThanOrEqualTo(String value) {
            addCriterion("ktbg <=", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgLike(String value) {
            addCriterion("ktbg like", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgNotLike(String value) {
            addCriterion("ktbg not like", value, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgIn(List<String> values) {
            addCriterion("ktbg in", values, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgNotIn(List<String> values) {
            addCriterion("ktbg not in", values, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgBetween(String value1, String value2) {
            addCriterion("ktbg between", value1, value2, "ktbg");
            return (Criteria) this;
        }

        public Criteria andKtbgNotBetween(String value1, String value2) {
            addCriterion("ktbg not between", value1, value2, "ktbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsIsNull() {
            addCriterion("isuploadsms is null");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsIsNotNull() {
            addCriterion("isuploadsms is not null");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsEqualTo(Integer value) {
            addCriterion("isuploadsms =", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsNotEqualTo(Integer value) {
            addCriterion("isuploadsms <>", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsGreaterThan(Integer value) {
            addCriterion("isuploadsms >", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("isuploadsms >=", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsLessThan(Integer value) {
            addCriterion("isuploadsms <", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsLessThanOrEqualTo(Integer value) {
            addCriterion("isuploadsms <=", value, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsIn(List<Integer> values) {
            addCriterion("isuploadsms in", values, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsNotIn(List<Integer> values) {
            addCriterion("isuploadsms not in", values, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsBetween(Integer value1, Integer value2) {
            addCriterion("isuploadsms between", value1, value2, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andIsuploadsmsNotBetween(Integer value1, Integer value2) {
            addCriterion("isuploadsms not between", value1, value2, "isuploadsms");
            return (Criteria) this;
        }

        public Criteria andSmsIsNull() {
            addCriterion("sms is null");
            return (Criteria) this;
        }

        public Criteria andSmsIsNotNull() {
            addCriterion("sms is not null");
            return (Criteria) this;
        }

        public Criteria andSmsEqualTo(String value) {
            addCriterion("sms =", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotEqualTo(String value) {
            addCriterion("sms <>", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsGreaterThan(String value) {
            addCriterion("sms >", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsGreaterThanOrEqualTo(String value) {
            addCriterion("sms >=", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsLessThan(String value) {
            addCriterion("sms <", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsLessThanOrEqualTo(String value) {
            addCriterion("sms <=", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsLike(String value) {
            addCriterion("sms like", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotLike(String value) {
            addCriterion("sms not like", value, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsIn(List<String> values) {
            addCriterion("sms in", values, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotIn(List<String> values) {
            addCriterion("sms not in", values, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsBetween(String value1, String value2) {
            addCriterion("sms between", value1, value2, "sms");
            return (Criteria) this;
        }

        public Criteria andSmsNotBetween(String value1, String value2) {
            addCriterion("sms not between", value1, value2, "sms");
            return (Criteria) this;
        }

        public Criteria andRwsstateIsNull() {
            addCriterion("rwsState is null");
            return (Criteria) this;
        }

        public Criteria andRwsstateIsNotNull() {
            addCriterion("rwsState is not null");
            return (Criteria) this;
        }

        public Criteria andRwsstateEqualTo(String value) {
            addCriterion("rwsState =", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateNotEqualTo(String value) {
            addCriterion("rwsState <>", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateGreaterThan(String value) {
            addCriterion("rwsState >", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateGreaterThanOrEqualTo(String value) {
            addCriterion("rwsState >=", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateLessThan(String value) {
            addCriterion("rwsState <", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateLessThanOrEqualTo(String value) {
            addCriterion("rwsState <=", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateLike(String value) {
            addCriterion("rwsState like", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateNotLike(String value) {
            addCriterion("rwsState not like", value, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateIn(List<String> values) {
            addCriterion("rwsState in", values, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateNotIn(List<String> values) {
            addCriterion("rwsState not in", values, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateBetween(String value1, String value2) {
            addCriterion("rwsState between", value1, value2, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andRwsstateNotBetween(String value1, String value2) {
            addCriterion("rwsState not between", value1, value2, "rwsstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateIsNull() {
            addCriterion("ktbgState is null");
            return (Criteria) this;
        }

        public Criteria andKtbgstateIsNotNull() {
            addCriterion("ktbgState is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgstateEqualTo(String value) {
            addCriterion("ktbgState =", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateNotEqualTo(String value) {
            addCriterion("ktbgState <>", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateGreaterThan(String value) {
            addCriterion("ktbgState >", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateGreaterThanOrEqualTo(String value) {
            addCriterion("ktbgState >=", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateLessThan(String value) {
            addCriterion("ktbgState <", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateLessThanOrEqualTo(String value) {
            addCriterion("ktbgState <=", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateLike(String value) {
            addCriterion("ktbgState like", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateNotLike(String value) {
            addCriterion("ktbgState not like", value, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateIn(List<String> values) {
            addCriterion("ktbgState in", values, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateNotIn(List<String> values) {
            addCriterion("ktbgState not in", values, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateBetween(String value1, String value2) {
            addCriterion("ktbgState between", value1, value2, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andKtbgstateNotBetween(String value1, String value2) {
            addCriterion("ktbgState not between", value1, value2, "ktbgstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateIsNull() {
            addCriterion("smsState is null");
            return (Criteria) this;
        }

        public Criteria andSmsstateIsNotNull() {
            addCriterion("smsState is not null");
            return (Criteria) this;
        }

        public Criteria andSmsstateEqualTo(String value) {
            addCriterion("smsState =", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateNotEqualTo(String value) {
            addCriterion("smsState <>", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateGreaterThan(String value) {
            addCriterion("smsState >", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateGreaterThanOrEqualTo(String value) {
            addCriterion("smsState >=", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateLessThan(String value) {
            addCriterion("smsState <", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateLessThanOrEqualTo(String value) {
            addCriterion("smsState <=", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateLike(String value) {
            addCriterion("smsState like", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateNotLike(String value) {
            addCriterion("smsState not like", value, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateIn(List<String> values) {
            addCriterion("smsState in", values, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateNotIn(List<String> values) {
            addCriterion("smsState not in", values, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateBetween(String value1, String value2) {
            addCriterion("smsState between", value1, value2, "smsstate");
            return (Criteria) this;
        }

        public Criteria andSmsstateNotBetween(String value1, String value2) {
            addCriterion("smsState not between", value1, value2, "smsstate");
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

        public Criteria andIsuploadzqbgIsNull() {
            addCriterion("isuploadzqbg is null");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgIsNotNull() {
            addCriterion("isuploadzqbg is not null");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgEqualTo(Integer value) {
            addCriterion("isuploadzqbg =", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgNotEqualTo(Integer value) {
            addCriterion("isuploadzqbg <>", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgGreaterThan(Integer value) {
            addCriterion("isuploadzqbg >", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgGreaterThanOrEqualTo(Integer value) {
            addCriterion("isuploadzqbg >=", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgLessThan(Integer value) {
            addCriterion("isuploadzqbg <", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgLessThanOrEqualTo(Integer value) {
            addCriterion("isuploadzqbg <=", value, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgIn(List<Integer> values) {
            addCriterion("isuploadzqbg in", values, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgNotIn(List<Integer> values) {
            addCriterion("isuploadzqbg not in", values, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgBetween(Integer value1, Integer value2) {
            addCriterion("isuploadzqbg between", value1, value2, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andIsuploadzqbgNotBetween(Integer value1, Integer value2) {
            addCriterion("isuploadzqbg not between", value1, value2, "isuploadzqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgIsNull() {
            addCriterion("zqbg is null");
            return (Criteria) this;
        }

        public Criteria andZqbgIsNotNull() {
            addCriterion("zqbg is not null");
            return (Criteria) this;
        }

        public Criteria andZqbgEqualTo(String value) {
            addCriterion("zqbg =", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgNotEqualTo(String value) {
            addCriterion("zqbg <>", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgGreaterThan(String value) {
            addCriterion("zqbg >", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgGreaterThanOrEqualTo(String value) {
            addCriterion("zqbg >=", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgLessThan(String value) {
            addCriterion("zqbg <", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgLessThanOrEqualTo(String value) {
            addCriterion("zqbg <=", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgLike(String value) {
            addCriterion("zqbg like", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgNotLike(String value) {
            addCriterion("zqbg not like", value, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgIn(List<String> values) {
            addCriterion("zqbg in", values, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgNotIn(List<String> values) {
            addCriterion("zqbg not in", values, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgBetween(String value1, String value2) {
            addCriterion("zqbg between", value1, value2, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgNotBetween(String value1, String value2) {
            addCriterion("zqbg not between", value1, value2, "zqbg");
            return (Criteria) this;
        }

        public Criteria andZqbgstateIsNull() {
            addCriterion("zqbgState is null");
            return (Criteria) this;
        }

        public Criteria andZqbgstateIsNotNull() {
            addCriterion("zqbgState is not null");
            return (Criteria) this;
        }

        public Criteria andZqbgstateEqualTo(String value) {
            addCriterion("zqbgState =", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateNotEqualTo(String value) {
            addCriterion("zqbgState <>", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateGreaterThan(String value) {
            addCriterion("zqbgState >", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateGreaterThanOrEqualTo(String value) {
            addCriterion("zqbgState >=", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateLessThan(String value) {
            addCriterion("zqbgState <", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateLessThanOrEqualTo(String value) {
            addCriterion("zqbgState <=", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateLike(String value) {
            addCriterion("zqbgState like", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateNotLike(String value) {
            addCriterion("zqbgState not like", value, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateIn(List<String> values) {
            addCriterion("zqbgState in", values, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateNotIn(List<String> values) {
            addCriterion("zqbgState not in", values, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateBetween(String value1, String value2) {
            addCriterion("zqbgState between", value1, value2, "zqbgstate");
            return (Criteria) this;
        }

        public Criteria andZqbgstateNotBetween(String value1, String value2) {
            addCriterion("zqbgState not between", value1, value2, "zqbgstate");
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