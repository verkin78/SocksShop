package com.example.socksshop.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerFirst {

    @GetMapping("/")
    public String start() {
        return "Приложение запущено";
    }


    @GetMapping("/info")
    public String wellcome() {
        return "Добро пожаловать в интернет магазин \n" +
                "за покупкой лучших носков!\\n\" +" +
                "Склад открыт.";
    }
}