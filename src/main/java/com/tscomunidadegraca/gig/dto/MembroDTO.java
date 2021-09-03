package com.tscomunidadegraca.gig.dto;

import com.tscomunidadegraca.gig.enums.FuncaoMinisterial;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MembroDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    private String telefone;

    private String naturalidade;

    @NotEmpty
    @Column(nullable = false)
    private String estado_civil;

    private String nome_conjuge;

    private String nome_pai;

    private String nome_mae;

    private String grau_escolaridade;

    private String profissao;

    @NotEmpty
    @Column(nullable = false)
    private String endereco;

    private String cidade;

    private String cep;

    private Boolean batizado_aguas;

    private FuncaoMinisterial funcaoMinisterial;

    private Boolean batizado_Espirito_Santo;

    private LocalDate data_nascimento;
}
