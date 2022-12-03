package com.hkemal.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

    @Autowired
    Logger LOG;

    /*
      public BeanController() {
      LOG.info("Log info çağırıldı.");
      }
     */

    @PostConstruct
    public void init() {
        LOG.info("Log info çağrıldı");
    }

    public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }
}
