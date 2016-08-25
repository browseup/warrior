package com.warrior.dao.impl;

import com.warrior.dao.UnitTypeDao;
import com.warrior.entity.UnitType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UnitTypeDaoImpl extends BaseDaoImpl<UnitType> implements UnitTypeDao<UnitType> {
    @Override
    protected Class<UnitType> getEntityName() {
        return UnitType.class;
    }
}
