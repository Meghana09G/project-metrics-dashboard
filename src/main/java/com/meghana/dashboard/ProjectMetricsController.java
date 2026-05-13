package com.meghana.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectMetricsController {

    @GetMapping("/")
    public String dashboard() {
        return "index";
    }
}