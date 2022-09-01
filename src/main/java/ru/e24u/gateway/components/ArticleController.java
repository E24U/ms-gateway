package ru.e24u.gateway.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ArticleController {

    @GetMapping("/article/{id}")
    public void getArticle(@PathVariable Long id) {
        throw new UnsupportedOperationException(String.format("Not implemented, id %s", id));
    }
}