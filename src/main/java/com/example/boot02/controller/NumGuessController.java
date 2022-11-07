package com.example.boot02.controller;

import com.example.boot02.bean.NumberGuessBean;
import com.example.boot02.service.NumGuessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class NumGuessController {

    // NumberGuessBean numberGuessBean = new NumberGuessBean();
    @Resource
    NumGuessService numberGuessService;

    @GetMapping("/numguess")
    public String numGuess(@RequestParam(value = "guess", required = false) String guess,
                           Model model) {

        NumberGuessBean numberGuessBean = numberGuessService.numGuess(guess);
        model.addAttribute("numguess", numberGuessBean);
        return "numGuess";
    }
}
