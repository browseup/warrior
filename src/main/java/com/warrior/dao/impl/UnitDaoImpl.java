package com.warrior.dao.impl;

import com.warrior.dao.UnitDao;
import com.warrior.entity.Unit;

/**
 * Created by alexey_n on 24.08.2016.
 */
public class UnitDaoImpl extends BaseDaoImpl<Unit> implements UnitDao<Unit> {
    @Override
    protected Class<Unit> getEntityName() {
        return Unit.class;
    }
}
