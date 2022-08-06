package com.example.javaspringsleuth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://localhost:8081")
public interface DemoClient {

    @GetMapping(path = "/api")
    String getApi();

}

/*@FeignClient(name = "core", url = "${core.url}", configuration = {ContractDecoder.class, ContractClientErrorDecoder.class})
public interface ContractClient {

    @PostMapping(path = "/ceu/v1/contratos/", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    ContractResponse create(@RequestBody ContractRequest contractRequest);
}*/
