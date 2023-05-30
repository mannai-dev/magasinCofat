/*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.cofat.magasincofat.ln.repositories", entityManagerFactoryRef = "lnEntityManagerFactory", transactionManagerRef = "lnTransactionManager")
public class LNDatabaseConfig {

    @Autowired
    private Environment env;

    @Bean
    @Primary
    public DataSource lnDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl(env.getProperty("spring.datasource.ln.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.ln.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.ln.password"));
        return dataSource;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean lnEntityManagerFactory() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(lnDataSource());
        factoryBean.setJpaVendorAdapter(vendorAdapter);
        factoryBean.setPackagesToScan("com.example.entities.ln");
        factoryBean.setPersistenceUnitName("lnPersistenceUnit");
        return factoryBean;
    }

    @Bean
    @Primary
    public PlatformTransactionManager lnTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(lnEntityManagerFactory().getObject());
        return transactionManager;
    }
}*/
// llllllllllllllllllllllllllllll

/* *********************************************************
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
//@EnableJpaRepositories(basePackages = "com.cofat.magasincofat.ln.repositories")
@EnableJpaRepositories(basePackages = "com.cofat.magasincofat.ln.repository",
        entityManagerFactoryRef = "lnEntityManagerFactory",
        transactionManagerRef = "lnTransactionManager")
public class LNDatabaseConfig {

   /* @Value("${ln.database.url}")
    private String lnDatabaseUrl;

    @Value("${ln.database.username}")
    private String lnDatabaseUsername;

    @Value("${ln.database.password}")
    private String lnDatabasePassword;*/
/*
    @Bean(name = "lnDataSource")
    public DataSource lnDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost:1433;database=LN;encrypt=true;trustServerCertificate=true");
        dataSource.setUsername("admin");
        dataSource.setPassword("1234");
        return dataSource;
    }

    @Bean(name = "lnJdbcTemplate")
    public JdbcTemplate lnJdbcTemplate(@Autowired DataSource lnDataSource) {
        return new JdbcTemplate(lnDataSource);
    }
*/
/*
    @Autowired
    private DataSource lnDataSource;
    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean lnEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(lnDataSource);
        entityManagerFactoryBean.setPackagesToScan("com.cofat.magasincofat.ln.entities");
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return entityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager lnTransactionManager(EntityManagerFactory lnEntityManagerFactory) {
        return new JpaTransactionManager(lnEntityManagerFactory);
    }

} **********************************
*/

package com.cofat.magasincofat.ln.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@PropertySource({ "classpath:persistence-multiple-db.properties" })
@EnableJpaRepositories(
        basePackages = "com.cofat.magasincofat.ln.repository",
        entityManagerFactoryRef = "lnEntityManager",
        transactionManagerRef = "lnTransactionManager"
)
public class LNDatabaseConfig{
    @Autowired
    private Environment env;

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean lnEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(lnDataSource());
        em.setPackagesToScan(
                new String[] { "com.cofat.magasincofat.ln.entities" });

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Primary
    @Bean
    public DataSource lnDataSource() {

        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("user.jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager lnTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                lnEntityManager().getObject());
        return transactionManager;
    }
}
