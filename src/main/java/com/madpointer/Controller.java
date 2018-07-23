package com.madpointer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api(value = "Superhero name controller", description = "Example description")
class Controller {

    private String superHeroName;

    @GetMapping
    @ApiOperation(value = "Get superhero name", notes = "Very important  note")
    String getSuperHeroName() {
        return this.superHeroName;
    }

    @PostMapping("/{superHeroName}")
    @ApiOperation(value = "Set superhero name", notes = "Very important note")
    void setSuperHeroName(@PathVariable String superHeroName) {
        this.superHeroName = superHeroName;
    }
}
