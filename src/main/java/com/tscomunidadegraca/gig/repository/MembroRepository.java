package com.tscomunidadegraca.gig.repository;

import com.tscomunidadegraca.gig.entity.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long> {
}
