package com.onlinetest.oauthclient.controller;

import com.onlinetest.oauthclient.domain.Balance;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.math.BigDecimal;
import java.security.Principal;

@Controller
public class WebController {

    @ApiIgnore
    @RequestMapping("/securedPage")
    public String securedPage(Model model, Principal principal) {
        return "securedPage";
    }

    @ApiIgnore
    @RequestMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }

    @GetMapping(path = "/api/{accountNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Balance checkSaldoResponse(@PathVariable Long accountNumber) {

        return Balance.builder()
                .accountNumber(accountNumber)
                .balance(BigDecimal.valueOf(10000L))
                .customerNumber(1234567L)
                .build();
    }
}