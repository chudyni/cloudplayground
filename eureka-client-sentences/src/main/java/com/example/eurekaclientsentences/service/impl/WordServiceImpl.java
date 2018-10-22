package com.example.eurekaclientsentences.service.impl;

import com.example.eurekaclientsentences.dao.NounClient;
import com.example.eurekaclientsentences.dao.SubjectClient;
import com.example.eurekaclientsentences.dao.VerbClient;
import com.example.eurekaclientsentences.model.Word;
import com.example.eurekaclientsentences.service.WordService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.concurrent.Executor;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private Executor executor;

    @Autowired
    private SubjectClient subjectClient;

    @Autowired
    private VerbClient verbClient;

    @Autowired
    private NounClient nounClient;

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    public String getSubject() {
        return this.subjectClient.getWord();
    }

//    @Override
//    @HystrixCommand(fallbackMethod = "getFallbackSubject")
//    public Observable<Word> getSubject() {
//        return Observable.fromCallable(
//                () -> new Word(this.subjectClient.getWord().getValue())
//        ).subscribeOn(Schedulers.from(this.executor));
//    }

    @Override
    public String getVerb() {
        return this.verbClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackNoun")
    public String getNoun() {
        return this.nounClient.getWord();
    }

//    private Word getFallbackSubject() {
//        return new Word("Someone");
//    }

    private String getFallbackSubject() {
        return "Someone";
    }

    private String getFallbackNoun() {
        return "";
    }
}
