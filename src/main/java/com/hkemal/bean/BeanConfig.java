package com.hkemal.bean;

import com.hkemal.dto.BeanDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton")// request, session
    public BeanDTO beanDTO() {
        return BeanDTO.
                builder()
                .id(0L).beanName("Bean Name").beanData("Bean Data")
                .build();
    }
}
