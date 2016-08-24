package com.warrior.dao.impl;

import com.warrior.dao.UnitTypeDao;
import com.warrior.entity.UnitType;

/**
 * Created by alexey_n on 24.08.2016.
 */
public class UnitTypeDaoImpl extends BaseDaoImpl<UnitType> implements UnitTypeDao<UnitType> {
    @Override
    protected Class<UnitType> getEntityName() {
        return UnitType.class;
    }
}
