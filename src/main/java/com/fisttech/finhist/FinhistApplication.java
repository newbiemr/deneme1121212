package com.fisttech.finhist;

//import com.fisttech.finhist.config.PersistenceConfig;

import com.fisttech.finhist.audit.AuditorAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableConfigurationProperties(PersistenceConfig.class)
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class FinhistApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinhistApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }



}
