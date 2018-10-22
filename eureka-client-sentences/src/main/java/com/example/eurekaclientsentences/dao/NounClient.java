package com.example.eurekaclientsentences.dao;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by marcin.bracisiewicz
 */
@FeignClient("eureka-client-noun")
public interface NounClient {

    @GetMapping("/")
    String getWord();
}
