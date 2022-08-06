package com.example.javaspringsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private static Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService service;

    @GetMapping
    public String hello() throws InterruptedException {
//        System.out.println("Hello world!");
        log.info("Chamando hello endpoint");
        service.test();
        return "Hello world";
    }
}
