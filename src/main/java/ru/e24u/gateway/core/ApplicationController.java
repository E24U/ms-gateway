package ru.e24u.gateway.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApplicationController {

    @GetMapping("/")
    public ApplicationDto pages() {
        return new ApplicationDto();
    }

    @GetMapping("/admin")
    public ApplicationDto page(@PathVariable String pageId) {
        return new ApplicationDto();
    }
}
