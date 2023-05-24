package com.cofat.magasincofat.scantech.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ScanTechDatabaseConfig {

    /*
    @Value("${scantech.database.url}")
    private String scanTechDatabaseUrl;

    @Value("${scantech.database.username}")
    private String scanTechDatabaseUsername;

    @Value("${scantech.database.password}")
    private String scanTechDatabasePassword;*/

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

}
