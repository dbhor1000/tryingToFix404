package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/check/")
    public String initialMessage() {

        return ("Приложение запущено. :)");

    }
}
