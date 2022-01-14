package com.example.demo.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokerServiceImpl implements JokerService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
