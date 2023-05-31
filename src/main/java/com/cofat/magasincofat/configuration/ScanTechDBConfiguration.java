package com.cofat.magasincofat.configuration;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

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

import com.cofat.magasincofat.entity.scantech.*;
import com.cofat.magasincofat.repository.scantech.*;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = wmsMovementsRepository.class, entityManagerFactoryRef = "scantechDSEmFactory", transactionManagerRef = "scantechDSTransactionManager")

public class ScanTechDBConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource2")
    public DataSourceProperties scantechDSProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource scantechDS(@Qualifier("scantechDSProperties") DataSourceProperties scantechDSProperties) {
        return scantechDSProperties.initializeDataSourceBuilder().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean scantechDSEmFactory(@Qualifier("scantechDS") DataSource scantechDS, EntityManagerFactoryBuilder builder) {
        return builder.dataSource(scantechDS).packages(wmsMovementsEntity.class).build();
    }

    @Bean
    public PlatformTransactionManager scantechDSTransactionManager(/*@Qualifier("scantechDSEmFactory")*/ EntityManagerFactory scantechDSEmFactory) {
        return new JpaTransactionManager(scantechDSEmFactory);
    }

}