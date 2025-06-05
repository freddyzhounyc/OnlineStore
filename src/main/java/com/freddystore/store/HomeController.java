package com.freddystore.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // called when a request is at the root of the website
    @RequestMapping("/") // url pattern for dependency
    public String index() {
        return "index.html"; // name of the view to be returned to the browser
    }
}
