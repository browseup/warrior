package com.warrior.dao.impl;

import com.warrior.dao.WeaponTypeDao;
import com.warrior.entity.WeaponType;

public class WeaponTypeDaoImpl extends BaseDaoImpl<WeaponType> implements WeaponTypeDao<WeaponType> {
    @Override
    protected Class<WeaponType> getEntityName() {
        return WeaponType.class;
    }
}
