package org.codenova.spring.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
    RequestMappingHandelrMapping 을 쓰게 되면 HttpRequestHandler 라는 interface 를 토대로 만들면 안됨.
    POJO (Plain Old Java Object) 형태로 Handler를 정의 내리면 되.
 */
@Controller
public class IndexController {


    @RequestMapping({"/" , "/index"})
    public ModelAndView indexHandle() {
        System.out.println("IndexHandler.index");

    //    ModelAndView mav = new ModelAndView();
    //    mav.setViewName("index");

        ModelAndView mav = new ModelAndView("indexView");
        mav.addObject("msg", "HEllo Spring");   // req.setAttribute ..
        mav.addObject("numbers", new int[]{11,2,3,4} );

        return mav;
    }

    @RequestMapping("/help")
    public void helpHandle() {
        System.out.println("IndexHandler.help");
    }

}


