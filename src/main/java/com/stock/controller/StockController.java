package com.stock.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StockController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(StockController.class);

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String welcome(ModelMap map) {
    map.addAttribute("message" , "welcome");
        logger.debug("testing messaqge " );
    return "index";
    }

}
