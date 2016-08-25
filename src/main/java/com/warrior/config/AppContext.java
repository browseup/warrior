package com.warrior.config;

import com.warrior.dao.UnitDao;
import com.warrior.dao.UnitTypeDao;
import com.warrior.dao.WeaponTypeDao;
import com.warrior.dao.impl.UnitDaoImpl;
import com.warrior.dao.impl.UnitTypeDaoImpl;
import com.warrior.dao.impl.WeaponTypeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

@Configuration
@PropertySource(value = {"classpath:util.properties"})
@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {

    @Autowired
    Environment environment;

    @Bean
    public WeaponTypeDao weaponType() {
        return new WeaponTypeDaoImpl();
    }

    @Bean
    public UnitDao unitDao() {
        return new UnitDaoImpl();
    }

    @Bean
    public UnitTypeDao unitTypeDao() {
        return new UnitTypeDaoImpl();
    }

    @Autowired
    HibernateConfig hibernateConfig;

//    @Bean
//    public JdbcTemplate jdbcTemplate() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource());
//        return jdbcTemplate;
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(hibernateConfig.dataSource());
        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
        return jdbcImpl;
    }

//    @Bean
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getProperty("jdbc.postgresql.driverClass"));
//        dataSource.setUrl(environment.getProperty("jdbc.postgresql.url"));
//        dataSource.setUsername(environment.getProperty("jdbc.postgresql.username"));
//        dataSource.setPassword(environment.getProperty("jdbc.postgresql.password"));
//        return dataSource;
//    }
}