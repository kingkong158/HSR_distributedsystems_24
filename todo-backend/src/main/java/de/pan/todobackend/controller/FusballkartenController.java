package de.pan.todobackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.pan.todobackend.model.Fusballkarten;
import de.pan.todobackend.repository.FusballkartenRepository;

@RestController
public class FusballkartenController {
    private static final Logger log = LoggerFactory.getLogger(FusballkartenController.class);

    private FusballkartenRepository fusballkartenRepository;

    public FusballkartenController(FusballkartenRepository fusballkartenRepository) {
        this.fusballkartenRepository = fusballkartenRepository;
    }

    @GetMapping("/todo")
    public Iterable<Fusballkarten> getAllFusballkarten(){
        return this.fusballkartenRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Fusballkarten> getFusballkartenByName(@PathVariable Integer id){
        var fusballkarte = this.fusballkartenRepository.findById(id).orElse(null);

        if(fusballkarte == null){
            return ResponseEntity.notFound().build(); 
        }
        
        return ResponseEntity.ok().body(fusballkarte);
    }

    @PostMapping("/todo")
    public ResponseEntity<Fusballkarten> postFusballkarten(@RequestBody Fusballkarten fusballkarte){
        var createdFusballkarte = this.fusballkartenRepository.save(fusballkarte);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFusballkarte);

    }

    /*
    @PutMapping("/todo/{id}/{name}")
    public ResponseEntity<Fusballkarten> UpdateFusballkarten(@PathVariable Integer id, @PathVariable String name ){
       var existingFusballkarte = this.fusballkartenRepository.findById(id).orElse(null);

       if(existingFusballkarte == null){
            return ResponseEntity.notFound().build();
       }

       existingFusballkarte.setFusballkarte(name);
       this.fusballkartenRepository.save(existingFusballkarte);
       return ResponseEntity.ok().body(existingFusballkarte);
    }*/

    @DeleteMapping("/todo/{id}")
    public ResponseEntity<Fusballkarten> deleteFusballkarte(@PathVariable Integer id){
        var existingFusballkarte = this.fusballkartenRepository.findById(id).orElse(null);

        if(existingFusballkarte == null){
            return ResponseEntity.notFound().build();
        }
        
        this.fusballkartenRepository.delete(existingFusballkarte);
        return ResponseEntity.ok().build();
    }
}
