package com.qf.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: DHC
 * Date: 2018/5/22
 * Time: 15:33
 * Version:V1.0
 */
@Controller
public class ManagerIndexAction {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
