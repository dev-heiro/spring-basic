package org.codenova.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parking")
public class ParkingController {

    @RequestMapping("/form")
    public String formHandle() {

        return "parking/form";
    }

    @RequestMapping("/calculate")
    public String calculateHandle(@RequestParam("car") String car,
                                  @RequestParam("minutes") int minutes,
                                  @RequestParam("purchase") int purchase,
                                  Model model) {



        return "parking/calculate";
    }
}
