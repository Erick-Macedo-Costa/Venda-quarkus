package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Entity
public class Produto extends AbstractEntity {
    @Column(unique = true, nullable = false)
    @NotBlank
    public String descricao;

    @NotNull
    @ManyToOne
    public Categoria categoria;

    @NotNull
    @Positive
    public double preco;
}
