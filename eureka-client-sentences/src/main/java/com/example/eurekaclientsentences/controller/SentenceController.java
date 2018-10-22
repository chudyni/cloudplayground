package com.example.eurekaclientsentences.controller;

import com.example.eurekaclientsentences.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by marcin.bracisiewicz
 */
@RestController
public class SentenceController {

    //Replaced by load ballanced RestTemplate - Ribbon
//    @Autowired
//    private DiscoveryClient discoveryClient;

    //Replaced by Feign
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private WordService wordService;

    @GetMapping("/sentence")
    public String getSentence() {
        return new StringBuilder()
//                .append(this.getWord("EUREKA-CLIENT-SUBJECT"))
                .append(this.wordService.getSubject())
                .append(" ")
//                .append(this.getWord("EUREKA-CLIENT-VERB"))
                .append(this.wordService.getVerb())
                .append(" ")
//                .append(this.getWord("EUREKA-CLIENT-NOUN"))
                .append(this.wordService.getNoun())
                .append(".")
                .toString();
    }

//    private String getWord(final String serviceName) {
//        return this.restTemplate.getForObject(String.format("http://%s", serviceName), String.class);
//    }

//    private String getWord(final String com.example.eurekaclientsentences.service) {
//        final List<ServiceInstance> clients = this.discoveryClient.getInstances(com.example.eurekaclientsentences.service);
//        if(clients != null && clients.size() > 0) {
//            final URI uri = clients.get(0).getUri();
//            if(uri != null) {
//                return (new RestTemplate()).getForObject(uri, String.class);
//            }
//        }
//        return null;
//    }

}
