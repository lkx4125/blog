package com.lrm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-29 21:10
 * @Description : 描述
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
