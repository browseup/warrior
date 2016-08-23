package com.warrior.dao.impl;

import com.warrior.dao.WarriorDao;
import com.warrior.entity.Warrior;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alexey_n on 23.08.2016.
 */
@Transactional
public class WarriorDaoImpl extends BaseDaoImpl<Warrior> implements WarriorDao<Warrior> {

    @Override
    protected Class<Warrior> getEntityName() {
        return Warrior.class;
    }

}
