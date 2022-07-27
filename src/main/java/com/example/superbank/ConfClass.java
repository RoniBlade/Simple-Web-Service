package com.example.superbank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfClass {

    @Bean
    public BalanceRepository balanceRepository() {
        return new BalanceRepository();
    }
}
