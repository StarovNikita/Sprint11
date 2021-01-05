package com.sprint11.Sprint11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CreateTaskController {

    @GetMapping("/create-task")
    public String greeting(Model model) {
        return "create-task";
    }

}