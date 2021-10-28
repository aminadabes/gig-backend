package com.tscomunidadegraca.gig.controller;

import com.tscomunidadegraca.gig.entity.Membro;
import com.tscomunidadegraca.gig.message.MensagemResposta;
import com.tscomunidadegraca.gig.service.MembroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Object findAll() {
        List<Membro> membroList = membroService.findAll();
        if (membroList.isEmpty()) {
            return MensagemResposta.builder().mensagem("SEM_REGISTRO").build();
        } else {
            return MensagemResposta.builder().mensagem(membroList.toString()).build();
        }
    }

    @GetMapping("/membros/{id}")
    public Object findById(@PathVariable(value = "id") Long id) {
        Optional<Membro> membro = membroService.findById(id);
        if (!membro.isPresent()) {
            return MensagemResposta.builder().mensagem("Membro não encontrado!!!").build();
        } else {
            return MensagemResposta.builder().mensagem(membro.get().getNome()).build();
        }
    }

    @PostMapping("/membros")
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemResposta save(@RequestBody Membro membro) {
        Membro novoMembro = membroService.save(membro);
        return MensagemResposta.builder().mensagem("O "+novoMembro.getNome() + " salvo com sucesso!!!").build();
    }


}
