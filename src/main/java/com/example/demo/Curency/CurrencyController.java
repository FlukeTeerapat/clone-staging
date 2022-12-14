package com.example.demo.Curency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class CurrencyController {  private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @GetMapping(value = "/getcurrency")
    public List<Currency> getCurrency(){
        return currencyService.getCurrency();

    }

    @GetMapping(value = "/getcurrency2")
    public List<Currency> getCurrency2(){
        return currencyService.getCurrency();

    }
    @GetMapping(value = "/")
    public String home(){
        return "Home";
    }
    //currency controller
}
