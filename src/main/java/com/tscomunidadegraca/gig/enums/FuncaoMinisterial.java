package com.tscomunidadegraca.gig.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FuncaoMinisterial {

    PASTOR("Pastor"),
    EVANGELISTA("Evangelista"),
    PRESBÍTERO("Presbítero"),
    DIACONO("Diácono"),
    LIDER_CRIANCAS("Líder de Crianças"),
    LIDER_JOVENS("Líder de Jovens"),
    LIDER_ADOLESCENTES("Líder de Adolescentes"),
    LIDER_MULHERERES("Líder de Mulheres"),
    MINISTERIO_CASAIS("Líder de Casais"),
    VISITAS("Visitas / Socorro"),
    LIDER_LOUVOR("Líder de Louvor"),
    MEMBRO("Membro");

    private final String description;

}
