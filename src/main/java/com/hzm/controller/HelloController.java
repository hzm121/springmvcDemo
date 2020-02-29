package com.hzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : hzm
 * @date : 2020-02-29 18:24
 */
@Controller
public class HelloController {
    /**
     * 返回的值会根据视图解析器解析得到实际的物理视图，然后做转发操作（所以会被servlet再拦截一次，这次应该让Tomcat的DefaultServlet去拦截）
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String Hello(String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
