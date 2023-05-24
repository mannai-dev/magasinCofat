package com.cofat.magasincofat.ln.config;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class LNDatabaseConfig {

   /* @Value("${ln.database.url}")
    private String lnDatabaseUrl;

    @Value("${ln.database.username}")
    private String lnDatabaseUsername;

    @Value("${ln.database.password}")
    private String lnDatabasePassword;*/

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

    // Ajoutez d'autres beans ou configurations spécifiques à la base de données LN si nécessaire

}

