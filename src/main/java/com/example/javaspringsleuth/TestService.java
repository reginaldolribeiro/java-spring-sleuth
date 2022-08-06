package com.example.javaspringsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private Tracer tracer;

    private static Logger log = LoggerFactory.getLogger(TestController.class);
//    private final DemoClient demoClient;

//    public TestService(DemoClient demoClient) {
//        this.demoClient = demoClient;
//    }

    public void test() throws InterruptedException {
        log.info("Test service...");
        Span newSpan = tracer.nextSpan().name("CustomSpan2").start();
        try (Tracer.SpanInScope ws = tracer.withSpan(newSpan.start())) {
            newSpan.tag("customkey", "banana");
            MDC.put("customkey", "banana");
            Thread.sleep(1000L);
            log.info("Span2!");
//            String response = demoClient.getApi();
//            log.info("Response DemoApi: " + response);
        } finally {
            newSpan.end();;
        }

        log.info("Span1");
    }


}
