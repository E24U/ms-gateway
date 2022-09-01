package ru.e24u.gateway.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @GetMapping("/user/{uuid}")
    public String user(@PathVariable UUID uuid) {
        return "Hello world: " + uuid.toString();
    }
}