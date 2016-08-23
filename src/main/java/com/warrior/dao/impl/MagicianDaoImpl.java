package com.warrior.dao.impl;

import com.warrior.dao.MagicianDao;
import com.warrior.entity.Magician;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MagicianDaoImpl extends BaseDaoImpl<Magician> implements MagicianDao<Magician>  {
    @Override
    protected Class<Magician> getEntityName() {
        return Magician.class;
    }
}