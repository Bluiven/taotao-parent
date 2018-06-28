package com.taotao.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Bluiven
 * @date 2018-06-06 23:26
 */
@Controller
@RequestMapping("page")
public class PageController {

    @GetMapping(value = "{pageName}")
    public String toPage(@PathVariable("pageName") String pageName){
        return pageName;
    }
}
