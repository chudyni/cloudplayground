package com.example.eurekaclientverb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcin.bracisiewicz
 */
@RestController
public class VerbController {

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public String getWord() {
        final String[] wordsArray = this.words.split(",");
        final int selected = (int) Math.round(Math.random() * (wordsArray.length - 1));
        return wordsArray[selected];
    }

}
