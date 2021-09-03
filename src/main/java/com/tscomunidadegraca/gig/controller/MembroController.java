package com.tscomunidadegraca.gig.controller;

import com.tscomunidadegraca.gig.entity.Membro;
import com.tscomunidadegraca.gig.service.MembroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MembroController {

    MembroService membroService;

    @GetMapping("/membros")
    @ResponseStatus(HttpStatus.OK)
    public List<Membro> findAll(){
        return membroService.findAll();
        /*if(membroList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }*/
    }

    @GetMapping("/membros/{id}")
    public ResponseEntity<Membro> findById(@PathVariable(value = "id") Long id){
        Optional<Membro> membro = membroService.findById(id);
        if(!membro.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PostMapping("/membros")
    public ResponseEntity<Membro> saveLive(@RequestBody Membro membro) {
        /*live.setRegistrationDate(LocalDateTime.now());*/
        return new ResponseEntity<Membro>(membroService.save(membro), HttpStatus.CREATED);
    }

    @DeleteMapping("/membros/{id}")
    public ResponseEntity<?> deleteLive(@PathVariable(value="id") long id) {
        Optional<Membro> liveO = membroService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            membroService.delete(liveO.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    /*@PutMapping("/membros/{id}")
    public ResponseEntity<Membro> updateLive(@PathVariable(value="id") long id,
                                                   @RequestBody  Membro membro) {
        Optional<Membro> liveO = membroService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            Membro.setId(liveO.get().getId());
            return new ResponseEntity<Membro>(membroService.save(Membro), HttpStatus.OK);
        }
    }*/
}
