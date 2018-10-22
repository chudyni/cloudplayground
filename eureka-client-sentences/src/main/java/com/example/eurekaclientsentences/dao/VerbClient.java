package com.example.eurekaclientsentences.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by marcin.bracisiewicz
 */
@FeignClient("EUREKA-CLIENT-VERB")
public interface VerbClient {

    @GetMapping("/")
    String getWord();
}
