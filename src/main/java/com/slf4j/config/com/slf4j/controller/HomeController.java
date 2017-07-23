package com.slf4j.config.com.slf4j.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jotaiwan on 22/07/2017.
 */
@Controller
@RequestMapping(value="/")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home() {

        logger.trace("1. trace");
        logger.debug("2. debug");
        logger.info("3. info");
        logger.warn("4. warn");
        logger.error("5. error");
        return "home";

    }
}
