package com.tp5.tp5v2;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.rmi.ServerException;
import java.util.Optional;

@Controller
@CrossOrigin("*")
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

    @PostMapping(path="/instrumento")
    public ResponseEntity<?> insertInstrument(@RequestBody Instrumento i){
        try{
            instrumentoRepository.save(i);
            return ResponseEntity.ok(i);
        }catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }

    @PutMapping(path="/instrumento/{id}")
    public ResponseEntity<?> updateInstrument(@RequestBody Instrumento i){
        if (instrumentoRepository.findById(i.getId()).isPresent()){
            try{
                instrumentoRepository.save(i);
                return ResponseEntity.ok(i);
            }catch (Exception e) {
                e.getStackTrace();
            }
        }else{
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @DeleteMapping(path="/instrumento/{id}")
    public ResponseEntity<?> deleteInstrument(@PathVariable Integer id){
       try{
           Optional<Instrumento> ins = instrumentoRepository.findById(id);
            if (instrumentoRepository.findById(id).isPresent()){
                    instrumentoRepository.delete(ins.get());
                    return ResponseEntity.ok(id);
            }else {
                return ResponseEntity.notFound().build();
            }
        }catch (Exception e) {
            e.getStackTrace();
           return null;
        }
    }
}
