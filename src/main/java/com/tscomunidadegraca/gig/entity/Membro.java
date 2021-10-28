package com.tscomunidadegraca.gig.entity;

import com.tscomunidadegraca.gig.enums.FuncaoMinisterial;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    private String naturalidade;

    @Column(nullable = false)
    private String estado_civil;

    private String nome_conjuge;

    private String nome_pai;

    private String nome_mae;

    private String grau_escolaridade;

    private String profissao;

    @Column(nullable = false)
    private String endereco;

    private String cidade;

    private String cep;

    private Boolean batizado_aguas;

    private FuncaoMinisterial funcaoMinisterial = FuncaoMinisterial.MEMBRO;

    private Boolean batizado_Espirito_Santo;


    private LocalDate data_nascimento;

}
