package ru.e24u.gateway.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PageController {

    @GetMapping("/pages")
    public List<String> pages() {
        return List.of();
    }

    @GetMapping("/pages/{pageId}")
    public List<Object> page(@PathVariable String pageId) {
        return List.of();
    }
}