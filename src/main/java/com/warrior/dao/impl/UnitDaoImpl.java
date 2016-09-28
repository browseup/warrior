package com.warrior.dao.impl;

import com.warrior.dao.UnitDao;
import com.warrior.entity.Unit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UnitDaoImpl extends BaseDaoImpl<Unit> implements UnitDao<Unit> {
    @Override
    protected Class<Unit> getEntityName() {
        return Unit.class;
    }
}
