package de.pan.todofrontend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.pan.todofrontend.model.Fusballkarten;
import de.pan.todofrontend.service.BackendService;

@Controller
public class FusballkartenWebController {
    private static final Logger log = LoggerFactory.getLogger(FusballkartenWebController.class);

    private final BackendService backendService;

    public FusballkartenWebController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/todos")
    public String todoItemList(Model model) {
        log.info("Received GET request on /todos. Serving fusballkarten.html");
        model.addAttribute("todo", new Fusballkarten("","",""));
        model.addAttribute("todos", backendService.getFusballkarten());
        return "fusballkarten";
    }

    @PostMapping("/todos")
    public String createTodoItem(Model model, @ModelAttribute("todo") Fusballkarten fusballkarten) {
        log.info("Received POST request on /todos with todo(spielername: {}, manschaft: {}, position: {}", fusballkarten.getSpielername(), fusballkarten.getManschaft(), fusballkarten.getPosition());
        backendService.createFusballkarten(fusballkarten);
        log.info("Redirecting to /todos");
        return "redirect:/todos";
    }
}

