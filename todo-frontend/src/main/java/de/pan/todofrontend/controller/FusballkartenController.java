package de.pan.todofrontend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todofrontend.model.Fusballkarten;
import de.pan.todofrontend.service.BackendService;

@RestController
public class FusballkartenController {
    private BackendService backendService;

    public FusballkartenController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/items")
    public List<Fusballkarten> getFusballkarten() {
        return backendService.getFusballkarten();
    }

    @GetMapping("/create")
    public Fusballkarten createFusballkarten() {
        return backendService.createFusballkarten(new Fusballkarten("AlexChrisJoerg", "METI", "JEDEPosition"));
    }
}
