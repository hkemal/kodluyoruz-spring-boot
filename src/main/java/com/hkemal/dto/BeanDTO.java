package com.hkemal.dto;

import lombok.*;
import lombok.extern.log4j.Log4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Log4j
@Builder
@ToString
public class BeanDTO {

    private Long id;

    private String beanName;

    private String beanData;
}
