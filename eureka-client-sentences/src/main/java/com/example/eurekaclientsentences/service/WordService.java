package com.example.eurekaclientsentences.service;

import com.example.eurekaclientsentences.model.Word;
import rx.Observable;

/**
 * Created by marcin.bracisiewicz
 */
public interface WordService {

//    Observable<Word> getSubject();
    String getSubject();
    String getVerb();
    String getNoun();
}
