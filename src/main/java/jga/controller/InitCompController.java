package jga.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitCompController {

    @PostMapping("/{division}")
    public ResponseEntity startCompetition(@PathVariable("division") Integer division) {
        return null;
    }
}
