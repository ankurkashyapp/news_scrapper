package com.kashapps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsRestController {

    @RequestMapping("/message")
    public String getMessage() {
        return "Helloooo News Scrapper";
    }
}
