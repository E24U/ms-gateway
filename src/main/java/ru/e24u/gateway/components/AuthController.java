package ru.e24u.gateway.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("api/v1")
public class AuthController {

    @GetMapping("/auth")
    public String auth(@RequestParam String name, @RequestParam char[] pass) {
        return String.format("Hello user: %s, pass: %s", name, Arrays.toString(pass));
    }
}