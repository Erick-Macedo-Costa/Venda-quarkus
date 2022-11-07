package com.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static java.util.Objects.requireNonNull;


@Entity
public class Cliente extends AbstractEntity {
    @NotNull @NotBlank
    public String nome;

    @Email
    @NotBlank
    @Column(unique = true, nullable = false)
    public String email;

    @NotBlank
    @CPF
    @Column(unique = true, nullable = false)
    public String cpf;

    public void setEmail(final String email) {
        this.email = requireNonNull(email).trim().toLowerCase();
    }
}
