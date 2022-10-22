package com.example.boot02.service;

import com.example.boot02.bean.NumberGuessBean;
import org.springframework.stereotype.Service;

@Service
public class NumGuessService {
    NumberGuessBean numberGuessBean = new NumberGuessBean();
    public NumberGuessBean numGuess(String guess) {
        if (numberGuessBean.getSuccess()) {
            numberGuessBean.reset();
        }
        if (guess == null) {
            numberGuessBean.reset();
        }
        if (guess != null) {
            numberGuessBean.setGuess(guess);
        }
        return numberGuessBean;
    }
}
