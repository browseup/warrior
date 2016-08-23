package com.warrior.config;



import com.warrior.dao.MagicianDao;
import com.warrior.dao.WarriorDao;
import com.warrior.dao.impl.MagicianDaoImpl;
import com.warrior.dao.impl.WarriorDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource(value = {"classpath:util.properties"})
//@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {

    @Autowired
    Environment environment;

    @Bean
    public WarriorDao warriorDao() {
        return new WarriorDaoImpl();
    }

    @Bean
    public MagicianDao magicianDao() {
        return new MagicianDaoImpl();
    }

//    @Autowired
//    HibernateConfig hibernateConfig;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
//        jdbcImpl.setDataSource(hibernateConfig.dataSource());
//        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
//        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
//        return jdbcImpl;
//    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.postgresql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.postgresql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.postgresql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.postgresql.password"));
        return dataSource;
    }
}