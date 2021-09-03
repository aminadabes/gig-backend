package com.tscomunidadegraca.gig.service;

import com.tscomunidadegraca.gig.entity.Membro;
import com.tscomunidadegraca.gig.repository.MembroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MembroService {

    MembroRepository membroRepository;

    public List<Membro> findAll(){
        return  membroRepository.findAll();
    }

    public Optional<Membro> findById(Long id) {
        return  membroRepository.findById(id);
    }

    public Membro save(Membro membro){
        return membroRepository.save(membro);
    }

    public void delete(Membro membro){
        membroRepository.delete(membro);
    }
}
