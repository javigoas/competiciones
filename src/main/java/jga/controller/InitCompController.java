package jga.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Init compe")
public class InitCompController {

    @Operation(summary = "Inicia una compe")
    @ApiResponse(responseCode = "200", description = "Compe creada")
    @PostMapping("/{division}")
    public ResponseEntity startCompetition(@PathVariable("division") Integer division) {
        System.out.print("Hola division " + division );
        return null;
    }
}
