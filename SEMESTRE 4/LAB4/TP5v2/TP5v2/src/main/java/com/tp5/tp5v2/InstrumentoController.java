package com.tp5.tp5v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class InstrumentoController {

    @Autowired
    private InstrumentoRepository instrumentoRepository;

    @GetMapping(path="/instrumentos")
    public ResponseEntity<?> getAllInstruments(){
        Iterable<Instrumento> i = instrumentoRepository.findAll();
        if (i == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(i);
        }
    }

    @GetMapping(path="/instrumento/{id}")
    public ResponseEntity<?> getInstrumentById(@PathVariable Integer id){
        Optional<Instrumento> i = instrumentoRepository.findById(id);
        if (i == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(i);
        }
    }

}
