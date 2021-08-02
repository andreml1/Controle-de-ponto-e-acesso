package com.dio.controle.de.ponto.e.acesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long id;
    private String descricao;
}
