package com.hkemal.controller;

import com.hkemal.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    //http://localhost:8080/bean/beanDTO
    @ResponseBody//html olmadan ekranda göster
    @GetMapping("/bean/beanDTO")//url
    public String getBeanDTO() {
        return beanConfig.beanDTO().toString();
    }


}
