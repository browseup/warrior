package com.warrior.dao.impl;

import com.warrior.dao.BaseDao;
import com.warrior.entity.Warrior;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alexey_n on 23.08.2016.
 */
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T>{
    @Autowired
    SessionFactory sessionFactory;

    Object entity;

    @Override
    public T getById(int id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName());
        criteria.add(Restrictions.eq("id", id));
        return (T) criteria.uniqueResult();
    }

    public List<T> getAll() {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName());
        return (List<T>) criteria.list();
    }

    protected abstract Class<Warrior> getEntityName();
}
