package com.tscomunidadegraca.gig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Data
public class DataConfigurationDB {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    @Profile("mysql")
    @Bean
    public String mysqlDatabaseConnection(){
        System.out.println("DB Connection for MySql");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MySql_TEST - Test instance";
    }

}
