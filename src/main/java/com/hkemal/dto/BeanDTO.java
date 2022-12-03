package com.hkemal.dto;

import lombok.*;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j
@Builder
@ToString
public class BeanDTO {

    private Long id;

    private String beanName;

    private String beanData;

    //başlangıç
    public void initialBeanMethod() {
        log.info("Bean başlamadan önce ben varım");
        System.out.println("Bean başlamadan önce çalışacak method");
    }

    //bitiş
    public void destroyBeanMethod() {
        log.info("Bean bittikten sonra ben varım");
        System.err.println("Bean bittikten sonra çalışacak method");
    }
}
