package com.zephycode.webapp_api.styles;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/styles")
public class StylesController {

    private final StylesRepo repo;

    public StylesController(StylesRepo repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getStyleById(@PathVariable String id) {
        return repo.findById(id)
                .map(styles -> ResponseEntity
                        .ok()
                        .contentType(MediaType.valueOf("text/css"))
                        .body(styles.getCssContent()))
                .orElse(ResponseEntity.notFound().build());
    }

}
