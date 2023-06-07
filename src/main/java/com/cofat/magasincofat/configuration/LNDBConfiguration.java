package com.cofat.magasincofat.configuration;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cofat.magasincofat.entity.ln.*;
import com.cofat.magasincofat.repository.ln.*;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = Twhinh200Repository.class, entityManagerFactoryRef = "lnDSEmFactory", transactionManagerRef = "lnDSTransactionManager")
public class LNDBConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource1")
    public DataSourceProperties lnDSProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource lnDS(@Qualifier("lnDSProperties") DataSourceProperties lnDSProperties) {
        return lnDSProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean lnDSEmFactory(@Qualifier("lnDS") DataSource lnDS, EntityManagerFactoryBuilder builder) {
        return builder.dataSource(lnDS).packages(Twhinh200120.class).build();
    }

//mbaad na7i primary
    @Primary
    @Bean
    public PlatformTransactionManager lnDSTransactionManager(EntityManagerFactory lnDSEmFactory) {
        return new JpaTransactionManager(lnDSEmFactory);
    }
}