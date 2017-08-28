package com.blogspot.ofarukkurt.primeadminbsb.services;

import com.blogspot.ofarukkurt.primeadminbsb.controllers.util.JsfUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.primefaces.model.SortOrder;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:31:55 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }
    
    public T findPK(String subClassName,Object id){
        String sqlStr = "Select b From "+entityClass.getSimpleName()+" b WHERE b."+subClassName+" = :id";
        return (T) getEntityManager().createQuery(sqlStr).setParameter("id", id).getSingleResult();
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    public int count(Map<String, Object> filters) {
        CriteriaBuilder cb = this.getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<T> myObj = cq.from(entityClass);
        cq.where(getFilterCondition(cb, myObj, filters));
        cq.select(cb.count(myObj));
        return this.getEntityManager().createQuery(cq).getSingleResult().intValue();
    }

    private Predicate getFilterCondition(CriteriaBuilder cb, Root<T> root, Map<String, Object> filters) {
        Predicate filterCondition = cb.conjunction();
        String wildCard = "%";
        for (Map.Entry<String, Object> filter : filters.entrySet()) {
            String value = wildCard + filter.getValue() + wildCard;
            if (filter.getValue() == null) {
                javax.persistence.criteria.Path<String> path = root.get(filter.getKey());
                filterCondition = cb.and(filterCondition, cb.isNull(path));
            } else if (!filter.getValue().equals("") && filter.getValue() != null) {
                if (filter.getKey().contains(".")) {
                    String[] parcalar = filter.getKey().split(Pattern.quote("."));
                    String ust = parcalar[0];
                    String alt = parcalar[1];
                    if (filter.getValue().toString().contains(",")) {
                        List<String> valueList = Arrays.asList(filter.getValue().toString().split("\\s*,\\s*"));
                        Expression<String> str = root.get(ust).get(alt).as(String.class);
                        filterCondition = cb.and(filterCondition, str.in(valueList));
                    } else {
                        if (filter.getValue().toString().contains("-")) {
                            String[] tarihler = filter.getValue().toString().split(Pattern.quote("-"));
                            if (tarihler.length == 2) {
                                Date tarih1 = stringToDateShort(tarihler[0]);
                                Date tarih2 = stringToDateShort(tarihler[1]);
                                javax.persistence.criteria.Path<Date> tarihExp = (javax.persistence.criteria.Path<Date>) root.get(ust).get(alt).as(Date.class);
                                filterCondition = cb.and(filterCondition, cb.between(tarihExp, tarih1, tarih2));
                            }
                        } else {
                            javax.persistence.criteria.Path<String> path = (javax.persistence.criteria.Path<String>) root.get(ust).get(alt).as(String.class); // order.get(filter.getKey());
                            filterCondition = cb.and(filterCondition, cb.like(path, value));
                        }
                    }
                } else if (filter.getValue().toString().contains("-")) {
                    String[] tarihler = filter.getValue().toString().split(Pattern.quote("-"));
                    if (tarihler.length == 2) {
                        Date tarih1 = stringToDateShort(tarihler[0]);
                        Date tarih2 = stringToDateShort(tarihler[1]);
                        javax.persistence.criteria.Path<Date> tarihExp = (javax.persistence.criteria.Path<Date>) root.get(filter.getKey()).as(Date.class);
                        filterCondition = cb.and(filterCondition, cb.between(tarihExp, tarih1, tarih2));
                    } else {
                        Date tarih1 = stringToDateShort2(filter.getValue().toString());
                        javax.persistence.criteria.Path<Date> tarihExp = (javax.persistence.criteria.Path<Date>) root.get(filter.getKey()).as(Date.class);
                        filterCondition = cb.and(filterCondition, cb.equal(tarihExp, tarih1));
                    }
                } else {
                    javax.persistence.criteria.Path<String> path = root.get(filter.getKey());
                    filterCondition = cb.and(filterCondition, cb.like(path, value));
                }
            }
        }
        //filterCondition = cb.and(filterCondition, cb.equal(root.get("aktif"), true));
        return filterCondition;
    }

    public List<T> loadLazy(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
        CriteriaBuilder cb = this.getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> myObj = cq.from(entityClass);
        cq.where(getFilterCondition(cb, myObj, filters));
        if (sortField != null) {
            if (sortField.contains(".")) {
                String[] sortFields = sortField.split(Pattern.quote("."));
                if (sortOrder.equals(SortOrder.ASCENDING)) {
                    cq.orderBy(cb.asc(myObj.get(sortFields[0]).get(sortFields[1])));
                } else if (sortOrder.equals(SortOrder.DESCENDING)) {
                    cq.orderBy(cb.desc(myObj.get(sortFields[0]).get(sortFields[1])));
                }
            } else {
                if (sortOrder.equals(SortOrder.ASCENDING)) {
                    cq.orderBy(cb.asc(myObj.get(sortField)));
                } else if (sortOrder.equals(SortOrder.DESCENDING)) {
                    cq.orderBy(cb.desc(myObj.get(sortField)));
                }
            }
        }
        return this.getEntityManager().createQuery(cq).setFirstResult(first).setMaxResults(pageSize).getResultList();
    }

    private Date stringToDateShort(String dateStr) {
        DateFormat df = new SimpleDateFormat(ResourceBundle.getBundle("/messages").getString("tarihFormat"));
        Date startDate = null;
        try {
            startDate = df.parse(dateStr);
        } catch (ParseException e) {
            System.out.println(JsfUtil.message("tarihAyristirilamadi"));
        }
        return startDate;
    }

    private Date stringToDateShort2(String dateStr) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        try {
            startDate = df.parse(dateStr);
        } catch (ParseException e) {
            System.out.println(JsfUtil.message("tarihAyristirilamadi"));
        }
        return startDate;
    }
    
}
