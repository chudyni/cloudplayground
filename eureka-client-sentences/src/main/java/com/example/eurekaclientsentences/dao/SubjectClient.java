package com.example.eurekaclientsentences.dao;

import com.example.eurekaclientsentences.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by marcin.bracisiewicz
 */
@FeignClient("EUREKA-CLIENT-SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
//    Word getWord();
    String getWord();
}
