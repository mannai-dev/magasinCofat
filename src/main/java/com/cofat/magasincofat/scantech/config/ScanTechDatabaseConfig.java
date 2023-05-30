package com.cofat.magasincofat.scantech.config;
/**********
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
//@EnableJpaRepositories(basePackages = "com.cofat.magasincofat.scantech.repositories")
@EnableJpaRepositories(basePackages = "com.cofat.magasincofat.scantech.repository",
        entityManagerFactoryRef = "scanTechEntityManagerFactory",
        transactionManagerRef = "scanTechTransactionManager")
public class ScanTechDatabaseConfig {

    /*
    @Value("${scantech.database.url}")
    private String scanTechDatabaseUrl;

    @Value("${scantech.database.username}")
    private String scanTechDatabaseUsername;

    @Value("${scantech.database.password}")
    private String scanTechDatabasePassword;*/
/*
    @Bean(name = "scanTechDataSource")
    public DataSource scanTechDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost:1433;database=scanTech;encrypt=true;trustServerCertificate=true");
        dataSource.setUsername("admin");
        dataSource.setPassword("1234");
        return dataSource;
    }

    @Bean(name = "scanTechJdbcTemplate")
    public JdbcTemplate scanTechJdbcTemplate(@Autowired DataSource scanTechDataSource) {
        return new JdbcTemplate(scanTechDataSource);
    }

    // Ajoutez d'autres beans ou configurations spécifiques à la base de données scanTech si nécessaire
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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

/*************************
    @Autowired
    private DataSource scanTechDataSource;

    @Bean
    public LocalContainerEntityManagerFactoryBean scanTechEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(scanTechDataSource);
        entityManagerFactoryBean.setPackagesToScan("com.cofat.magasincofat.scantech.entities");
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return entityManagerFactoryBean;
    }

    @Bean
    public PlatformTransactionManager scanTechTransactionManager(EntityManagerFactory scanTechEntityManagerFactory) {
        return new JpaTransactionManager(scanTechEntityManagerFactory);
    }

}   ***********************/
@Configuration
@PropertySource({ "classpath:persistence-multiple-db.properties" })
@EnableJpaRepositories(
        basePackages = "com.cofat.magasincofat.scantech.repository",
        entityManagerFactoryRef = "scanTechEntityManager",
        transactionManagerRef = "scanTechTransactionManager"
)
public class ScanTechDatabaseConfig {
    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean scanTechEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(scanTechDataSource());
        em.setPackagesToScan(
                new String[] { "com.cofat.magasincofat.scantech.entities" });

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public DataSource scanTechDataSource() {

        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("product.jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager scanTechTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                scanTechEntityManager().getObject());
        return transactionManager;
    }
}
