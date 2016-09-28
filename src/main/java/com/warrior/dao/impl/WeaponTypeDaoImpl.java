package com.warrior.dao.impl;

import com.warrior.dao.WeaponTypeDao;
import com.warrior.entity.WeaponType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class WeaponTypeDaoImpl extends BaseDaoImpl<WeaponType> implements WeaponTypeDao<WeaponType> {
    @Override
    protected Class<WeaponType> getEntityName() {
        return WeaponType.class;
    }
}
